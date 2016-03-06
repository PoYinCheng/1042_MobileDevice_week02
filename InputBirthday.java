import java.util.Scanner;

public class InputBirthday {

	// 要求使用者輸入他的姓名以及西元生日，再將以民國年月日印出他的姓名與生日。
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int year = 0, month = 0, day = 0;

		// 輸入姓名
		System.out.print("請輸入姓名:");
		name = scanner.next();

		// 輸入生日
		System.out.println("請輸入生日:");
		while (true) {
			try {
				System.out.print("西元年:");
				year = scanner.nextInt();
				if (year <= 1911 || year > 2016)
					System.out.println("輸入年份超出範圍 !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("請輸入數字");
			}
		}
		while (true) {
			try {
				System.out.print("月:");
				month = scanner.nextInt();
				if (month < 1 || month > 12)
					System.out.println("輸入月份超出範圍 !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("請輸入數字");
			}
		}
		while (true) {
			try {
				System.out.print("日:");
				day = scanner.nextInt();
				if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
						&& (day < 1 || day > 31))
					System.out.println("輸入日期超出範圍 !");
				else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30))
					System.out.println("輸入日期超出範圍 !");
				// 西元年份除以4不可整除，除以100可整除，除以400不可整除，為平年。
				else if ((year % 4 != 0 && year % 100 == 0 && year % 400 != 0) && month == 2 && (day < 1 || day > 28))
					System.out.println("輸入日期超出範圍 !");
				// 西元年份除以4可整除，除以100不可整除，除以400可整除，為閏年。
				else if ((year % 4 == 0 && year % 100 != 0 && year % 400 == 0) && month == 2 && (day < 1 || day > 29))
					System.out.println("輸入日期超出範圍 !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("請輸入數字");
			}
		}

		// 印出結果
		System.out.println("使用者 " + name + " 生日為民國" + (year - 1911) + "年" + month + "月" + day + "日");
	}

}
