package com.jspider.OOPs.InnerClasses.LocalInnerClass;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reserveRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reserveRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name Can not be empty");
                    return false;
                }
                if (numOfRooms < 0){
                    System.out.println("Number of Room Should be positive");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough Rooms available");
                    return false;
                }
                return true;
            }
        }


        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation conformed for "+guestName+" for "+numOfRooms+" room");
        }
        else {
            System.out.println("Reservation failed");
        }
    }
}
