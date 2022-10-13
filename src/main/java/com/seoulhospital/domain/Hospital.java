package com.seoulhospital.domain;

public class Hospital {

    private String id;
    private String address;
    private String district;
    private String category;
    private String name;
    private String subdivision;
    private int emergencyRoom;



    private String addtionalInfo;


    public Hospital(String id, String address, String category,String name, int emergencyRoom, String additionalInfo){
        this.id = id;
        this.address = address;
        this.name = name;
        this.emergencyRoom = emergencyRoom;
        this.category = category;
        this.addtionalInfo = additionalInfo;

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
        String infos = this.name + this.addtionalInfo;
        String[] inputCheck = {"내과", "외과", "소아", "피부", "성형", "정형외과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과"};
        String result = "";

        for (String department:inputCheck) {
            if(infos.contains(department)){
                result += department;
            }
        }

        return result;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getAddtionalInfo() {
        return addtionalInfo;
    }

}
