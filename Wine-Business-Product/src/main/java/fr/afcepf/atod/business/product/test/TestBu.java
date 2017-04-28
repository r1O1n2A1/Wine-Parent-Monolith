package fr.afcepf.atod.business.product.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod.business.product.api.IBuProduct;
import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.entity.ProductType;
import fr.afcepf.atod.wine.entity.ProductVarietal;
import fr.afcepf.atod.wine.entity.ProductVintage;
import fr.afcepf.atod.wine.entity.ProductWine;
import java.util.Map;
/**
 * Class g�n�r�e pour r�aliser les tests.
 *TODO R�aliser les tests unitaires.
 * @author Metabeen
 *
 */
public class TestBu {
	/**
	 * Logger de log 4j pour les codes d'erreur.
	 */
	private static Logger log = Logger.getLogger(TestBu.class);
	/**
	 * Point d'entr�e de l'application pour les tets.
	 * @param args Inutile dans ce contexte.
	 * @throws WineException
	 */
	public static void main(String[] args) throws WineException {
		@SuppressWarnings("resource")
		BeanFactory bf = new ClassPathXmlApplicationContext("classpath:springBuProduct.xml");

		IBuProduct buProductbis = (IBuProduct) bf.getBean(IBuProduct.class);

		List<ProductType> wineTypes = buProductbis.getWineTypes();
		//List<ProductVintage> vintages = buProductbis.findProductsByVintage(2010);

		Map<ProductType, List<String>> appellations= buProductbis.getAppellationsByType(wineTypes);
		Map<ProductType, Map<Integer,Integer>> prices= buProductbis.getPricesRepartitionByType(wineTypes);

		log.info( prices.get(wineTypes.get(0)));
		/*List<ProductWine> wines = null;
		 *log.info(wineTypes);
		 *log.info(appellations.get(wineTypes.get(0)));
		 *wines = buProductbis.categoryAccordingToObjectType(wineTypes.get(0), appellations.get(wineTypes.get(0)).get(0),0,5);
		 *for (ProductWine wine : wines) {
		 *log.info("\t # wine: " + wine.getName());
        }*/

		/*for (ProductVintage vintage : vintages) {
		 *   for (ProductType type : wineTypes) {
		 *       try {
		 *           wines = buProductbis.categoryAccordingToObjectType(type, vintage,0,5);
		 *       } catch (Exception e) {
		 *
		 *      for (ProductWine wine : wines) {
		 *          log.info("\t # wine: " + wine.getDescription());
		 *      }
		 *   }
        }*/

	}

}
