package com.library.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    // 1) Create an object of properties
    private static Properties properties = new Properties();

    static {
        try {

            // 2) in order to open file (configuration properties) :
            FileInputStream file = new FileInputStream("configuration.properties");

            // 3) load the file (configuration properties)
            properties.load(file);

            // 5) close the file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file is not found!");
        }
    }

    // 4) reading from the file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }



}
