package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Appointment {
    private String schedulerName;
    private String customerName;
    private String customerPhoneNumber;
    private String dateCreated;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String appointmentStatus;
    private int numberOfPeopleVisit;

    public Appointment(String customerName){
        this.customerName = customerName;
    }

    public Appointment(String schedulerName, String customerName, String customerPhoneNumber, String dateCreated, LocalDate appointmentDate, LocalTime appointmentTime, String appointmentStatus, int numberOfPeopleVisit) {
        this.schedulerName = schedulerName;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.dateCreated = dateCreated;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentStatus = appointmentStatus;
        this.numberOfPeopleVisit = numberOfPeopleVisit;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public int getNumberOfPeopleVisit() {
        return numberOfPeopleVisit;
    }

    public void setNumberOfPeopleVisit(int numberOfPeopleVisit) {
        this.numberOfPeopleVisit = numberOfPeopleVisit;
    }

    public static Appointment bookAppointment(String schedulerName, String customerName, String customerPhoneNumber, String dateCreated, LocalDate appointmentDate, LocalTime appointmentTime, String appointmentStatus, int numberOfPeopleVisit){
        return new Appointment(schedulerName,customerName,customerPhoneNumber,dateCreated,appointmentDate, appointmentTime,appointmentStatus,numberOfPeopleVisit);
    }

}

