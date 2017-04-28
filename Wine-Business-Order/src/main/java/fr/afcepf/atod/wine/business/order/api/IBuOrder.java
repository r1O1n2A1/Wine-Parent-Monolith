
package fr.afcepf.atod.wine.business.order.api;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.Product;

/**
 * Interface pour les règles de gestion associé à
 * la commande dans l'application.
 * @author ronan - metabeen
 */
public interface IBuOrder {
    /**
     * Méthode d'ajout de {@link Product} dans une {@link Order}.
     * @param order l'objet {@link Order} associé au panier du client.
     * @param product l'objet {@link Product} associé à l'ajout dans le panier.
     * @return un objet {@link Order} mis à jour.
     * @throws WineException 
     * <ul>
     * <li>L'objet ajouté dans le panier n'est plus disponible en stock.</li>
     * </ul>
     */
    Order addItemCart(Order order, Product product) throws WineException;
    /**
     * Méthode d'ajout d'un {@link Order} dans l'unité de persistence.
     * @param order l'objet {@link Order} à ajouter.
     * @return l'objet {@link Order} ajouté dans la base. 
     * @throws WineException
     * <ul>
     * <li>L'unité de persistence est indisponible.</li>
     * </ul>
     */
    Order addNewOrder(Order order) throws WineException; 
    /**
     * Méthoder permettant la récupération de la dernière commande
     * du client.
     * @param customer le {@link Customer} dont on souhaite
     * récupérer la {@link Order}.
     * @return un {@link Order} de l'unité de persistence.
     */
    Order getLastOrderByCustomer(Customer customer) throws WineException; 
    /**
     * Methode qui appelle le W.S paypal
     * @param order {@link Order}
     * @param shipping price shipping
     * @param total price total
     * @return
     * @throws WineException
     */
    String checkoutPaypal(Order order, double shipping, double total) 
    		throws WineException;
    
    /**
     * @param order {@link Order}
     * @param total order
     * @return
     * @throws WineException {@link WineException}
     */
    String checkoutShipping(Customer customer, Order order, double total) 
    		throws WineException;
    
    /**
     * Methode appelant l'orchestrateur
     * @param idProduit
     * @param quantite
     * @param idShipping
     * @param idPayment
     * @throws WineException
     */
    void lastCheck(Integer idProduit, Integer quantite, String idShipping, String idPayment) throws WineException;
}
