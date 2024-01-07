package com.basicstrong.designprinciples.solid.dependencyinjection.correct;

interface LoggerInfo{
    void logInformation(String messages);
}
class Logger implements LoggerInfo{
    public void logInformation(String message) {
        System.out.println(message);
    }
}

class LoggingToFile{
    private LoggerInfo logger;

    public LoggingToFile(Logger logger) {
        this.logger = logger;
    }
    public void logging() {
        logger.logInformation("printing to log file");
    }
}
public class DIP {

    public static void main(String[] args) {
        LoggingToFile loggingToFile = new LoggingToFile(new Logger());
        loggingToFile.logging();
    }
}
