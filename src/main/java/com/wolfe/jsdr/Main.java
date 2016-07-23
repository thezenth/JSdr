package com.wolfe.jsdr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main( String[] args )
    {
        BufferedReader br = null;

        try {
            String line;

            br = new BufferedReader(new FileReader("/home/noah/Documents/Projects/JSdr/FMCapture1.dat"));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
