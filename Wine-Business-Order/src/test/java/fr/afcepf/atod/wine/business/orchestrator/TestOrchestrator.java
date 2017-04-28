package fr.afcepf.atod.wine.business.orchestrator;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class TestOrchestrator {
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
	private String idshippingOK = "1";
	private String idshippingNOK = "2";
	private String idPaymentOK = "PAY-6F871714YK1376919LD3XMVA";
	private String idPaymentNOK = "PAY-6F871714YK13769";
	private Integer idProduit = 4;
	private Integer quantiteOK = 3;
	private Integer quantiteNOK = 10;
	//  case to add
	
	@Ignore
	@Test
	public void testLastCheck() throws WineException {
		buOrder.lastCheck(idProduit, quantiteOK, idshippingOK, idPaymentOK);;
	}
	@Ignore
	@Test
	public void testLastCheckStockInsuffisant() throws WineException {
		buOrder.lastCheck(idProduit, quantiteNOK, idshippingOK, idPaymentOK);;
	}
	@Ignore
	@Test
	public void testLastCheckLivraisonKO() throws WineException {
		buOrder.lastCheck(idProduit, quantiteOK, idshippingNOK, idPaymentOK);;
	}
	@Ignore
	@Test
	public void testLastCheckPaymentNOK() throws WineException {
		buOrder.lastCheck(idProduit, quantiteOK, idshippingOK, idPaymentNOK);;
	}
}
