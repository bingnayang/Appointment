package com.company;

import java.util.ArrayList;

public class TheSystem {
    private ArrayList<Appointment> theAppointment;

    public TheSystem() {
        this.theAppointment = new ArrayList<>();
    }

    public boolean addNewAppointment(Appointment appointment){
        theAppointment.add(appointment);
        return true;
    }
    public void printAppointmentList(){
        System.out.println("Appointment List:\n");
        for(int i=0; i<this.theAppointment.size(); i++){
            System.out.println("---------------------------------------------");
            System.out.println("| Appointment Status: "+theAppointment.get(i).getAppointmentStatus()+
                                "\n| Customer Name: \t\t\t\t"+theAppointment.get(i).getCustomerName()+
                                "\n| Cusomter Phone Number: \t\t"+theAppointment.get(i).getCustomerPhoneNumber()+
                                "\n| Number of People Visit: \t\t"+theAppointment.get(i).getNumberOfPeopleVisit()+
                                "\n| Appointment Date and Time: \t"+theAppointment.get(i).getAppointmentDateTime()+
                                "\n=============================================" +
                                "\n| Create By: "+theAppointment.get(i).getSchedulerName()+" @ "+ theAppointment.get(i).getDateCreated());
            System.out.println("---------------------------------------------\n");

        }

    }
}
