package es.marugi.learn.patterns.singleton;

import es.marugi.learn.App;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public final class Singleton {

    private static Singleton INSTANCE;



    private String name;
    private String version;

    private Singleton(){
        loadFromConfigFile();
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }


    private void loadFromConfigFile(){

        try {

            InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties");

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                throw new IOException();
            }

            // load a properties file from class path, inside static method
            prop.load(input);

            // get the property value
            name = prop.getProperty("singleton.name");
            System.out.println("singleton.name " + name);

            version = prop.getProperty("singleton.version");
            System.out.println("singleton.version " + version);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
