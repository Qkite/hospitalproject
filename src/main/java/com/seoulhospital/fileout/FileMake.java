package com.seoulhospital.fileout;

import java.io.*;

public class FileMake {
    private String filePath;

    public FileMake(String filePath) throws IOException {
        this.filePath = filePath;
    }

    public void createFile() throws IOException {
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
    }

    public void writeFile(String inputString, boolean closeFile) throws IOException {
        File file = new File(filePath);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        if (closeFile){
            writer.close();
        } else{
            writer.write(inputString);
            writer.newLine();
        }


    }



}
