package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    private static TheSystem apptSystem = new TheSystem();
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {
        Date createdDate = new Date();
        LocalDate appointmentDate = LocalDate.of(2020,6,14);
        LocalTime appointmentTime = LocalTime.of(5,30);

        LocalDate appointmentDate1 = LocalDate.of(2020,6,4);
        LocalTime appointmentTime1 = LocalTime.of(6,00);

        startMessage();
        Appointment newAppointment1 = Appointment.bookAppointment("John","Sam York","213-324-5566",dateFormat.format(createdDate), appointmentDate, appointmentTime,"arrived",4);
        Appointment newAppointment2 = Appointment.bookAppointment("John","Winsley Horan","213-789-3454",dateFormat.format(createdDate), appointmentDate1, appointmentTime1,"cancel",5);
        Appointment newAppointment3 = Appointment.bookAppointment("Tim","Danny Oska","271-342-4432",dateFormat.format(createdDate), appointmentDate, appointmentTime,"scheduled",5);
        Appointment newAppointment4 = Appointment.bookAppointment("Elina","Joy Nathon","271-342-3423",dateFormat.format(createdDate), appointmentDate, appointmentTime,"scheduled",8);

        apptSystem.addNewAppointment(newAppointment1);
        apptSystem.addNewAppointment(newAppointment2);
        apptSystem.addNewAppointment(newAppointment3);
        apptSystem.addNewAppointment(newAppointment4);

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
