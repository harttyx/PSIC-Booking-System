/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

import java.util.Scanner;

/**
 *
 * @author Hart Praise
 */
// dev
public class PSICBookingSystem {
    
    static Scanner input = new Scanner(System.in);
    static final int NUMBER_OF_PHYSICIANS = 5;
    static final int NUMBER_OF_PATIENTS = 16;
    static Physician[] physiciansList = new Physician[NUMBER_OF_PHYSICIANS];
    static Patient[] patientsList = new Patient[NUMBER_OF_PATIENTS];
    static Expertise[] expertiseList = new Expertise[3];
    
    //CREATE PHYSICIANS AND 15 PRE-REGISTERED PATIENTS FOR TESTING
    private static void autoCreatePatientsAndPhysicians() {
        expertiseList[0] = new Expertise("Physiotherapy");
        expertiseList[1] = new Expertise("Osteopathy");
        expertiseList[2] = new Expertise("Rehabilitation");
        
        String[] phy1Expertise = {expertiseList[0].toString(), expertiseList[1].toString()};
        String[] phy2Expertise = {expertiseList[2].toString(), expertiseList[1].toString()};
        String[] phy3Expertise = {expertiseList[0].toString(), expertiseList[2].toString()};
        String[] phy4Expertise = {expertiseList[1].toString(), expertiseList[0].toString()};
        String[] phy5Expertise = {expertiseList[1].toString(), expertiseList[2].toString()};
        
        physiciansList[0] = new Physician(1, "Dr Haasan Dua", "23 Chilterns, Hatfield", "+447789876343", phy1Expertise);
        physiciansList[1] = new Physician(2, "Dr Vetra jen", "21 Chilterns, Hatfield", "+447789773883", phy2Expertise);
        physiciansList[2] = new Physician(3, "Dr Kazeem Yusuf", "22 Chilterns, Hatfield", "+447733221124", phy3Expertise);
        physiciansList[3] = new Physician(4, "Dr Stone", "24 Chilterns, Hatfield", "+447228974803", phy4Expertise);
        physiciansList[4] = new Physician(5, "Dr Hart Lucky", "25 Chilterns, Hatfield", "+447022989223", phy5Expertise);
    
        patientsList[0] = new Patient(1, "Chris Rock", "72 Haloway Str, Lekki", "+447866822131");
        patientsList[1] = new Patient(2, "Victor Efedi", "71 Haloway Str, Lekki", "+447833294433");
        patientsList[2] = new Patient(3, "Susan Pwajok", "70 Haloway Str, Lekki", "+447888903372");
        patientsList[3] = new Patient(4, "Henry Smith", "73 Haloway Str, Lekki", "+447822909938");
        patientsList[4] = new Patient(5, "Chukwuemeka Favor", "23 Haloway Str, Lekki", "+447822909883");
        patientsList[5] = new Patient(6, "Rowe Stone", "18 Haloway Str, Lekki", "+447990877281");
        patientsList[6] = new Patient(7, "Hart Praise", "1 Haloway Str, Lekki", "+440093889877");
        patientsList[7] = new Patient(8, "Aworeni Dapo", "39 Haloway Str, Lekki", "+448890087899");
        patientsList[8] = new Patient(9, "Emeka Okwe", "34 Haloway Str, Lekki", "+440022933844");
        patientsList[9] = new Patient(10, "Visha Priya", "45 Haloway Str, Lekki", "+440092283348");
        patientsList[10] = new Patient(11, "Kazim Tarif", "46a Haloway Str, Lekki", "+449339909930");
        patientsList[11] = new Patient(12, "Faith Ali", "49 Haloway Str, Lekki", "+447799019928");
        patientsList[12] = new Patient(13, "Diana Eneje", "52 Haloway Str, Lekki", "+449894490449");
        patientsList[13] = new Patient(14, "Amy Okoli", "6 Haloway Str, Lekki", "+447722343098");
        patientsList[14] = new Patient(15, "Dwayne Wade", "7b Haloway Str, Lekki", "+447009984431");
    }
    
    //ADD NEW PATIENT
    private static void registerNewPatient() {
        String patientName;
	String patientAddress;
	String patientPhoneNo;
        
        System.out.println("Enter your Name: ");
	patientName = input.nextLine();
        
        System.out.println("Enter your Address: ");
	patientAddress = input.nextLine();
        
        System.out.println("Enter your Phone Number: ");
	patientPhoneNo = input.nextLine();
        
        patientsList[15] = new Patient(patientsList.length, patientName, patientAddress, patientPhoneNo);
        System.out.println("\n------------------------------------------------------------------ "
                + "\n" + patientName + " has been registered successfully, you can now proceed\n");
    }
    
    //LIST ALL REGISTERED PATIENTS
    public static void listPatients() {
        for (int i = 0; i < NUMBER_OF_PATIENTS; i++) {
            System.out.println(patientsList[i].toString());
        }
    }
    
    //LIST ALL PHYSICIANS DETAILS
    public static void listPhysicians() {
        for (int i = 0; i < NUMBER_OF_PHYSICIANS; i++) {
            System.out.println(physiciansList[i].toString());
        }
    }
    
    //VIEW ALL AREAS OF EXPERTISE
    public static void listAreasOfExpertise() {
        for (int i = 0; i < expertiseList.length; i++) {
            System.out.println(i+1 + ": " + expertiseList[i].toString());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        autoCreatePatientsAndPhysicians();
        registerNewPatient();
        listPhysicians();
        listAreasOfExpertise();
    }
    
}
