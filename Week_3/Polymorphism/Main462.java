public class Main462 {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Log message");

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(),new ConsolLogger()};

        for (BaseLogger logger: loggers) {
            logger.Log("Log message");
        }

        CustomerManager461 customerManager = new CustomerManager461(new DatabaseLogger());
        customerManager.add();
    }
}