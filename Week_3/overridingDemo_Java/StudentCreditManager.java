public class StudentCreditManager extends BaseCreditManager423{
    @Override
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
