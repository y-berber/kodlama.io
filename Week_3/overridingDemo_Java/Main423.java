public class Main423 {
    public static void main(String[] args) {
        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //System.out.println(teacherCreditManager.calculate(1000));

        BaseCreditManager423[] baseCreditManagers = new BaseCreditManager423[]{
        		new AgricultureCreditManager423(),new TeacherCreditManager423(), new StudentCreditManager()};

        for( BaseCreditManager423 baseCreditManager : baseCreditManagers){
            System.out.println(baseCreditManager.calculate(1000));
        }
    }
}