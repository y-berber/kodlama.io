package Week_1.odev_2.MiniProjects_11;

public class MiniProject5 {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Say� mevcuttur.");
		} else {
			System.out.println("Say� mevcut de�ildir.");
		}

	}

}
