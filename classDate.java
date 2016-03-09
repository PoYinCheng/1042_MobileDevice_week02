// 請設計一個有關日期的類別，可以年月日作初始化；此類別提供函式可以判斷日期格式是否正確並印出日期的內容。
public class classDate {

	public static int year;
	public static int month;
	public static int day;

	public classDate() {// 初始化
		year = 0;
		month = 0;
		day = 0;
	}

	public static boolean checkFormat() {//int year, int month, int day
		if (year > 0) {
			if (month >= 1 && month <= 12) {
				if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
						&& (day < 1 || day > 31))
					return false;
				else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30))
					return false;
				// 西元年份除以4不可整除，為平年。
				// 西元年份除以100可整除，且除以400不可整除，為平年
				else if ((year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) && month == 2 && (day < 1 || day > 28))
					return false;
				// 西元年份除以4可整除，且除以100不可整除，為閏年。
				// 西元年份除以400可整除，為閏年。
				else if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2 && (day < 1 || day > 29))
					return false;
				else
					return true;// 格式正確回傳true
			} else
				return false;
		} else
			return false;
	}
}
