package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Properties {
    public static String propertyreader(String property_name) {
        java.util.Properties properties=new java.util.Properties();
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(new File("C:\\Users\\LENOVO\\Downloads\\Automation notes\\contact_list_app\\src\\main\\java\\config.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(property_name);
    }
}
