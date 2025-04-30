package Chain_of_Responsibility_Pattern;

public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        //set chain of handlers
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);//ErrorLogger → FileLogger → ConsoleLogger

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        /*
         * ErrorLogger (level = ERROR = 3) → message level (INFO = 1) too low → passes to FileLogger
           FileLogger (DEBUG = 2) → too low → passes to ConsoleLogger
           ConsoleLogger (INFO = 1) → matches → prints message
         */
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
