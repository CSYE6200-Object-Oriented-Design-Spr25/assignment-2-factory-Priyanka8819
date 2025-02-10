package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileUtil {
    public static List<String> readFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        File file = new File("resources/" + fileName); // Relative path to resources folder
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}