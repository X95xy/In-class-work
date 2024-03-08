
import java.time.LocalDateTime;

public class LogManager {
    
    private static LogManager instance;
    
    private LogManager() {
        
    }

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        LocalDateTime timestamp = LocalDateTime.now();
        
        System.out.println("This log was written at " + timestamp);
    }
}



