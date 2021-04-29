/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

/**
 *
 * @author Hart
 */
public class Expertise {
    
    private String fieldOfExpertise;
    
    public Expertise(String expertise) {
        this.setFieldOfExpertise(expertise);
    }
    
    public Expertise() {
    }

    /**
     * @return the fieldOfExpertise
     */
    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    /**
     * @param fieldOfExpertise the fieldOfExpertise to set
     */
    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }
    
    @Override
    public String toString() {
        return fieldOfExpertise;
    }
    
}
