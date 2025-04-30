package Singleton_Pattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    //constructor must be private
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
