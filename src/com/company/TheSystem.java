package com.company;

import java.util.ArrayList;

public class TheSystem {
    private ArrayList<Appointment> theAppointment;

    public TheSystem() {
        this.theAppointment = new ArrayList<>();
    }

    public boolean addNewAppointment(Appointment appointment){
        if(findAppointment(appointment.getCustomerPhoneNumber()) >= 0 && appointment.getAppointmentStatus() == "scheduled"){
            System.out.println("This appointment is already on system");
            return false;
        }
        theAppointment.add(appointment);
        return true;
    }

    private int findAppointment(String phoneNumber){
        for (int i = 0; i < this.theAppointment.size(); i++) {
            Appointment appt = this.theAppointment.get(i);
            if (appt.getCustomerPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public void printAppointmentList(){
        System.out.println("Appointment List:\n");
        for(int i=0; i<this.theAppointment.size(); i++){
            System.out.println("---------------------------------------------");
            System.out.println("| Appointment Status: "+theAppointment.get(i).getAppointmentStatus()+
                                "\n| Customer Name: \t\t\t"+theAppointment.get(i).getCustomerName()+
                                "\n| Cusomter Phone Number: \t"+theAppointment.get(i).getCustomerPhoneNumber()+
                                "\n| Number of People Visit: \t"+theAppointment.get(i).getNumberOfPeopleVisit()+
                                "\n| Appointment Date: \t\t"+theAppointment.get(i).getAppointmentDate()+
                                "\n| Appointment Time: \t\t"+theAppointment.get(i).getAppointmentTime()+
                                "\n=============================================" +
                                "\n| Create By: "+theAppointment.get(i).getSchedulerName()+" @ "+ theAppointment.get(i).getDateCreated());
            System.out.println("---------------------------------------------\n");

        }

    }
}
