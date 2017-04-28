package fr.afcepf.atod.wine.data.order.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.atod.vin.data.exception.WineErrorCode;
import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.entity.Adress;
import fr.afcepf.atod.wine.entity.Civility;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.PaymentInfo;
import fr.afcepf.atod.wine.entity.ShippingMethod;

/**
 * Test class for the database access of a {@link Order} 
 * @author ronan
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/springDataTest.xml")
public class TestDaoOrder {
	private static Logger logger = Logger.getLogger(TestDaoOrder.class);
	@Autowired
	private IDaoOrder daoOrder;
	private Customer nominal;
	private Customer customerNull;
	private Order expected;
	private WineException expectedException;
	private static int ID_EXPECTED = 2;
	
	/**
	 * should be done with a test database
	 * NOT PROD
	 * you can duplicate a database with the command below:
	 * mysqldump -uroot -p@bandito22 wine_bdd | mysql -uroot -p@bandito22 wine_bdd_test
	 * if the wine_bdd_test is not existing yet, you have to create it beforehand 
	 * Note: vu que ce mot de passe est connu de tous, je vais le changer ahaha
	 */
	@Before
	public void init() {
		//    	String path = Thread.currentThread().getContextClassLoader()
		//		.getResource("./createBdd.sh").getPath();
		//try {
		//	Process proc = Runtime.getRuntime().exec(path);
		//	proc.waitFor();
		//} catch (Exception e) {
		//	logger.error(e.getMessage());
		//}
	}

	public TestDaoOrder() {
		expectedException = new WineException(WineErrorCode.RECHERCHE_NON_PRESENTE_EN_BASE,
				"mail  or password invalid");
		Adress adress = new Adress(1, "rue de rivoli", "18", false, null);
		try {
			Date dateCustomer = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-09-20 10:01:51");	
			Date dateOrderCreated = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-03-23 17:44:04");
			Date dateOrderPaid = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-03-23 17:19:37");
			nominal = new Customer(ID_EXPECTED,
					"Wang",
					"Fen", 
					dateCustomer, 
					"fenwang@hotmail.com", 
					"fenwang@hotmail.com", 
					"test1234", 
					"0666666666", 
					dateCustomer, 
					dateCustomer, 
					Civility.MISS, 
					adress, 
					true);
			customerNull = new Customer(null,
					"Wang",
					"Fen", 
					dateCustomer, 
					"fenwang@hotmail.com", 
					"fenwang@hotmail.com", 
					"test1234", 
					"0666666666", 
					dateCustomer, 
					dateCustomer, 
					Civility.MISS, 
					adress, 
					true);
			expected = new Order(1,
					dateOrderCreated,
					dateOrderPaid,
					new ShippingMethod(null, ""),
					nominal,
					new PaymentInfo());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Test
	public void testGetLastOrderNominal() throws WineException {
		System.out.println(nominal.getId());
		Order retour = daoOrder.getLastOrderByCustomer(nominal);
		Assert.assertNotNull(retour);
		Assert.assertEquals(retour.getCustomer().getLogin(), expected.getCustomer().getLogin());
		Assert.assertEquals(retour.getId(), expected.getId());
		
	}
	
	@Test
	public void testGetLastOrderError() {
		try {
			daoOrder.getLastOrderByCustomer(customerNull);
		} catch(WineException e) {
			Assert.assertEquals(e.getErreurVin(),
					expectedException.getErreurVin());
		}
	}

}
