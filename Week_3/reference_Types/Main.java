public class Main {
    public static void main(String[] args) {

        int[] numbers1 = new int[] {1,2,3};
        int[] numbers2 = new int[] {10,20,30};
        numbers1 = numbers2;

        numbers2[0] = 100;

        System.out.println(numbers1[0]);
    }
}