public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Log message");

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};

        for (BaseLogger logger: loggers) {
            logger.Log("Log message");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}