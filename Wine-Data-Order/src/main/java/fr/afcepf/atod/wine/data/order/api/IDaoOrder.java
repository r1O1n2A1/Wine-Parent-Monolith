package fr.afcepf.atod.wine.data.order.api;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.data.api.IDaoGeneric;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import java.util.List;


/**
 * Services to access the database for an {@link Order}
 * @author ronan
 */
public interface IDaoOrder extends IDaoGeneric<Order, Integer> {

    /**
     * Get all the orders for a customer
     * @param customer {@link Customer}
     * @return List of {@link Order}
     * @throws WineException {@link WineException}
     */
    List<Order> getAllOrdersByCustomer(Customer customer) throws WineException;

    /**
     * Get back the last order of a customer
     * @param customer {@link Customer}
     * @return {@link Order}
     */
    Order getLastOrderByCustomer(Customer customer) throws WineException;

    /**
     * Get back customer's orders
     *
     * @param idCustumer {@link Integer}
     * @return {@link Customer}
     * @throws WineException {@link WineException}
     */
    Customer ordersCustomerById(Integer idCustumer) throws WineException;

}
