package com.seoulhospital.parser;

import com.seoulhospital.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{

    private String replaceAllQuot(String str){
        return str.replaceAll("\"","");
    }

    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        return new Hospital(splitted[0], splitted[1], splitted[2],splitted[10], Integer.valueOf(splitted[6]), splitted[7]);
    }
}

