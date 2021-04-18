/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

import java.util.Date;

/**
 *
 * @author Hart
 */
public class Treatment {
    private String name;
    private Physician physician;
    private Date period;
    private Room room;
    
    public Treatment(String name, Physician physician, Date period, Room room) {
        this.setName(name);
        this.setRoom(room);
        this.setPeriod(period);
        this.setPhysician(physician);
    }
    
    public Treatment() {
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the period
     */
    public Date getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(Date period) {
        this.period = period;
    }

    /**
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
    }
    
}
