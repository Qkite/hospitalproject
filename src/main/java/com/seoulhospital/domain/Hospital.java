package com.seoulhospital.domain;

public class Hospital {

    private String id;
    private String address;
    private String district;
    private String category;
    private String name;
    private String subdivision;
    private int emergencyRoom;


    public Hospital(String id, String address, String category,String name, int emergencyRoom){
        this.id = id;
        this.address = address;
        this.name = name;
        this.emergencyRoom = emergencyRoom;
        this.category = category;


    }


    public String getId() {
        return id;
    }
    // can access to variable with getter

    public String getAddress() {
        return address;
    }
    public String getDistrict() {
        String[] splitted = this.address.split(" ");
        return String.format("%s %s", splitted[0], splitted[1]);
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

}
