// �г]�p�@�Ӧ�����������O�A�i�H�~���@��l�ơF�����O���Ѩ禡�i�H�P�_����榡�O�_���T�æL�X��������e�C
public class classDate {

	public static int year;
	public static int month;
	public static int day;

	public classDate() {// ��l��
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
				// �褸�~�����H4���i�㰣�A�����~�C
				// �褸�~�����H100�i�㰣�A�B���H400���i�㰣�A�����~
				else if ((year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) && month == 2 && (day < 1 || day > 28))
					return false;
				// �褸�~�����H4�i�㰣�A�B���H100���i�㰣�A���|�~�C
				// �褸�~�����H400�i�㰣�A���|�~�C
				else if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2 && (day < 1 || day > 29))
					return false;
				else
					return true;// �榡���T�^��true
			} else
				return false;
		} else
			return false;
	}
}
