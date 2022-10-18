public class Main {
    public static void main(String[] args) {
        WomenCameCalculator womenCameCalculator = new WomenCameCalculator();
        womenCameCalculator.calculate();
        womenCameCalculator.gameOver();

        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.calculate();

    }
}