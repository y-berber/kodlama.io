public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
