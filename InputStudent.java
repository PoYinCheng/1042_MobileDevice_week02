import java.util.Scanner;

public class InputStudent {

	// �s��n�D�ϥΪ̿�J��ơA�]�A�ǥͩm�W�P�䦨�Z�A��J����ϥΪ̥i�H�i�@�B��J�s���ӧ�X�������ǥ͸�ơF
	// �p�G�ϥΪ̦b��J���Z�ɿ�J���O�X�k���Ʀr�r��A�h�{�������i�H�L�X���~�T���[�Hĵ�i(���ܡGNumberFormatException)�C
	public static void main(String[] args) {
		int count = 0, student = 0;
		Scanner scanner = new Scanner(System.in);

		// ��J�ǥͤH��
		while (true) {
			try {
				System.out.print("�п�J�ǥͤH��:");
				student = scanner.nextInt();
				if (student <= 0)
					System.out.println("�H�Ƥ��o�֩�0 !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("�п�J�Ʀr");
			}
		}

		String[] name = new String[100];
		int[] grade = new int[100];

		// ��J�m�W�B���Z
		while (count < student) {
			String input;
			System.out.printf("�п�J�ǥ�%d�m�W:", count + 1);
			name[count] = scanner.next();
			while (true) {
				try {
					System.out.printf("�п�J�ǥ�%d���Z:", count + 1);
					input = scanner.next();
					if (Integer.parseInt(input) >= 0 && Integer.parseInt(input) <= 100) {
						grade[count] = Integer.parseInt(input);
						break;
					} else
						System.out.println("���Z�d�򶷤���0~100����");
				} catch (NumberFormatException ex) {
					System.out.println("�п�J�Ʀr !");
				}
			}
			count++;
		}

		//�d�߾ǥ͸��
		int option = 0, num = 0;
		while (option != 2) {
			System.out.print("�ﶵ 1)�d�� 2)���} : ");
			option = scanner.nextInt();
			if (option == 1) {
				System.out.print("�п�J�s�� : ");
				num = scanner.nextInt();
				System.out.println("�m�W : " + name[num - 1]);
				System.out.println("���Z : " + grade[num - 1]);
			}
			if (option == 2)
				break;
		}
	}

}
