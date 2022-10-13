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
        return new Hospital(replaceAllQuot(splitted[0]), replaceAllQuot(splitted[1]));
    }
}

