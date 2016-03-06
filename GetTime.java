
public class GetTime {

	public static void main(String[] args) {
		//將4點23分45秒到13點54分23秒之間的總秒數輸出

        //設定開始時間之時分秒
        int StartHour = 4;
        int StartMinute = 23;
        int StartSecond = 45;

        //設定結束時間之時分秒
        int EndHour = 13;
        int EndMinute = 54;
        int EndSecond = 23;

        //將開始時間及結束時間轉換成秒數
        int StartTime = StartHour*60*60 + StartMinute*60 + StartSecond;
        int EndTime = EndHour*60*60 + EndMinute*60 + EndSecond;

        //時間差為結束時間減掉開始時間
        System.out.println("時間差："+(EndTime-StartTime)+"秒");
	}

}
