package com.seoulhospital.fileout;

import com.seoulhospital.parser.Parser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileController<T> {

    Parser<T> parser; // parser interface에서 넘겨받은 <T>를 다룸
    boolean isRemoveColumnName = true;

    public FileController(Parser<T> parser) {
        this.parser = parser;
    }

    public FileController(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    public List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename),"utf-8"));
        //br = Files.newBufferedReader(new InputStreamReader(new FileInputStream(filename),"utf-8"));
        String str;

        if (isRemoveColumnName) {
            br.readLine();
        }

        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }

}
