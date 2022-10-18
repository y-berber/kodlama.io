package Week_2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {

        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();

        CreditUi creditUi = new CreditUi();
        creditUi.CalculateCredit(teacherCreditManager);
        creditUi.CalculateCredit(new AgricultureCreditManager());
        creditUi.CalculateCredit(new SoldierCreditManager());

    }
}
