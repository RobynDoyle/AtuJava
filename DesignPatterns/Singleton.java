package DesignPatterns;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
}

class Main {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        System.out.println(firstInstance);
        System.out.println(secondInstance);

        if (firstInstance == secondInstance) {
            System.out.println("Both instances are the same (Singleton works!).");
        } else {
            System.out.println("Instances are different (Singleton failed!).");
        }
    }
}
