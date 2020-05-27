package com.company;

import java.util.Date;

public class Appointment {
    private String schedulerName;
    private String customerName;
    private String customerPhoneNumber;
    private Date dateCreated;
    private Date appointmentDateTime;
    private String appointmentStatus;
    private int numberOfPeopleVisit;

    public Appointment(String customerName){
        this.customerName = customerName;
    }

    public Appointment(String schedulerName, String customerName, String customerPhoneNumber, Date dateCreated, Date appointmentDateTime, String appointmentStatus, int numberOfPeopleVisit) {
        this.schedulerName = schedulerName;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.dateCreated = dateCreated;
        this.appointmentDateTime = appointmentDateTime;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(Date appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
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

    public static Appointment bookAppointment(String schedulerName, String customerName, String customerPhoneNumber, Date dateCreated, Date appointmentDateTime, String appointmentStatus, int numberOfPeopleVisit){
        return new Appointment(schedulerName,customerName,customerPhoneNumber,dateCreated,appointmentDateTime,appointmentStatus,numberOfPeopleVisit);
    }

}

