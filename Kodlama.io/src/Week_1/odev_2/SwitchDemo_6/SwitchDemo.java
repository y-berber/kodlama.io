package Week_1.odev_2.SwitchDemo_6;

public class SwitchDemo {

    public static void main(String[] args) {
        char grade = 'C';  
        switch(grade)
        {
            case 'A' :
                System.out.println("Mükemmel : Geçtiniz!");
                break;
            case 'B' :
                System.out.println("Çok Güzel : Geçtiniz.");
            case 'C' :
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D' :
                System.out.println("Fena Değil: Geçtiniz");
            case 'F' :
                System.out.println("Maalesef Kaldınız.");
                break;
            default :
                System.out.println("Geçersiz not girdiniz");
        }



    }

}