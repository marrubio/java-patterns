package es.marugi.learn;


public class App 
{
    public static void main( String[] args )
    {

        //Singleton pattern
        System.out.println("Singleton pattern");
        es.marugi.learn.patterns.singleton.Singleton singleton = es.marugi.learn.patterns.singleton.Singleton.getInstance();
        System.out.println("Name: " + singleton.getName());
        System.out.println("Version: " + singleton.getVersion());

        //prototype
        System.out.println("\nPrototype pattern");
        es.marugi.learn.patterns.prototype.Application prototype = new es.marugi.learn.patterns.prototype.Application();
        prototype.businessLogic();


    }
}
