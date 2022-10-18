package Week_1.odev_2.MiniProjects_11;

public class MiniProject3 {

	public static void main(String[] args) {
		// 6 --> 1,2,3
		// 28 --> 1,2,4,7,14
		int number = 28;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		if (sum == number) {
			System.out.println("Mükemmel Sayı");
		} else {
			System.out.println("Mükemmel Sayı Değil");
		}

	}

}