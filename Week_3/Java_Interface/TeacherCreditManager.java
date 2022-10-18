public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("The teacher credit was calculated.");
    }

    @Override
    public void save() {

    }
}
