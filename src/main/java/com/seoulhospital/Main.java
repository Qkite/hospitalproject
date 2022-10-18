package com.seoulhospital;

import com.seoulhospital.dao.HospitalDao;
import com.seoulhospital.domain.Hospital;
import com.seoulhospital.fileout.FileController;
import com.seoulhospital.fileout.FileMake;
import com.seoulhospital.parser.HospitalParser;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {



        // 파일 작성

        // FileMake fileMake = new FileMake("C:\\Users\\yeonji\\Desktop\\datainput1.sql");
        String filePath = "C:\\Users\\yeonji\\Desktop\\seoulhospitals.csv";

        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        List<Hospital> hospitalList = hospitalFileController.readLines(filePath);


        HospitalDao hospitalDao = new HospitalDao();

//        for (Hospital hospital : hospitalList) {
//            HospitalParser hospitalParser = new HospitalParser();
//
//            try{
//                hospitalDao.add(hospital.returnInfo());
//            }catch (Exception e){
//            }
//        }

        hospitalDao.select("A");




    }
}
