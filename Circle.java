import java.util.Scanner;

public class Circle {
	/*
	 * 請擴充Circle類別，在其中加入一個成員函式Arc與Pie，兩個函式都接受一個參數代表角度，並分別回傳該角度所對應的弧長與面積。 另外，
	 * 請撰寫主函式要求使用者連續輸入半徑以產生不同的圓形，接著使用者可以輸入編號與角度，程式便會回傳該圓形對應該角度的弧長與面積。
	 */
	double r = 0;
	double pi = 3.14;

	double area() {
		return pi * r * r;
	}

	// 回傳該角度所對應的弧長
	double Arc(int angle) {
		return 2 * r * pi * ((double) angle / 360);
	}

	// 回傳該角度所對應的面積
	double Pie(int angle) {
		return pi * r * r * ((double) angle / 360);
	}

	// 回傳編號
	int inputNumber(int count) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;

		while (true) {
			try {
				System.out.print("請輸入編號 (輸入-1結束): ");
				num = scanner.nextInt();
				if ((num <= 0 && num != -1) || num > count)
					System.out.println("編號超出範圍 !");
				else {
					return num;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

	}

	// 回傳角度
	int inputAngle() {
		Scanner scanner = new Scanner(System.in);
		int angle = 0;

		while (true) {
			try {
				System.out.print("請輸入角度 : ");
				angle = scanner.nextInt();
				if (angle <= 0)
					System.out.println("角度必須大於0 !");
				else {
					return angle;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle circle = new Circle();
		double[] rList = new double[100];
		int count = 0;

		while (circle.r != -1) {
			try {
				System.out.print("請輸入半徑，已輸入" + count + "個 (輸入-1結束): ");
				circle.r = scanner.nextDouble();
				if (circle.r == -1)
					break;
				else if (circle.r <= 0)
					System.out.println("半徑必須大於0 !");
				else {
					rList[count++] = circle.r;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

		if (count > 0) {//未輸入半徑直接結束程式
			int num = 0, angle = 0;

			while (num != -1) {
				num = circle.inputNumber(count);
				if (num == -1) {//輸入-1結束程式
					break;
				} else {
					angle = circle.inputAngle();
					circle.r = rList[num - 1];
					System.out.printf("弧長=%.2f\n", circle.Arc(angle));
					System.out.printf("面積=%.2f\n", circle.Pie(angle));
				}
			}
		}
	}
}