public class CustomerManager461 {
    private BaseLogger baseLogger;

    public CustomerManager461(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("The custemor was added");
        this.baseLogger.Log("Log message");
    }
}
