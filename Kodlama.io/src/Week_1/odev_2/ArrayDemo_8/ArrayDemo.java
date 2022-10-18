package Week_1.odev_2.ArrayDemo_8;

public class ArrayDemo {

    public static void main(String[] args) {
        String ogrenci1 = "Mehmet Gevan";
        String ogrenci2 = "Haluk";
        String ogrenci3 = "Ece";
        String ogrenci4 = "Renas";
  
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Mehmet Gevan";
        ogrenciler[1]="Haluk";
        ogrenciler[2]="Ece";
        ogrenciler[3]="Renas";

        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

    }

}