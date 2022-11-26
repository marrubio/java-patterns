package es.marugi.learn;


import es.marugi.learn.patterns.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Singleton pattern
        System.out.println("Singleton pattern");
        Singleton singleton = Singleton.getInstance();
        System.out.println("Name: " + singleton.getName());
        System.out.println("Version: " + singleton.getVersion());
    }
}
