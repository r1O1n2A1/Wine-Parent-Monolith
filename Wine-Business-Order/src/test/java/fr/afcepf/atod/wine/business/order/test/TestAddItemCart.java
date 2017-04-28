package fr.afcepf.atod.wine.business.order.test;

import java.util.Date;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.PaymentInfo;
import fr.afcepf.atod.wine.entity.Product;
import fr.afcepf.atod.wine.entity.ShippingMethod;

public class TestAddItemCart {
    /**
     * Mock avec EasyMock pour le daoCustomer.
     */
    private IDaoOrder mock;
    /**
     * CAS NOMINAL
     * Le panier correspondant à la commande.
     */
    private Order orderNominal;
    /**
     * CAS NOMINAL
     * Retour attendu lors de l'ajout au panier dans une commande.
     */
    private Order orderNominalExpected;
    /**
     * CAS NOMINAL
     * Pour l'ajout d'un produit dans le panier.
     */
    private Product productNominal;
    /**
     * Constructor for tests.
     */
    public TestAddItemCart(){
        orderNominal = new Order(null,new Date(), new Date(), new ShippingMethod(), new Customer(), new PaymentInfo());
        orderNominalExpected = new Order(1,new Date(), new Date(), new ShippingMethod(), new Customer(), new PaymentInfo());
        mock = EasyMock.createMock(IDaoOrder.class);
    }
    
    @Test
    public void newOrderTestNominal() throws WineException {
        EasyMock.expect(mock.insertObj(orderNominal)).andReturn(orderNominalExpected);
        EasyMock.replay(mock);
        Assert.assertNotNull(orderNominal);
        Assert.assertNotNull(orderNominalExpected);
        Assert.assertNotNull(orderNominalExpected.getId());
        Assert.assertNotNull(orderNominalExpected.getPaidAt());
    }
}
