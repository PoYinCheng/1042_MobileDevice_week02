import java.util.Random;

public class Number {

	public static void main(String[] args) {
		// 撰寫一個程式，先初始化一個數字陣列，在將此陣列中所有的數字的總和與平均計算出來。

		int[] num = new int[10];

		// 隨機產生1~100間的數字存入數字陣列中
		for (int i = 0; i < 10; i++) {
			Random ran = new Random();
			num[i] = ran.nextInt(100) + 1;
		}

		int sum = 0;

		// 計算總和
		for (int i = 0; i < 10; i++) {
			sum += num[i];
		}

		float ave = (float) sum / 10;

		// 印出結果
		for (int i = 0; i < 10; i++) {
			System.out.print(num[i]);
			if (i < 9)
				System.out.print(",");
		}
		System.out.println();
		System.out.println("總和：" + sum);
		System.out.println("平均：" + ave);
	}

}
