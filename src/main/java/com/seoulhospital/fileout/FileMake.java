package com.seoulhospital.fileout;

import java.io.*;
import java.util.List;

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

    public void writeLines(List<String> lines, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer
                    = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
            for (String str : lines) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("success");
    }


}
