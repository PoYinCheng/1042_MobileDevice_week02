import java.util.Scanner;

public class CheckDate {

	// 請設計一個有關日期的類別，可以年月日作初始化；此類別提供函式可以判斷日期格式是否正確並印出日期的內容。
	// 另外，請撰寫主函式用來測試這個類別是否正確。
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("請輸入日期");
			System.out.print("年 : ");
			classDate.year = scanner.nextInt();
			System.out.print("月 : ");
			classDate.month = scanner.nextInt();
			System.out.print("日 : ");
			classDate.day = scanner.nextInt();
			if (classDate.checkFormat() == true)
				System.out.println(classDate.year + "年" + classDate.month + "月" + classDate.day + "日");
			else
				System.out.println("輸入格式錯誤 !");
		} catch (Exception ex) {
			System.out.println("輸入格式錯誤 !");
		}
	}
}
