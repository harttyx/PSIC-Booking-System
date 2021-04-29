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
public class Appointment {
    private Patient person;
    private Treatment treat;
    private boolean attended;
    private boolean cancelled;
    
    public Appointment(Patient patient, Treatment treatment) {
        this.setAttended(false);
        this.setCancelled(false);
        this.setPerson(patient);
        this.setTreat(treatment);
    }
    
    public Appointment() {
        
    }

    /**
     * @return the person
     */
    public Patient getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Patient person) {
        this.person = person;
    }

    /**
     * @return the treat
     */
    public Treatment getTreat() {
        return treat;
    }

    /**
     * @param treat the treat to set
     */
    public void setTreat(Treatment treat) {
        this.treat = treat;
    }

    /**
     * @return the attended
     */
    public boolean isAttended() {
        return attended;
    }

    /**
     * @param attended the attended to set
     */
    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    /**
     * @return the canceled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @param cancelled the canceled to set
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    public void bookedSuccessfully() {
        System.out.println("You have successfully booked an appointment for " + treat.getName() + ".\nRoom: " + 
                treat.getRoom() + "\nTime: " + treat.getPeriod());
    }
    
    @Override
    public String toString() {
        return "Appointment: " + treat.getName() + ".\nRoom: " + 
                treat.getRoom() + "\nTime: " + treat.getPeriod();
    }
}
