package fr.afcepf.atod.wine.data.util;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
/**
 * by Roronoa
 */
@Entity
public class ProductAccessoriesDTO extends ProductDTO implements Serializable {
        
    // -------- Constructors ----------- //
    
    /**
     * Default constructor
     */
    public ProductAccessoriesDTO() {
    }

    public ProductAccessoriesDTO(Integer id, String name, Double price, 
            String description, Date createdAt) {
        super(id, name, price, description);
    }

   

        
}