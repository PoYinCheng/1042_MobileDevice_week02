import java.util.Scanner;

public class Operation {

	// �ϥ�if�Pswitch�ԭz���g�@�ӵ{�����ϥΪ̿�J��ӯB�I�Ʀr�A�бq�|�h�B�⤤��ܤ@���B��l�A���{���|�N�o��ӼƦr�A�ھڹB��l�Ӱ��p��C
	// �Ъ`�N���Ƥ��i��0�A�p�G��0�A�ЦL�X���~�T���C
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1 = 0, num2 = 0;
		int option = 0;

		System.out.println("�п�J��1�ӯB�I�� : ");
		num1 = scanner.nextFloat();
		System.out.println("�п�J��2�ӯB�I�� : ");
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
					System.out.println("���Ƥ��i��0 !");
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
				System.out.print("�ﶵ 1)+ 2)- 3)* 4)/ 5)���� : ");
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
				System.out.println("�п�J�Ʀr");
			}
		}
	}
}
