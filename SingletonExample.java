// SingletonExample.java

class MySingleton {
    // this is the only object of MySingleton
    private static MySingleton obj = null;

    // a variable to show that data is shared
    public int counter = 0;

    // It is a private constructor that enables no outsider can able to modify the code
    private MySingleton() {
        System.out.println("Singleton Object Created!");
    }

    // method to return the only object
    public static MySingleton getInstance() {
        if (obj == null) {
            obj = new MySingleton(); // create it only once
        }
        return obj;
    }

    // some example method
    public void doSomething() {
        System.out.println("I am doing something...");
    }

    // added a new method just to play with
    public void increaseCounter() {
        counter++;
        System.out.println("Counter is now: " + counter);
    }
}

// this is the main class to test the singleton
public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("Trying to get Singleton instance...");

        MySingleton s1 = MySingleton.getInstance();
        s1.doSomething();
        s1.increaseCounter();
        s1.increaseCounter();

        System.out.println("Getting Singleton again...");

        MySingleton s2 = MySingleton.getInstance();
        s2.doSomething();

        // check if counter is shared
        System.out.println("Counter from s2: " + s2.counter);

        // checking if both are same object
        if (s1 == s2) {
            System.out.println("Both objects are same. Singleton works!");
        } else {
            System.out.println("Something is wrong. Not a singleton!");
        }
    }
}
