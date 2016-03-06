import java.util.Scanner;

public class InputStudent {

	// 連續要求使用者輸入資料，包括學生姓名與其成績，輸入完後使用者可以進一步輸入編號來找出對應的學生資料；
	// 如果使用者在輸入成績時輸入不是合法的數字字串，則程式必須可以印出錯誤訊息加以警告(提示：NumberFormatException)。
	public static void main(String[] args) {
		int count = 0, student = 0;
		Scanner scanner = new Scanner(System.in);

		// 輸入學生人數
		while (true) {
			try {
				System.out.print("請輸入學生人數:");
				student = scanner.nextInt();
				if (student <= 0)
					System.out.println("人數不得少於0 !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("請輸入數字");
			}
		}

		String[] name = new String[100];
		int[] grade = new int[100];

		// 輸入姓名、成績
		while (count < student) {
			String input;
			System.out.printf("請輸入學生%d姓名:", count + 1);
			name[count] = scanner.next();
			while (true) {
				try {
					System.out.printf("請輸入學生%d成績:", count + 1);
					input = scanner.next();
					if (Integer.parseInt(input) >= 0 && Integer.parseInt(input) <= 100) {
						grade[count] = Integer.parseInt(input);
						break;
					} else
						System.out.println("成績範圍須介於0~100之間");
				} catch (NumberFormatException ex) {
					System.out.println("請輸入數字 !");
				}
			}
			count++;
		}

		//查詢學生資料
		int option = 0, num = 0;
		while (option != 2) {
			System.out.print("選項 1)查詢 2)離開 : ");
			option = scanner.nextInt();
			if (option == 1) {
				System.out.print("請輸入編號 : ");
				num = scanner.nextInt();
				System.out.println("姓名 : " + name[num - 1]);
				System.out.println("成績 : " + grade[num - 1]);
			}
			if (option == 2)
				break;
		}
	}

}
