package com.kharchenko.lesson31;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        String readPath1 = "F:\\text1.txt";
        String readPath2 = "F:\\text2.txt";
        String writePath1 = "F:\\words.txt";
        FileOperations fileOperations1 = new FileOperations(readPath1, writePath1);
        FileOperations fileOperations2 = new FileOperations(readPath2, writePath1);

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(fileOperations1);
        service.execute(fileOperations2);
    }
}
