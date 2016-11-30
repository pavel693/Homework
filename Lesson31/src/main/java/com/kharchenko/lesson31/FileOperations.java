package com.kharchenko.lesson31;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FileOperations implements Runnable {

    private String readPath;
    private String writePath;

    FileOperations(String readPath, String writePath) {
        this.readPath = readPath;
        this.writePath = writePath;
    }

    public void operation() throws IOException {
        FileReader reader = new FileReader(readPath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        Map<String, Integer> output = new ConcurrentHashMap<>();
        while ((line = bufferedReader.readLine()) != null) {

            String[] words = line.split(" ");
            for (String word : words) {
                String temp = word.replaceAll("[!'(.?,):;]", "");
                if (output.containsKey(temp)) {
                    Integer value = output.get(temp);
                    value++;
                    output.put(temp, value);
                } else {
                    output.put(temp, 1);
                }
            }
        }

        Map<String, Integer> result = new LinkedHashMap<>();

        output.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        FileWriter writer = new FileWriter(writePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        Set<String> keys = result.keySet();
        for (String key : keys) {
            Integer value = output.get(key);

            bufferedWriter.write(key + " " + value);
            bufferedWriter.newLine();
        }
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    @Override
    public void run() {
        try {
            operation();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
