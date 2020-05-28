package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    private static TheSystem apptSystem = new TheSystem();
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    private static final DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    public static void main(String[] args) {
        Date createdDate = new Date();
        LocalDateTime appointmentDateTime = LocalDateTime.of(2020,6,14,10,34);


        startMessage();
        Appointment newAppointment1 = Appointment.bookAppointment("John","Sam York","213-324-5566",dateFormat.format(createdDate), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(appointmentDateTime),"arrived",4);
//        Appointment newAppointment2 = Appointment.bookAppointment("John","Winsley Horan","213-789-3454",dateOne,dateOne,"cancel",5);
//        Appointment newAppointment3 = Appointment.bookAppointment("Tim","Danny Oska","271-342-4432",dateOne,dateOne,"scheduled",5);
//        Appointment newAppointment4 = Appointment.bookAppointment("John","Joy Nathon","334-712-3354",dateOne,dateOne,"scheduled",8);

        apptSystem.addNewAppointment(newAppointment1);
//        apptSystem.addNewAppointment(newAppointment2);
//        apptSystem.addNewAppointment(newAppointment3);
//        apptSystem.addNewAppointment(newAppointment4);

        // Print out the appointment list
        apptSystem.printAppointmentList();
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
}
