public class Main {
    public static void main(String[] args) {

        LogManager logManager1 = LogManager.getInstance();
        
        logManager1.log("Application started.");

        LogManager logManager2 = LogManager.getInstance();

        logManager2.log("Performing some operations...");

        System.out.println(logManager1 == logManager2); 

        
    }
}