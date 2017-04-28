package fr.afcepf.atod.wine.paypal;

import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;
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
import fr.afcepf.atod.wine.data.order.impl.DaoOrder;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.OrderDetail;
import fr.afcepf.atod.wine.entity.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class TestBusinessOrder {
	@Configuration
	static class AccountServiceTestContextConfiguration {
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
	private double shipping = 1;
	private double total = 22501.0;
	//  case to add
	
	//constructor
	public TestBusinessOrder() {
		nominal = new Order();
		nominal.setId(1);
		nominal.setOrdersDetail(new HashSet());
		nominal.getOrdersDetail().add(new OrderDetail(null, 2, nominal,
				new Product(null, "romane", (double) 11250, "romanee conti")));
	}
	@Ignore
	@Test
	public void testCheckoutPaypal() throws WineException {
		buOrder.checkoutPaypal(nominal,shipping,total);
	}
}
