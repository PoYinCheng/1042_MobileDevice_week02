import java.util.Scanner;

public class CheckYear {

	// ���g�{�����n�D�ϥΪ̿�J�@�Ӧ褸���~���A�A�L�X�@�Ӫ����ܩҦ����~�����e���|�~�C
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, count = 0;

		while (true) {
			try {
				System.out.print("�п�J�褸�~:");
				input = scanner.nextInt();
				if (input < 0)
					System.out.println("��J�~���W�X�d�� !");
				else
					break;
			} catch (Exception ex) {
				System.out.println("�п�J�Ʀr");
			}
		}

		// �P�_�|�~�æL�X
		int year = 1;
		while (year <= input) {
			// �褸�~�����H4�i�㰣�A�B���H100���i�㰣�A���|�~�C
			// �褸�~�����H400�i�㰣�A���|�~�C
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.print(year);
				count++;
			}
			if (count % 10 == 0)
				System.out.println();
			else
				System.out.print(" ");
			year++;
		}
		System.out.println("�@" + count + "��");

	}

}
