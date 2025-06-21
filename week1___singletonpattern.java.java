class Logger {
    private static Logger instance; // 1. Single instance
    private Logger() {
        System.out.println("Logger created");
    }
    // 2. Method to get the only Logger instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    // 3. Log message method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
class Helper {
    static void doSomething() {
        Logger logger = Logger.getInstance();
        logger.log("Helper is doing some work...");
    }
}
class Main {
    public static void main(String[] args) {
        // Getting logger instances
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        // Logging different messages
        log1.log("App is starting...");
        log2.log("User logged in");
        // Adding a small check
        if (log1 == log2) {
            System.out.println(" Same logger is used everywhere.");
        } else {
            System.out.println(" Different loggers! Something is wrong.");
        }
        // Using logger in a different class
        Helper.doSomething();
    }
}