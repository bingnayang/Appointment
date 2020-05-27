package com.company;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    private static TheSystem apptSystem = new TheSystem();
    public static void main(String[] args) {
        Date dateOne = new Date();

        startMessage();
        Appointment newAppointment = Appointment.bookAppointment("John","Sam York","213-324-5566",dateOne,dateOne,"scheduled",4);
        apptSystem.addNewAppointment(newAppointment);

        // Print out the appointment list
        apptSystem.printAppointmentList();
    }
    public static void startMessage(){
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formatted = dateObj.format(dateAndTime);

        System.out.println("===============================================");
        System.out.println("Welcome to Family Restaurant Appointment System");
        System.out.println("Today Date and Time: "+formatted);
        System.out.println("===============================================");
    }
}
