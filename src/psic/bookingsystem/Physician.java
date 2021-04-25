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
public class Physician {
    private int id;
    private String fullName;
    private String address;
    private String phoneNumber;
    private String[] expertise;
    
    public Physician(int id, String name, String address, String phoneNo, String[] expertise){
        this.setId(id);
        this.setFullName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNo);
        this.setExpertise(expertise);
    }
    
    public Physician() {  
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
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the expertise
     */
    public String[] getExpertise() {
        return expertise;
    }

    /**
     * @param expertise the expertise to set
     */
    public void setExpertise(String[] expertise) {
        this.expertise = expertise;
    }
}
