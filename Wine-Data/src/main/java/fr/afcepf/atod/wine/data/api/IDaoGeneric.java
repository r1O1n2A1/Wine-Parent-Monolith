package fr.afcepf.atod.wine.data.api;

import java.io.Serializable;
import java.util.List;

import fr.afcepf.atod.vin.data.exception.WineException;

/**
 * @author ronan
 * API to access dataobject in the database
 * @param <Obj>
 * @param <ID>
 */
public interface IDaoGeneric<Obj,ID extends Serializable> {
	/**
	 * Insert an object
	 * @param o {@link Object}
	 * @return {@link Object}
	 * @throws WineException {@link WineException}
	 */
	Obj insertObj(Obj o) 		throws WineException;
	/**
	 * Update an object
	 * @param o {@link Object}
	 * @return {@link Boolean}
	 * @throws WineException {@link WineException}
	 */
	Boolean updateObj(Obj o)  	throws WineException;
	/**
	 * @param o {@link Object}
	 * @return {@link Boolean}
	 * @throws WineException  {@link WineException}
	 */
	Boolean removeObj(Obj o)  	throws WineException;
	/**
	 * @param id {@link Integer}
	 * @return
	 * @throws WineException
	 */
	Obj findObj(ID id) 			throws WineException;
	/**
	 * @return List<Object>
	 * @throws WineException {@link WineException}
	 */
	List<Obj> findAllObj() 		throws WineException;
}
