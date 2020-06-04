package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static TheSystem apptSystem = new TheSystem();
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date createdDate = new Date();
        // For testing
        LocalDate appointmentDate = LocalDate.of(2020,6,14);
        LocalTime appointmentTime = LocalTime.of(5,30);
        // For testing
        LocalDate appointmentDate1 = LocalDate.of(2020,6,4);
        LocalTime appointmentTime1 = LocalTime.of(6,00);

        // Print starting message and print menu options
        startMessage();
        menuOptions();
        int option;
        boolean quit = false;
        
        // For testing
        Appointment newAppointment1 = Appointment.bookAppointment("John","Sam York","213-324-5566",dateFormat.format(createdDate), appointmentDate, appointmentTime,"scheduled",4);
        Appointment newAppointment2 = Appointment.bookAppointment("Sanny","Winsley Horan","213-789-3454",dateFormat.format(createdDate), appointmentDate1, appointmentTime1,"cancel",5);
        Appointment newAppointment3 = Appointment.bookAppointment("Tim","Danny Oska","271-342-4432",dateFormat.format(createdDate), appointmentDate, appointmentTime,"arrived",5);
        Appointment newAppointment4 = Appointment.bookAppointment("Elina","Joy Nathon","271-342-3423",dateFormat.format(createdDate), appointmentDate, appointmentTime,"scheduled",8);
//        apptSystem.addNewAppointment(newAppointment1);
//        apptSystem.addNewAppointment(newAppointment2);
//        apptSystem.addNewAppointment(newAppointment3);
//        apptSystem.addNewAppointment(newAppointment4);
//        apptSystem.deleteAppointment(newAppointment1);
//        apptSystem.printAppointmentList();
//        apptSystem.updateAppointmentStatus(newAppointment1,"Arrived");
//        apptSystem.printAppointmentList();

        while(!quit){
            System.out.println("Enter your option: ");
             option = scanner.nextInt();
            switch (option){
                case 1:
                    // Add new appointment
                    apptSystem.addNewAppointment(newAppointment1);
                    apptSystem.addNewAppointment(newAppointment2);
                    apptSystem.addNewAppointment(newAppointment3);
                    apptSystem.addNewAppointment(newAppointment4);
                    System.out.println("Add Appointment");
                    break;
                case 2:
                    // Update an appointment status
                    System.out.println("Update Appointment Status");
                    apptSystem.updateAppointmentStatus("213-324-5566","cancel");
                    break;
                case 3:
                    // Update an appointment number of people visit
                    System.out.println("Update Appointment Number of People Visit");
                    apptSystem.updateAppointmentNumberOfVisit("213-324-5566",5);
                    break;
                case 4:
                    // Remove an appointment
                    System.out.println("Delete an Appointment");
                    apptSystem.deleteAppointment(newAppointment1);
                    break;
                case 5:
                    // Print out all the appointment list
                    System.out.println("Print out all Appointment");
                    apptSystem.printAppointmentList();
                    break;
                case 6:
                    // Print out all the appointment with status scheduled
                    System.out.println("Print out all Appointment with Status \"Scheduled\"");
                    apptSystem.printStatusScheduled();
                    break;
                case 7:
                    System.out.println("Goodbye");
                    quit = true;
                    break;
                default:
                    break;
            }
        }
    }
    public static void startMessage(){
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        String formatted = dateObj.format(dateAndTime);

        System.out.println("===============================================");
        System.out.println("Welcome to Family Restaurant Appointment System");
        System.out.println("Today Date and Time: "+formatted);
        System.out.println("===============================================");
    }

    public static void menuOptions(){
        System.out.println("Available Options: ");
        System.out.println("1:\t Add New Appointment");
        System.out.println("2:\t Update Appointment Status");
        System.out.println("3:\t Update Appointment Number of People Visit");
        System.out.println("4:\t Remove an Appointment");
        System.out.println("5:\t Print All Appointment");
        System.out.println("6:\t Print All Appointment with Status \"Scheduled\"");
        System.out.println("7:\t Quit");
    }
}
