public class Main {
    public static void main(String[] args) {
        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //System.out.println(teacherCreditManager.calculate(1000));

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new AgricultureCreditManager(),new TeacherCreditManager(), new StudentCreditManager()};

        for( BaseCreditManager baseCreditManager : baseCreditManagers){
            System.out.println(baseCreditManager.calculate(1000));
        }
    }
}