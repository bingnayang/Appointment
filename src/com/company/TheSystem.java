package com.company;

import java.util.ArrayList;

public class TheSystem {
    private ArrayList<Appointment> theAppointment;

    /**
     * 
     */
    public TheSystem() {
        this.theAppointment = new ArrayList<>();
    }

    /**
     *
     * @param appointment
     * @return
     */
    public boolean addNewAppointment(Appointment appointment){
        if(findAppointment(appointment.getCustomerPhoneNumber()) >= 0 && appointment.getAppointmentStatus() == "scheduled"){
            System.out.println("This appointment is already on system");
            return false;
        }
        theAppointment.add(appointment);
        return true;
    }

    /**
     *
     * @param phoneNumber
     * @param statusUpdate
     * @return
     */
    public boolean updateAppointmentStatus(String phoneNumber, String statusUpdate){
        int foundPosition = findAppointment(phoneNumber);
        if(foundPosition < 0){
            System.out.println("Update Fail: Phone Number "+phoneNumber+" Not Found");
            return false;
        }else{
            queryAppointment(phoneNumber).setAppointmentStatus(statusUpdate);
            System.out.println("Customer Name: "+queryAppointment(phoneNumber).getCustomerName()+"\nPhone Number: "+queryAppointment(phoneNumber).getCustomerPhoneNumber()+"\nStatus update to: "+queryAppointment(phoneNumber).getAppointmentStatus());
            return true;
        }
    }

    /**
     *
     * @param phoneNumber
     * @param numberVisit
     * @return
     */
    public boolean updateAppointmentNumberOfVisit(String phoneNumber, int numberVisit){
        int foundPosition = findAppointment(phoneNumber);
        if(foundPosition < 0){
            System.out.println("Update Fail: Phone Number "+phoneNumber+" Not Found");
            return false;
        }else{
            queryAppointment(phoneNumber).setNumberOfPeopleVisit(numberVisit);
            System.out.println("Customer Name: "+queryAppointment(phoneNumber).getCustomerName()+"\nPhone Number: "+queryAppointment(phoneNumber).getCustomerPhoneNumber()+"\nNumber People Visit: "+queryAppointment(phoneNumber).getNumberOfPeopleVisit());
            return true;
        }
    }

    /**
     *
     * @param appointment
     * @return
     */
    public boolean deleteAppointment(Appointment appointment){
        int foundPosition = findAppointment(appointment);
        if(foundPosition < 0){
            System.out.println(appointment.getCustomerPhoneNumber() +": Not Found");
            return false;
        }
        this.theAppointment.remove(foundPosition);
        System.out.println(appointment.getCustomerPhoneNumber()+": Deleted");
        return true;
    }

    /**
     *
     * @param appointment
     * @return
     */
    public String queryAppointment(Appointment appointment) {
        if (findAppointment(appointment) >= 0) {
            return appointment.getCustomerPhoneNumber();
        }
        return null;
    }

    /**
     *
     * @param phone
     * @return
     */
    public Appointment queryAppointment(String phone) {
        int position = findAppointment(phone);
        if (position >= 0) {
            return this.theAppointment.get(position);
        }
        return null;
    }

    /**
     *
     * @param appointment
     * @return
     */
    private int findAppointment(Appointment appointment){
        return this.theAppointment.indexOf(appointment);
    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    private int findAppointment(String phoneNumber){
        for (int i = 0; i < this.theAppointment.size(); i++) {
            Appointment appt = this.theAppointment.get(i);
            if (appt.getCustomerPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }


    public void printStatusScheduled(){
        for(int i=0; i<this.theAppointment.size(); i++){
            if(this.theAppointment.get(i).getAppointmentStatus() == "scheduled"){
                System.out.println("| Appointment Status: "+theAppointment.get(i).getAppointmentStatus()+
                        "\n| Customer Name: \t\t\t"+theAppointment.get(i).getCustomerName()+
                        "\n| Cusomter Phone Number: \t"+theAppointment.get(i).getCustomerPhoneNumber()+
                        "\n| Number of People Visit: \t"+theAppointment.get(i).getNumberOfPeopleVisit()+
                        "\n| Appointment Date: \t\t"+theAppointment.get(i).getAppointmentDate()+
                        "\n| Appointment Time: \t\t"+theAppointment.get(i).getAppointmentTime()+
                        "\n=============================================" +
                        "\n| Create By: "+theAppointment.get(i).getSchedulerName()+" @ "+ theAppointment.get(i).getDateCreated());
            }
        }
    }

    /**
     * Print out the Appointment list 
     */
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
