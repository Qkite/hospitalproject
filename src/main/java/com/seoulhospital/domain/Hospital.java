package com.seoulhospital.domain;

public class Hospital {

    private String id, address, district, category, name, subdivision;
    private int emergencyRoom;


    public Hospital(String id){
        this.id = id.replaceAll("\"", "");
    } // 생성자로 초기화

    public String getId() {
        return id;
    } // getter를 이용해서 접근함

}
