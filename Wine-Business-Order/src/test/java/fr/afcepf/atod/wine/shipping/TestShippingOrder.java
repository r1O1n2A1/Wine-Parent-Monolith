package fr.afcepf.atod.wine.shipping;

import java.util.HashSet;
import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.business.order.api.IBuOrder;
import fr.afcepf.atod.wine.business.order.impl.BuOrder;
import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.entity.Adress;
import fr.afcepf.atod.wine.entity.City;
import fr.afcepf.atod.wine.entity.Civility;
import fr.afcepf.atod.wine.entity.Country;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.OrderDetail;
import fr.afcepf.atod.wine.entity.Product;
import fr.afcepf.atod.wine.entity.Region;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class TestShippingOrder {
	private static Logger logger = Logger.getLogger(TestShippingOrder.class);
	@Configuration
	static class BusinessServiceTestContextConfiguration {
		@Bean
		public IBuOrder buOrder() {
			return new BuOrder();
		}
		@Bean
		public IDaoOrder daoOrder() {
			return Mockito.mock(IDaoOrder.class);
		}
	}
	@Autowired
	private IBuOrder buOrder;
	@Autowired
	private IDaoOrder daoOrder;
	private Order nominal;
	private double total = 22501.0;
	private Customer customer;
	private static int min = 100000000;
	private static int max = 1000000000;
	
	public TestShippingOrder() {
		nominal = new Order();
		Random rand = new Random();
		nominal.setId(rand.nextInt((max - min) + 1) + min);
		nominal.setOrdersDetail(new HashSet());
		nominal.getOrdersDetail().add(new OrderDetail(null, 2, nominal,
				new Product(null, "romane", (double) 11250, "romanee conti")));
		Adress adress = new Adress();
		City city = new City(null, "22200", "Guingamp",
				new Region(null, "Bretagne", new Country(null, "France")));
		adress.setCity(city);
		adress.setNumber("2");
		adress.setStreet("rue de la paix");
		customer = new Customer();
		customer.setAdress(adress);
		customer.setCivility(Civility.MR);
		customer.setFirstname("Ronan");
		customer.setLastname("Bond");
	}
	
	@Test
	public void testRedirectShippingApp() throws WineException {
		buOrder.checkoutShipping(customer,nominal, total);
	}
}
