import java.util.Scanner;

public class Operation {

	// 使用if與switch敘述撰寫一個程式讓使用者輸入兩個浮點數字，請從四則運算中選擇一項運算子，此程式會將這兩個數字，根據運算子來做計算。
	// 請注意除數不可為0，如果為0，請印出錯誤訊息。
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1 = 0, num2 = 0;
		int option = 0;

		System.out.println("請輸入第1個浮點數 : ");
		num1 = scanner.nextFloat();
		System.out.println("請輸入第2個浮點數 : ");
		num2 = scanner.nextFloat();

		while (option != -1) {
			option = GetOption();
			switch (option) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				if(num2!=0)
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				else
					System.out.println("除數不可為0 !");
				break;
			case 5:
				option = -1;
				break;
			default:
				break;
			}
		}
	}

	private static int GetOption() {
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (true) {
			try {
				System.out.print("選項 1)+ 2)- 3)* 4)/ 5)結束 : ");
				option = scanner.nextInt();
				switch (option) {
				case 1:
					return 1;
				case 2:
					return 2;
				case 3:
					return 3;
				case 4:
					return 4;
				case 5:
					return 5;
				default:
					return 0;
				}
			} catch (Exception ex) {
				System.out.println("請輸入數字");
			}
		}
	}
}
