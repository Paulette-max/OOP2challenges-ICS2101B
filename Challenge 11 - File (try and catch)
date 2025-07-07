package pkg_oop2ch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file {
    public void processFile(String filePath) {
        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                // process
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
