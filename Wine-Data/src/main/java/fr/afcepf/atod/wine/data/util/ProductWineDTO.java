package fr.afcepf.atod.wine.data.util;
import java.io.Serializable;

import javax.persistence.Entity;

/**
 * by roronoa
 */
@Entity
public class ProductWineDTO extends ProductDTO implements Serializable {
    /**
     * size columns
     */
    private static final int MAX_SIZE = 50;
  
    /**
     * appellation
     */
    private String appellation;
    
    /**
     * apiId
     */
    private Integer apiId;
    /**
     * imagesUrl
     */
    private String imagesUrl;
    /**
     * product type
     */
    private Integer idProductType;
    
    /**
     * product vintage
     */
    private Integer idProductVintage;

    /**
     * varietal
     */
    private Integer idProductVarietal;

    // --------- Constructors ---------- //
    
    /**
     * Default constructor
     */
    public ProductWineDTO() {
    }
    
    /**
     * 
     * @param id
     * @param name
     * @param price
     * @param description
     * @param appellation
     * @param vintage
     * @param productType
     * @param productVarietal
     * @param region 
     */
    public ProductWineDTO(Integer id, String name, Double price,
    				   String description, String appellation,
                       Integer productType, Integer productVarietal, 
                       Integer productVintage, Integer apiId) {
        super(id, name, price, description);
        this.appellation = appellation;
        this.idProductType = productType;
        this.idProductVarietal = productVarietal;
        this.apiId = apiId;
    }
        
    // ------- Getters && Setters --------//

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }
    
    
	public Integer getApiId() {
		return apiId;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
	}
	
	public String getImagesUrl() {
		return imagesUrl;
	}

	public void setImagesUrl(String imagesUrl) {
		this.imagesUrl = imagesUrl;
	}

	
	public Integer getIdProductType() {
		return idProductType;
	}

	public void setIdProductType(Integer idProductType) {
		this.idProductType = idProductType;
	}

	public Integer getIdProductVintage() {
		return idProductVintage;
	}

	public void setIdProductVintage(Integer idProductVintage) {
		this.idProductVintage = idProductVintage;
	}

	public Integer getIdProductVarietal() {
		return idProductVarietal;
	}

	public void setIdProductVarietal(Integer idProductVarietal) {
		this.idProductVarietal = idProductVarietal;
	}

	@Override
	public String toString() {
		return "ProductWine [appellation=" + appellation + ", productType=" + idProductType
				+ ", productVarietal=" + idProductVarietal + ", id=" + idProduct + ", name=" + name
				+ ", price=" + price + ", description=" + description + ", Urls=" + imagesUrl + "]";
	}    
    
    
    
}