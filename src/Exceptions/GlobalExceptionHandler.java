package Exceptions;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class GlobalExceptionHandler {
    private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class.getName());
    
    static {
        // Set up file logging
        try {
            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("Failed to set up file logging: " + e.getMessage());
        }
    }

    /*
    -The static block runs once when the class is loaded
    -Sets up a FileHandler that writes logs to application.log
    -true means it appends to existing log file (doesn't overwrite)
    -SimpleFormatter makes the log entries readable 
    */
    
    public static void handleException(Exception e, String context) {
        // Log the exception with full details
        LOGGER.log(Level.SEVERE, "Exception in " + context + ": " + e.getMessage(), e);
        
        // Print user-friendly message
        System.err.println("=== ERROR REPORT ===");
        System.err.println("Context: " + context);
        System.err.println("Error: " + e.getMessage());
        System.err.println("Time: " + java.time.LocalDateTime.now());
        System.err.println("===================");
        
        // You could add more actions here:
        // - Send email notification
        // - Show GUI error dialog
        // - Restart the application
        // - Save error to database
    }
    
    public static void handleRuntimeException(RuntimeException e, String context) {
        LOGGER.log(Level.WARNING, "Runtime Exception in " + context + ": " + e.getMessage(), e);
        System.err.println("Runtime Error in " + context + ": " + e.getMessage());
    }
} 