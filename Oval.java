import java.util.Scanner;

class Circle {

	double lr = 0, sr = 0;
	double pi = 3.14;

	double area() {
		return pi * lr * sr;
	}

	// 回傳該角度所對應的弧長
	double Arc(int angle) {
		return 2 * lr * pi * ((double) angle / 360);
	}

	// 回傳該角度所對應的面積
	double Pie(int angle) {
		return pi * lr * sr * ((double) angle / 360);
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
}

class Oval extends Circle {

	// 請撰寫一個類別名為Oval以代表橢圓，此類別繼承於Circle。再仿照指定作業3的練習1，撰寫主函式的功能。
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] rList = new double[100][2];
		int count = 0;
		Oval oval = new Oval();

		while (true) {
			try {
				System.out.print("請輸入半徑，已輸入" + count + "個 (輸入0 0結束): ");
				rList[count][0] = scanner.nextDouble();
				rList[count][1] = scanner.nextDouble();
				if (rList[count][0] == 0 && rList[count][1] == 0)
					break;
				else if (rList[count][0] <= 0 || rList[count][1] <= 0)
					System.out.println("半徑必須大於0 !");
				else {
					count++;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

		if (count > 0) {// 未輸入半徑直接結束程式
			int num = 0, angle = 0;

			while (num != -1) {
				num = oval.inputNumber(count);
				if (num == -1) {// 輸入-1結束程式
					break;
				} else {
					angle = oval.inputAngle();
					oval.lr = rList[num - 1][0];
					oval.sr = rList[num - 1][1];
					System.out.printf("周長=%.2f\n", oval.Arc(360));
					System.out.printf("面積=%.2f\n", oval.Pie(angle));
				}
			}
		}
	}
}
