package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) {
    	System.out.println(System.getProperty("user.dir"));
        // Define the paths for input and output files
        String inputFile = "input.txt";
    	String fullInputPath = "src\\files\\" + inputFile ;
        String outputFile = "output.txt";
        String fullOutputPath = "src\\files\\" + outputFile ;
        

        // Check if input file exists
        File inputFileObj = new File(fullInputPath);
        if (!inputFileObj.exists()) {
            System.err.println("Input file not found.");
            return;
        }

        // Reading from a file using FileInputStream
        try (FileInputStream fileInputStream = new FileInputStream(inputFileObj)) {
            // Create a byte array to store read data
            byte[] data = new byte[fileInputStream.available()];

            // Read data from the file into the byte array
            fileInputStream.read(data);

            // Print the contents read from the file
            System.out.println("Contents of " + inputFile + ":");
            System.out.println(new String(data));

        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

        // Writing to a new file using FileOutputStream
        try (FileOutputStream fileOutputStream = new FileOutputStream(fullOutputPath)) {
            // Sample data to write to the file
            String outputData = "Welcome to the Output file";

            // Convert the string to bytes and write to the file
            fileOutputStream.write(outputData.getBytes());

            System.out.println("\nData written to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
