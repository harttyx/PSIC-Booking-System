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
    private Patient person = new Patient();
    private Treatment treat = new Treatment();
    private boolean attended;
    private boolean cancelled;
    
    public Appointment() {
        
    }
    
}
