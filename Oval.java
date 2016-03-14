import java.util.Scanner;

class Circle {

	double lr = 0, sr = 0;
	double pi = 3.14;

	double area() {
		return pi * lr * sr;
	}

	// �^�ǸӨ��שҹ���������
	double Arc(int angle) {
		return 2 * lr * pi * ((double) angle / 360);
	}

	// �^�ǸӨ��שҹ��������n
	double Pie(int angle) {
		return pi * lr * sr * ((double) angle / 360);
	}

	// �^�ǽs��
	int inputNumber(int count) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;

		while (true) {
			try {
				System.out.print("�п�J�s�� (��J-1����): ");
				num = scanner.nextInt();
				if ((num <= 0 && num != -1) || num > count)
					System.out.println("�s���W�X�d�� !");
				else {
					return num;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

	}

	// �^�Ǩ���
	int inputAngle() {
		Scanner scanner = new Scanner(System.in);
		int angle = 0;

		while (true) {
			try {
				System.out.print("�п�J���� : ");
				angle = scanner.nextInt();
				if (angle <= 0)
					System.out.println("���ץ����j��0 !");
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

	// �м��g�@�����O�W��Oval�H�N����A�����O�~�ө�Circle�C�A��ӫ��w�@�~3���m��1�A���g�D�禡���\��C
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] rList = new double[100][2];
		int count = 0;
		Oval oval = new Oval();

		while (true) {
			try {
				System.out.print("�п�J�b�|�A�w��J" + count + "�� (��J0 0����): ");
				rList[count][0] = scanner.nextDouble();
				rList[count][1] = scanner.nextDouble();
				if (rList[count][0] == 0 && rList[count][1] == 0)
					break;
				else if (rList[count][0] <= 0 || rList[count][1] <= 0)
					System.out.println("�b�|�����j��0 !");
				else {
					count++;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

		if (count > 0) {// ����J�b�|���������{��
			int num = 0, angle = 0;

			while (num != -1) {
				num = oval.inputNumber(count);
				if (num == -1) {// ��J-1�����{��
					break;
				} else {
					angle = oval.inputAngle();
					oval.lr = rList[num - 1][0];
					oval.sr = rList[num - 1][1];
					System.out.printf("�P��=%.2f\n", oval.Arc(360));
					System.out.printf("���n=%.2f\n", oval.Pie(angle));
				}
			}
		}
	}
}
