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
        System.out.println("Appointment List:");
        System.out.println("---------------------------------------------");
        for(int i=0; i<this.theAppointment.size(); i++){
            System.out.println("| Customer Name: "+theAppointment.get(i).getCustomerName()+
                                "\n| Cusomter Phone Number: "+theAppointment.get(i).getCustomerPhoneNumber()+
                                "\n| Number of People Visit: "+theAppointment.get(i).getNumberOfPeopleVisit()+
                                "\n| Appointment Date and Time: "+theAppointment.get(i).getAppointmentDateTime());

        }
        System.out.println("---------------------------------------------");

    }
}
