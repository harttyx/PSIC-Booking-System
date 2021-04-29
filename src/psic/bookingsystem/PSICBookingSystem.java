/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Hart Praise
 */
// dev
public class PSICBookingSystem {
    
    static Scanner input = new Scanner(System.in);
    
    static final int NUMBER_OF_PHYSICIANS = 5;
    static final int NUMBER_OF_PATIENTS = 15;
    
    static String visitorName;
    static Patient patient;
    
    static Physician[] physiciansList = new Physician[NUMBER_OF_PHYSICIANS];
    static Patient[] patientsList = new Patient[NUMBER_OF_PATIENTS];
    static Treatment[] treatmentsList = new Treatment[20];
    static ArrayList<Appointment> appointmentList = new ArrayList<>();
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
    
        createTreatments();
        
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
    
    //CREATE TREATMENTS FOR EACH PHYSICIAN
    private static void createTreatments() {
        
        treatmentsList[0] = new Treatment(1, "Neural mobilisation", physiciansList[0], "Sunday 2nd May 2021, 10:00-12:00", "Medical Suite A");
        treatmentsList[1] = new Treatment(2, "Mobilisation of the spine and joints", physiciansList[0], "Tueday 4th May 2021, 10:00-12:00", "Medical Suite C");
        treatmentsList[2] = new Treatment(3, "Massage", physiciansList[0], "Monday 10th May 2021, 10:00-12:00", "Massage Room A");
        treatmentsList[3] = new Treatment(4, "Acupuncture", physiciansList[0], "Thurday 20th May 2021, 10:00-12:00", "Acupuncture Room B");
        
        treatmentsList[4] = new Treatment(5, "Pool rehabilitation", physiciansList[1], "Monday 3rd May 2021, 13:00-15:00", "Pool Room C");
        treatmentsList[5] = new Treatment(6, "Neural mobilisation", physiciansList[1], "Wednesday 5th May 2021, 13:00-15:00", "Medical Suite B");
        treatmentsList[6] = new Treatment(7, "Mobilisation of the spine and joints", physiciansList[1], "Tuesday 11th May 2021, 13:00-15:00", "Medical Suite A");
        treatmentsList[7] = new Treatment(8, "Massage", physiciansList[1], "Friday 21st May 2021, 13:00-15:00", "Massage Room B");
        
        treatmentsList[8] = new Treatment(9, "Acupuncture", physiciansList[2], "Tuesday 3rd May 2021, 14:00-16:00", "Acupuncture Room A");
        treatmentsList[9] = new Treatment(10, "Pool rehabilitation", physiciansList[2], "Wednesday 5th May 2021, 14:00-16:00", "Pool Room A");
        treatmentsList[10] = new Treatment(11, "Neural mobilisation", physiciansList[2], "Monday 10th May 2021, 14:00-16:00", "Medical Suite B");
        treatmentsList[11] = new Treatment(12, "Mobilisation of the spine and joints", physiciansList[2], "Monday 17th May 2021, 14:00-16:00", "Medical Room A");
        
        treatmentsList[12] = new Treatment(13,"Massage", physiciansList[3], "Sunday 2nd May 2021, 10:00-12:00", "Massage Room A");
        treatmentsList[13] = new Treatment(14, "Acupuncture", physiciansList[3], "Sunday 9th May 2021, 9:00-11:00", "Acupuncture Room C");
        treatmentsList[14] = new Treatment(15, "Pool rehabilitation", physiciansList[3], "Wednesday 12th May 2021, 9:00-11:00", "Pool Room A");
        treatmentsList[15] = new Treatment(16, "Neural mobilisation", physiciansList[3], "Thurday 20th May 2021, 9:00-11:00", "Medical Suite C");
        
        treatmentsList[16] = new Treatment(17, "Mobilisation of the spine and joints", physiciansList[4], "Saturday 8th May 2021, 8:00-10:00", "Medical Room B");
        treatmentsList[17] = new Treatment(18, "Massage", physiciansList[4], "Monday 10th May 2021, 8:00-10:00", "Massage Room A");
        treatmentsList[18] = new Treatment(19, "Acupuncture", physiciansList[4], "Thursday 13th May 2021, 8:00-10:00", "Acupuncture Room B");
        treatmentsList[19] = new Treatment(20, "Pool rehabilitation", physiciansList[4], "Wednesday 19th May 2021, 8:00-10:00", "Pool Room C");
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
    private static void listPatients() {
        for (int i = 0; i < NUMBER_OF_PATIENTS; i++) {
            System.out.println(patientsList[i].toString());
        }
    }
    
    //LIST ALL PHYSICIANS DETAILS
    private static void listPhysicians() {
        for (int i = 0; i < NUMBER_OF_PHYSICIANS; i++) {
            System.out.println(i+1 + ". " + physiciansList[i].toString());
        }
    }
    
    //LIST PHYSICIAN TREATMENT
    private static Treatment[] listPhyTreatments(String physicianId) {
        Treatment[] physicianTreatments = {};
        int check = 0;    
        do {
            try {
                Integer.parseInt(physicianId);
                for (Physician physiciansList1 : physiciansList) {
                    if (physiciansList1.getId() == Integer.parseInt(physicianId)) {
                        physicianTreatments = getPhysicianTreatments(physiciansList1);
                        check = 1;
                        break;
                    }
                }
            }
            catch(NumberFormatException e) {
                
            }
        } while (check == 0);
        for (int i = 0; i < physicianTreatments.length; i++) {
            System.out.println((i+1) + ". " +physicianTreatments[i].toString());
        }
        return physicianTreatments;
    }
    
    //GET PHYSICIAN BY EXPERTISE
    private static Physician[] getPhysicianByExp(int index) {
        int count = 0;
        for (Physician physiciansList1 : physiciansList) {
                String[] phyExpertise = physiciansList1.getExpertise();
                for (String expertise1: phyExpertise) {
                    if (expertise1 == null ? expertiseList[index].getFieldOfExpertise() == null : expertise1.equals(expertiseList[index].getFieldOfExpertise())) {
                        count++;
                        break;
                    }
                }
        }
        Physician[] physicians = new Physician[count];
        count = 0;
        for (Physician physiciansList1 : physiciansList) {
                String[] phyExpertise = physiciansList1.getExpertise();
                for (String expertise1: phyExpertise) {
                    if (expertise1 == null ? expertiseList[index].getFieldOfExpertise() == null : expertise1.equals(expertiseList[index].getFieldOfExpertise())) {
                        physicians[count] = physiciansList1;
                        count++;
                        break;
                    }
                }
        }
        return physicians;
    }
    
    //SHOW PHYSICIAN BY EXPERTISE
    private static void showPhysicianByExpertise(int index) {
        Physician[] physicians;
        boolean phyLoop = true;
        boolean badInput = true;
        
        do {
            physicians = getPhysicianByExp(index);
            for (int i = 0; i < physicians.length; i++) {
                System.out.println(i+1 + ". " + physicians[i].toString());
            }
            System.out.println("0. Back to previous menu");
            System.out.println("Select a Physician from the options above to view his/her available consultation hours");
            
            do {
                String option = input.nextLine();
                
                switch(option) {
                    case "0":
                        badInput = false;
                        phyLoop = false;
                        break;
                    case "1":
                         
                    default:
                        break;
                }
            } while (badInput);
        } while (phyLoop);
    }
    
    //VIEW ALL AREAS OF EXPERTISE
    private static void listAreasOfExpertise() {
        System.out.println("\n");
        for (int i = 0; i < expertiseList.length; i++) {
            System.out.println(i+1 + ". " + expertiseList[i].toString());
        }
    }
    
    //VIEW TREATMENTS
    private static void viewTreatments(String physicianId) {
        boolean badInput = true;
        Treatment[] physicianTreatments;
        
        System.out.println("\n");
        physicianTreatments = listPhyTreatments(physicianId);
        System.out.println("0. Back to previous menu");
        System.out.println("Select a Treatment from the list above to book");

            do {
                String name = input.nextLine();
                if (name.equals("0")) {
                    badInput = false;
                    break;
                }
                for (int i = 0; i < physicianTreatments.length; i++) {
                    if (name.equals("" + (i+1))) {
                        badInput = false;
                        bookTreatment(physicianTreatments[i]);
                        break;
                    }
                }
                
            } while(badInput);
    }
    
    //BOOK TREATMENTS
    private static void bookTreatment(Treatment treatment) {
        for (Treatment treatmentsList1 : treatmentsList) {
            if (treatmentsList1.getId() == treatment.getId()) {
                if (treatmentsList1.isBooked()) {
                    System.out.println("This treatment has already been booked. Press any key to try another treatment");
                    input.nextLine();
                } else {
                    treatmentsList1.setBooked(true);    
                    Appointment appointment = new Appointment(patient, treatmentsList1);
                    appointmentList.add(appointment);
                    appointment.bookedSuccessfully();
                    System.out.println("\n0. Back to main menu");
                    boolean badInput = true;
                    
                    do {   
                        String back = input.nextLine();
                        
                        switch(back) {
                            case "0":
                                badInput = false;
                                patientLogin();
                                break;
                            default:
                                break;
                        }
                    } while(badInput);
                    
                }
                break;
            }
        }
    }
    
    //GET TREATMENTS BASED ON PHYSICIAN
    private static Treatment[] getPhysicianTreatments(Physician physician) {
        Treatment[] physicianTreatments = new Treatment[4];
        int count = 0;
        for (Treatment treatmentsList1 : treatmentsList) {
            if (treatmentsList1.getPhysician() == physician) {
                physicianTreatments[count] = treatmentsList1;
                count++;
            }
        }
        return physicianTreatments;
    }
    
    //VIEW PHYSICIAN BY EXPERTISE
    private static void viewPhysicianByExpertise() {
        boolean expertiseLoop = true;
        boolean badInput = true;
        
        do{
            listAreasOfExpertise();
            System.out.println("0. Back to previous menu");
            System.out.println("Select an area of Expertise from the options above to view Physicians in that area");

            do {
                String expertise = input.nextLine();

                switch (expertise) {
                    case "0":
                        badInput = false;
                        expertiseLoop = false;
                        break;
                    case "1":
                        badInput = false;
                        showPhysicianByExpertise(0);
                        break;
                    case "2":
                        badInput = false;
                        showPhysicianByExpertise(1);
                        break;
                    case "3":
                        badInput = false;
                        showPhysicianByExpertise(2);
                        break;
                    default:
                        break;
                }
            } while(badInput);
        } while(expertiseLoop);
    }
    
    //VIEW PHYSICIAN BY NAME
    private static void viewPhysicianByName() {
        boolean nameLoop = true;
        System.out.println("\n");
        
        do{
            listPhysicians();
            System.out.println("0. Back to previous menu");
            nameLoop = false;
        } while(nameLoop);
    }
    
    //VISITOR LOGIN
    private static void visitor() {
        boolean badInput = true;
        boolean visitorLoop = true;
        
        do {
        System.out.println("\nWelcome to PSIC Visitor Portal. Kindly select an option from the menu below");
        System.out.println("1. Search for Physician by Expertise");
        System.out.println("2. Search for Physician by Name");
        System.out.println("3. Logout");
        
        do {
            String option = input.nextLine();
            
            switch(option){
                case "1":
                    viewPhysicianByExpertise();
                    badInput = false;
                    break;
                case "2":
                    viewPhysicianByName();
                    badInput = false;
                    break;
                case "3":
                    System.out.println("Logging " + visitorName + " out.....");
                    visitorName = "";
                    badInput = false;
                    visitorLoop = false;
                    break;
                default:
                    break;
            }
        }while(badInput);
        }while(visitorLoop);

    }
    
    //PATIENT LOGIN
    private static void patientLogin() {
        boolean badInput = true;
        boolean visitorLoop = true;
        
        do {
        System.out.println("\nWelcome to PSIC Patient Portal. Kindly select an option from the menu below");
        System.out.println("1. Book Appointment");
        System.out.println("2. Attend an Appointment");
        System.out.println("3. Cancel an Appointments");
        System.out.println("4. View my Appointments");
        System.out.println("5. Logout");
        
        do {
            String option = input.nextLine();
            
            switch(option){
                case "1":
                    bookAppointment();
                    badInput = false;
                    break;
                case "2":
                    viewUnattendedAppointment(false);
                    badInput = false;
                    break;
                case "3":
                    viewUnattendedAppointment(true);
                    badInput = false;
                    break;
                case "4":
                    myAppointments();
                    badInput = false;
                    break;
                case "5":
                    System.out.println("Logging " + patient.getFullName() + " out.....");
                    visitorName = "";
                    badInput = false;
                    visitorLoop = false;
                    startApp();
                    break;
                default:
                    break;
            }
        }while(badInput);
        }while(visitorLoop);
        
    }
    
    //BOOK APPOINTMENT BY PHYSICIAN NAME
    private static void bookByPhysicianByName() {
        boolean nameLoop = true;
        boolean badInput = true;
        System.out.println("\n");
        
        do{
            listPhysicians();
            System.out.println("0. Back to previous menu");
            System.out.println("Select a Physician from the list above to view his/her treatments available");

            do {
                String name = input.nextLine();

                switch (name) {
                    case "0":
                        badInput = false;
                        nameLoop = false;
                        break;
                    case "1":
                        viewTreatments(name);
                        badInput = false;
                        break;
                    case "2":
                        viewTreatments(name);
                        badInput = false;
                        break;
                    case "3":
                        viewTreatments(name);
                        badInput = false;
                        break;
                    case "4":
                        viewTreatments(name);
                        badInput = false;
                        break;
                    case "5":
                        viewTreatments(name);
                        badInput = false;
                        break;
                    default:
                        break;
                }
            } while(badInput);
        } while(nameLoop);
    }
    
    //ATTEND APPOINTMENT
    private static void attendAppointment(ArrayList<Appointment> appointment) {
        boolean badInput = true;
        System.out.println("0. Back to previous menu");
        System.out.println("Select the appointment you wish to attend by inputing the number");
        do {
        String opt = input.nextLine();
        
        for (int i = 0; i < appointment.size(); i++) {
            if((i+1 + "").equals(opt)) {
                badInput = false;
                for (int j = 0; j < appointmentList.size(); j++) {
                    Appointment appointm = appointmentList.get(j);
                    if (appointm == appointment.get(i)) {
                        appointm.setAttended(true);
                        System.out.println("-----------------------------------------------"
                                + "\nYou have successfully attended this appointment\n"
                                + "-----------------------------------------------");
                        break;
                    }
                }
                break;
            }
            
            if ("0".equals(opt)) {
                badInput = false;
            }
        }
        } while(badInput);
    }
    
    //CANCEL APPOINTMENT
    private static void cancelAppointment(ArrayList<Appointment> appointment) {
        boolean badInput = true;
        System.out.println("0. Back to previous menu");
        System.out.println("Select the appointment you wish to cancel by inputing the number");
        do {
            String opt = input.nextLine();
            for (int i = 0; i < appointment.size(); i++) {
                if((i+1 + "").equals(opt)) {
                    badInput = false;
                    for (int j = 0; j < appointmentList.size(); j++) {
                        Appointment appointm = appointmentList.get(j);
                        if (appointm == appointment.get(i)) {
                            appointm.setCancelled(true);
                            for (Treatment treatmentsList1 : treatmentsList) {
                                if (treatmentsList1.getId() == appointm.getTreat().getId()) {
                                    treatmentsList1.setBooked(false);
                                    break;
                                }
                            }
                            System.out.println("-----------------------------------------------"
                                    + "\nYou have successfully cancelled this appointment\n"
                                    + "-----------------------------------------------");
                            break;
                        }
                    }
                    break;
                }
            }            
            if ("0".equals(opt)) {
                badInput = false;
            }
        } while(badInput);
    }
    
    //VIEW ALL PATIENTS APPOINTMENTS
    private static void myAppointments() {
        if (appointmentList.size() > 0) {
            ArrayList<Appointment> appointments = new ArrayList<>();
            for (int i = 0; i < appointmentList.size(); i++) {
                Appointment appointment1 = appointmentList.get(i);
                Patient p = appointment1.getPerson();
                if (p.getFullName().equals(patient.getFullName())) {
                    appointments.add(appointment1);
                }
            }
            if (appointments.size() > 0) {
                System.out.println("------------------------------------------------------------"
                + "\nHere's a list of all your appointments");
                for (int i = 0; i < appointments.size(); i++) {
                    System.out.println(i+1 + ". " + appointments.get(i).toString() 
                            + "Attended: " + appointments.get(i).isAttended()
                            + "\nCancelled: " + appointments.get(i).isCancelled() + "\n"
                    );
                }
                System.out.println("\nPress any key to go back");
                input.nextLine();
                
            } else {
                System.out.println("You have no appointments booked, kindly book an appointment before you can view it.");               
            }
            
            
        } else {
            System.out.println("You have no appointments booked, kindly book an appointment before you can view it.");
        }
    }
    
    //VIEW UNATTENDED APPOINTMENTS
    private static void viewUnattendedAppointment(boolean cancel) {
        if (appointmentList.size() > 0) {
            ArrayList<Appointment> appointments = new ArrayList<>();
            for (int i = 0; i < appointmentList.size(); i++) {
                Appointment appointment1 = appointmentList.get(i);
                Patient p = appointment1.getPerson();
                if (p.getFullName().equals(patient.getFullName())) {
                    if (!appointment1.isAttended() && !appointment1.isCancelled()) {
                        appointments.add(appointment1);
                    }
                }
            }
            if (appointments.size() > 0) {
                System.out.println("------------------------------------------------------------"
                + "\nHere are your upcoming appointments that you're yet to attend");
                for (int i = 0; i < appointments.size(); i++) {
                    System.out.println(i+1 + ". " + appointments.get(i).toString());
                }
                if (cancel) {
                    cancelAppointment(appointments);
                } else {
                    attendAppointment(appointments);
                }
                
            } else {
                System.out.println("You have no appointment that's yet to be attended...");
            }
            
            
        } else {
            System.out.println("You have no appointment that's yet to be attended...");
        }
    }
    
    //BOOK APPOINTMENT
    private static void bookAppointment() {
        boolean nameLoop = true;
        boolean badInput = true;
        System.out.println("\n");
        
        do{
            System.out.println("1. View Physicians to see their specific treatments offered");
            System.out.println("0. Back to previous menu");
            System.out.println("Select an option above to proceed");

            do {
                String option = input.nextLine();

                switch (option) {
                    case "0":
                        badInput = false;
                        nameLoop = false;
                        break;
                    case "1":
                        bookByPhysicianByName();
                        badInput = false;
                        break;
                    default:
                        break;
                }
            } while(badInput);
        } while(nameLoop);
    }

    //START APPLICATION
    private static void startApp() {
        boolean systemLoop = true;
        boolean badInput = true;
        
        do {
            System.out.println("\nWelcome to PSIC Booking System. Kindly select an option from the menu below");
            System.out.println("1. Login as a Visitor");
            System.out.println("2. Login as a Patient");
            System.out.println("3. Register as a new Patient");
            System.out.println("4. Generate Report-1");
            System.out.println("5. Generate Report-2");
            System.out.println("6. Exit\n");

            do {
                String selectedOption = input.nextLine();

                switch (selectedOption) {
                    case "1":
                        badInput = false;                   
                        System.out.println("\nKindly Enter your name");
                        visitorName = input.nextLine();
                        visitor();
                        break;
                    case "2":
                        badInput = false;
                        System.out.print("\n");
                        listPatients();
                        boolean valid = false;
                        String patId;
                        do {
                            System.out.println("Kindly select a patient from the list above to use");
                            patId = input.nextLine();
                            for (Patient patients1: patientsList) {
                                try {
                                    if (Integer.parseInt(patId) == patients1.getId()) {
                                        patient = patients1;
                                        valid = true;
                                        patientLogin();
                                    }
                                }catch (NumberFormatException e) {
                                    
                                }
                            }
                        } while(!valid);
                        break;
                    case "3":
                        badInput = false;
                        registerNewPatient();
                        break;
                    case "4":
                        badInput = false;
                        break;
                    case "5":
                        badInput = false;
                        break;
                    case "6":
                        badInput = false;
                        systemLoop = false;
                        System.out.println("Exiting System.....");
                        System.out.println("Thanks for using PSIC Booking System.");
                        break;
                    default: 
                        break;
                }

             } while(badInput);
        } while(systemLoop);
        System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        autoCreatePatientsAndPhysicians();
        startApp();
//        autoCreatePatientsAndPhysicians();
//        registerNewPatient();
//        listPhysicians();
//        viewTreatments();
    }
    
}
