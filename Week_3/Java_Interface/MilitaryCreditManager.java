public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("The military credit was calculated.");
    }

    @Override
    public void save() {

    }
}
