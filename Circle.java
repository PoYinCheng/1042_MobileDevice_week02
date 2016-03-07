import java.util.Scanner;

public class Circle {
	/*
	 * ���X�RCircle���O�A�b�䤤�[�J�@�Ӧ����禡Arc�PPie�A��Ө禡�������@�ӰѼƥN���סA�ä��O�^�ǸӨ��שҹ����������P���n�C �t�~�A
	 * �м��g�D�禡�n�D�ϥΪ̳s���J�b�|�H���ͤ��P����ΡA���ۨϥΪ̥i�H��J�s���P���סA�{���K�|�^�ǸӶ�ι����Ө��ת������P���n�C
	 */
	double r = 0;
	double pi = 3.14;

	double area() {
		return pi * r * r;
	}

	// �^�ǸӨ��שҹ���������
	double Arc(int angle) {
		return 2 * r * pi * ((double) angle / 360);
	}

	// �^�ǸӨ��שҹ��������n
	double Pie(int angle) {
		return pi * r * r * ((double) angle / 360);
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle circle = new Circle();
		double[] rList = new double[100];
		int count = 0;

		while (circle.r != -1) {
			try {
				System.out.print("�п�J�b�|�A�w��J" + count + "�� (��J-1����): ");
				circle.r = scanner.nextDouble();
				if (circle.r == -1)
					break;
				else if (circle.r <= 0)
					System.out.println("�b�|�����j��0 !");
				else {
					rList[count++] = circle.r;
				}
			} catch (Exception ex) {
				System.out.println("Error : " + ex);
			}
		}

		if (count > 0) {//����J�b�|���������{��
			int num = 0, angle = 0;

			while (num != -1) {
				num = circle.inputNumber(count);
				if (num == -1) {//��J-1�����{��
					break;
				} else {
					angle = circle.inputAngle();
					circle.r = rList[num - 1];
					System.out.printf("����=%.2f\n", circle.Arc(angle));
					System.out.printf("���n=%.2f\n", circle.Pie(angle));
				}
			}
		}
	}
}