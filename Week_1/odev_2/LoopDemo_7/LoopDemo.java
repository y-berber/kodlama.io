package Week_1.odev_2.LoopDemo_7;

public class LoopDemo {

    public static void main(String[] args) {
        // For Döngüsü
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("-------------");

        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);

        }
        System.out.println("For Döngüsü Bitti");

        // While Döngüsü  
        int i = 1;
        while (i < 10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        // Do While Döngüsü
        int j =100;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");

    }

}