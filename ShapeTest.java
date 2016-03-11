import java.util.Scanner;

abstract class Shape {
	abstract double area();
}

// ���
class Circle extends Shape {
	double r;

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		return 3.14 * r * r;
	}
}

// ����
class Oval extends Shape {
	double lr, sr;

	public Oval(double lr, double sr) {
		this.lr = lr;
		this.sr = sr;
	}

	public double area() {
		return 3.14 * lr * sr;
	}
}

// �x��
class Rectangle extends Shape {
	double width, height;

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	public double area() {
		return width * height;
	}
}

// �T����
class Triangle extends Shape {
	double base, height;

	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	public double area() {
		return base * height / 2;
	}
}

public class ShapeTest {

	/*
	 * ��@��2.5�`��Shape���O�A�åH������¦�A�]�p�@�����O�ΨӴy�z�T���ΡC
	 * �Цb�D�禡�����g�H�U���\��F���ϥΪ̳s��ھڿﶵ��J�����ͪ��Ϊ�(��ΡB���ΡB�x�ΡA�ΤT����)�A�в��͹���������åB�N���̦s�b�}�C���C
	 * �̫�A�����L�X�ӡC�L�X�Ӫ��ɭԽЧi�D�ϥΪ̦�����O�ƻ�Ϊ��H���̪����n�S����?
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] list = new double[100][3];
		int opt, count = 0;
		double input1, input2;

		try {
			while (true) {
				System.out.print("�п�J�����ͪ��Ϊ� 1)��� 2)���� 3)�x�� 4)�T���� 5)�L�X : ");
				opt = scanner.nextInt();
				if (opt == 1) {
					list[count][0] = (double) opt;
					count = InputCircle(list, count);
				}
				if (opt == 2) {
					list[count][0] = (double) opt;
					count = InputOval(list, count);
				}
				if (opt == 3) {
					list[count][0] = (double) opt;
					count = InputRectangle(list, count);
				}
				if (opt == 4) {
					list[count][0] = (double) opt;
					count = InputTriangle(list, count);
				}
				if (opt == 5) {
					for (int i = 0; i < count; i++) {
						if (list[i][0] == 1) {
							Circle circle = new Circle(list[i][1]);
							System.out.println("��� �b�|��" + list[i][1] + " ���n��" + circle.area());
						} else if (list[i][0] == 2) {
							Oval oval = new Oval(list[i][1], list[i][2]);
							System.out.println("���� �b�|��" + list[i][1] + "�P" + list[i][2] + " ���n��" + oval.area());
						} else if (list[i][0] == 3) {
							Rectangle rectangle = new Rectangle(list[i][1], list[i][2]);
							System.out.println("�x�� ���׬�" + list[i][1] + " �e�׬�" + list[i][2] + " ���n��" + rectangle.area());
						} else if (list[i][0] == 4) {
							Triangle triangle = new Triangle(list[i][1], list[i][2]);
							System.out.println("�T���� ������" + list[i][1] + " ���׬�" + list[i][2] + " ���n��" + triangle.area());
						}
					}

					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
	}

	// ��J���
	static int InputCircle(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double r;

		try {
			while (true) {
				System.out.print("�п�J��Υb�| : ");
				r = scanner.nextDouble();

				if (r <= 0)
					System.out.println("�b�|�����j��0 !");
				else {
					list[count][1] = r;
					list[count][2] = r;
					count++;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
		return count;
	}

	// ��J����
	static int InputOval(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double lr, sr;

		try {
			while (true) {
				System.out.print("�п�J���Ϊ��b�| : ");
				lr = scanner.nextDouble();

				if (lr <= 0)
					System.out.println("�b�|�����j��0 !");
				else {
					list[count][1] = lr;

					break;
				}
			}
			while (true) {
				System.out.print("�п�J���εu�b�| : ");
				sr = scanner.nextDouble();

				if (sr <= 0)
					System.out.println("�b�|�����j��0 !");
				else {
					list[count][2] = sr;
					count++;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
		return count;
	}

	// ��J�x��
	static int InputRectangle(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double h, w;

		try {
			while (true) {
				System.out.print("�п�J�x�Ϊ��� : ");
				h = scanner.nextDouble();

				if (h <= 0)
					System.out.println("���ץ����j��0 !");
				else {
					list[count][1] = h;
					break;
				}
			}
			while (true) {
				System.out.print("�п�J�x�μe�� : ");
				w = scanner.nextDouble();

				if (w <= 0)
					System.out.println("�e�ץ����j��0 !");
				else {
					list[count][2] = w;
					count++;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
		return count;
	}

	// ��J�T����
	static int InputTriangle(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double b, h;

		try {
			while (true) {
				System.out.print("�п�J�T���Ω��� : ");
				b = scanner.nextDouble();

				if (b <= 0)
					System.out.println("���������j��0 !");
				else {
					list[count][1] = b;
					break;
				}
			}
			while (true) {
				System.out.print("�п�J�T���ΰ��� : ");

				h = scanner.nextDouble();

				if (h <= 0)
					System.out.println("���ץ����j��0 !");
				else {
					list[count][2] = h;
					count++;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
		return count;
	}
}
