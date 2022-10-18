public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("The custemor was added");
        this.baseLogger.Log("Log message");
    }
}
