/**
 *  Java program to read a file.
 */

package com.mystreams;

import java.io.*;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        try {

            // Creating a blank string.
            String str = "";

            // Creating BuffereReader.
            BufferedReader bf = new BufferedReader(new FileReader("src/inputFile.txt"));

            // Creating BuffereWriter.
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/outputFile.txt"));

            while((str = bf.readLine()) != null) {

                // Writing to a file.
                bw.write(str);

                // Moving cursor to next line.
                bw.newLine();

            }

            // Closing the resources.
            bf.close();
            bw.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

        } catch (IOException ex) {

            ex.printStackTrace();

        }
    }
}