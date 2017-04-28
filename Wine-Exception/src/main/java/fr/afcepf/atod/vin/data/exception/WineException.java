/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.afcepf.atod.vin.data.exception;

/**
 * Exceptions personnalisees pour notre projet
 * @author ronan
 */
public class WineException extends Exception {
    /**
     * erreur generique dans l'enumeration
     */
    private WineErrorCode erreurVin;
    
    /**
     * 
     * @param message 
     */
    public WineException(String message){
        super(message);
    }
    /**
     * 
     * @param erreurVin
     * @param message 
     */
    public WineException(WineErrorCode erreurVin, String message) {
        super(message);
        this.erreurVin = erreurVin;
    }
    

    public WineErrorCode getErreurVin() {
        return erreurVin;
    }

    public void setErreurVin(WineErrorCode erreurVin) {
        this.erreurVin = erreurVin;
    }
}
