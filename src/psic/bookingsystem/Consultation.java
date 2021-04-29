/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

import java.time.LocalDateTime;

/**
 *
 * @author Hart
 */
public class Consultation {
    
    private Physician physician;
    private String visitorName;
    private LocalDateTime dt;
    
    public Consultation(Physician physician, String visitorName) {
        this.setPhysician(physician);
        this.setVisitorName(visitorName);
        this.setDt(LocalDateTime.now());
    }

    /**
     * @return the physician
     */
    public Physician getPhysician() {
        return physician;
    }

    /**
     * @param physician the physician to set
     */
    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    /**
     * @return the visitorName
     */
    public String getVisitorName() {
        return visitorName;
    }

    /**
     * @param visitorName the visitorName to set
     */
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    /**
     * @return the dt
     */
    public LocalDateTime getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }
    
}
