import java.util.Scanner;

public class InputBirthday {

	// �n�D�ϥΪ̿�J�L���m�W�H�Φ褸�ͤ�A�A�N�H����~���L�X�L���m�W�P�ͤ�C
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int year = 0, month = 0, day = 0;

		// ��J�m�W
		System.out.print("�п�J�m�W:");
		name = scanner.next();

		// ��J�ͤ�
		System.out.println("�п�J�ͤ�:");
		while (true) {
			try {
				System.out.print("�褸�~:");
				year = scanner.nextInt();
				if (year <= 1911 || year > 2016)
					System.out.println("��J�~���W�X�d�� !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("�п�J�Ʀr");
			}
		}
		while (true) {
			try {
				System.out.print("��:");
				month = scanner.nextInt();
				if (month < 1 || month > 12)
					System.out.println("��J����W�X�d�� !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("�п�J�Ʀr");
			}
		}
		while (true) {
			try {
				System.out.print("��:");
				day = scanner.nextInt();
				if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
						&& (day < 1 || day > 31))
					System.out.println("��J����W�X�d�� !");
				else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30))
					System.out.println("��J����W�X�d�� !");
				// �褸�~�����H4���i�㰣�A���H100�i�㰣�A���H400���i�㰣�A�����~�C
				else if ((year % 4 != 0 && year % 100 == 0 && year % 400 != 0) && month == 2 && (day < 1 || day > 28))
					System.out.println("��J����W�X�d�� !");
				// �褸�~�����H4�i�㰣�A���H100���i�㰣�A���H400�i�㰣�A���|�~�C
				else if ((year % 4 == 0 && year % 100 != 0 && year % 400 == 0) && month == 2 && (day < 1 || day > 29))
					System.out.println("��J����W�X�d�� !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("�п�J�Ʀr");
			}
		}

		// �L�X���G
		System.out.println("�ϥΪ� " + name + " �ͤ鬰����" + (year - 1911) + "�~" + month + "��" + day + "��");
	}

}
