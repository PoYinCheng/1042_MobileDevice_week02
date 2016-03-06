import java.util.Scanner;

public class CheckYear {

	// 撰寫程式先要求使用者輸入一個西元的年份，再印出一個表格顯示所有此年份之前的閏年。
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, count = 0;

		while (true) {
			try {
				System.out.print("請輸入西元年:");
				input = scanner.nextInt();
				if (input < 0)
					System.out.println("輸入年份超出範圍 !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("請輸入數字");
			}
		}

		// 判斷閏年並印出
		int year = 1;
		while (year <= input) {
			// 西元年份除以4可整除，且除以100不可整除，為閏年。
			// 西元年份除以400可整除，為閏年。
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.print(year);
				count++;
			}
			if (count % 10 == 0)
				System.out.println();
			else
				System.out.print(" ");
			year++;
		}
		System.out.println("共" + count + "個");

	}

}
