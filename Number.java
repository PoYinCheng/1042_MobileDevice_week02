import java.util.Random;

public class Number {

	public static void main(String[] args) {
		// ���g�@�ӵ{���A����l�Ƥ@�ӼƦr�}�C�A�b�N���}�C���Ҧ����Ʀr���`�M�P�����p��X�ӡC

		int[] num = new int[10];

		// �H������1~100�����Ʀr�s�J�Ʀr�}�C��
		for (int i = 0; i < 10; i++) {
			Random ran = new Random();
			num[i] = ran.nextInt(100) + 1;
		}

		int sum = 0;

		// �p���`�M
		for (int i = 0; i < 10; i++) {
			sum += num[i];
		}

		float ave = (float) sum / 10;

		// �L�X���G
		for (int i = 0; i < 10; i++) {
			System.out.print(num[i]);
			if (i < 9)
				System.out.print(",");
		}
		System.out.println();
		System.out.println("�`�M�G" + sum);
		System.out.println("�����G" + ave);
	}

}
