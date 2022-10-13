package com.seoulhospital.domain;

public class Hospital {

    private String id;
    private String address;
    private String district;
    private String category;
    private String name;
    private String subdivision;
    private int emergencyRoom;


    public Hospital(String id, String address){
        this.id = id.replaceAll("\"", "");
        this.address = address.replaceAll("\"", "");
    }


    public String getId() {
        return id;
    } // getter를 이용해서 접근함

    public String getAddress() {
        return address;
    }
    public String getDistrict() {
        return district;
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
