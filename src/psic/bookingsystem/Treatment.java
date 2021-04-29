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
public class Treatment {
    private String name;
    private Physician physician;
    private int id;
    private String period;
    private String room;
    private boolean booked;
    
    public Treatment(int id, String name, Physician physician, String period, String room) {
        this.setId(id);
        this.setName(name);
        this.setRoom(room);
        this.setPeriod(period);
        this.setPhysician(physician);
        this.setBooked(false);
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
    public String getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
    
    @Override
    public String toString() {
        return name + "\nPhysician: " + physician.getFullName() + "\nTime: " + period + "\nRoom: " + room + "\n";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the booked
     */
    public boolean isBooked() {
        return booked;
    }

    /**
     * @param booked the booked to set
     */
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    
}
