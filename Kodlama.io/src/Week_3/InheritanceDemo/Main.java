public class Main {
    public static void main(String[] args) {
        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //teacherCreditManager.Calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculate(new TeacherCreditManager());
        creditUI.creditCalculate(new AgricultureCreditManager());
        creditUI.creditCalculate(new SoldierCreditManager());
    }
}