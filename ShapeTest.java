import java.util.Scanner;

abstract class Shape {
	abstract double area();
}

// 圓形
class Circle extends Shape {
	double r;

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		return 3.14 * r * r;
	}
}

// 橢圓形
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

// 矩形
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

// 三角形
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
	 * 實作第2.5節的Shape類別，並以此為基礎，設計一個類別用來描述三角形。
	 * 請在主函式中撰寫以下的功能；讓使用者連續根據選項輸入欲產生的形狀(圓形、橢圓形、矩形，或三角形)，請產生對應的物件並且將它們存在陣列中。
	 * 最後再全部印出來。印出來的時候請告訴使用者此物件是甚麼形狀？它們的面積又為何?
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] list = new double[100][3];
		int opt, count = 0;
		double input1, input2;

		try {
			while (true) {
				System.out.print("請輸入欲產生的形狀 1)圓形 2)橢圓形 3)矩形 4)三角形 5)印出 : ");
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
							System.out.println("圓形 半徑為" + list[i][1] + " 面積為" + circle.area());
						} else if (list[i][0] == 2) {
							Oval oval = new Oval(list[i][1], list[i][2]);
							System.out.println("橢圓形 半徑為" + list[i][1] + "與" + list[i][2] + " 面積為" + oval.area());
						} else if (list[i][0] == 3) {
							Rectangle rectangle = new Rectangle(list[i][1], list[i][2]);
							System.out.println("矩形 長度為" + list[i][1] + " 寬度為" + list[i][2] + " 面積為" + rectangle.area());
						} else if (list[i][0] == 4) {
							Triangle triangle = new Triangle(list[i][1], list[i][2]);
							System.out.println("三角形 底長為" + list[i][1] + " 高度為" + list[i][2] + " 面積為" + triangle.area());
						}
					}

					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
	}

	// 輸入圓形
	static int InputCircle(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double r;

		try {
			while (true) {
				System.out.print("請輸入圓形半徑 : ");
				r = scanner.nextDouble();

				if (r <= 0)
					System.out.println("半徑必須大於0 !");
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

	// 輸入橢圓形
	static int InputOval(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double lr, sr;

		try {
			while (true) {
				System.out.print("請輸入橢圓形長半徑 : ");
				lr = scanner.nextDouble();

				if (lr <= 0)
					System.out.println("半徑必須大於0 !");
				else {
					list[count][1] = lr;

					break;
				}
			}
			while (true) {
				System.out.print("請輸入橢圓形短半徑 : ");
				sr = scanner.nextDouble();

				if (sr <= 0)
					System.out.println("半徑必須大於0 !");
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

	// 輸入矩形
	static int InputRectangle(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double h, w;

		try {
			while (true) {
				System.out.print("請輸入矩形長度 : ");
				h = scanner.nextDouble();

				if (h <= 0)
					System.out.println("長度必須大於0 !");
				else {
					list[count][1] = h;
					break;
				}
			}
			while (true) {
				System.out.print("請輸入矩形寬度 : ");
				w = scanner.nextDouble();

				if (w <= 0)
					System.out.println("寬度必須大於0 !");
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

	// 輸入三角形
	static int InputTriangle(double list[][], int count) {
		Scanner scanner = new Scanner(System.in);
		double b, h;

		try {
			while (true) {
				System.out.print("請輸入三角形底長 : ");
				b = scanner.nextDouble();

				if (b <= 0)
					System.out.println("底長必須大於0 !");
				else {
					list[count][1] = b;
					break;
				}
			}
			while (true) {
				System.out.print("請輸入三角形高度 : ");

				h = scanner.nextDouble();

				if (h <= 0)
					System.out.println("高度必須大於0 !");
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
