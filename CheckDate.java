import java.util.Scanner;

public class CheckDate {

	// �г]�p�@�Ӧ�����������O�A�i�H�~���@��l�ơF�����O���Ѩ禡�i�H�P�_����榡�O�_���T�æL�X��������e�C
	// �t�~�A�м��g�D�禡�ΨӴ��ճo�����O�O�_���T�C
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("�п�J���");
			System.out.print("�~ : ");
			classDate.year = scanner.nextInt();
			System.out.print("�� : ");
			classDate.month = scanner.nextInt();
			System.out.print("�� : ");
			classDate.day = scanner.nextInt();
			if (classDate.checkFormat() == true)
				System.out.println(classDate.year + "�~" + classDate.month + "��" + classDate.day + "��");
			else
				System.out.println("��J�榡���~ !");
		} catch (Exception ex) {
			System.out.println("��J�榡���~ !");
		}
	}
}
