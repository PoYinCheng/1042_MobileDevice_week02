
public class GetTime {

	public static void main(String[] args) {
		//�N4�I23��45���13�I54��23�������`��ƿ�X

        //�]�w�}�l�ɶ����ɤ���
        int StartHour = 4;
        int StartMinute = 23;
        int StartSecond = 45;

        //�]�w�����ɶ����ɤ���
        int EndHour = 13;
        int EndMinute = 54;
        int EndSecond = 23;

        //�N�}�l�ɶ��ε����ɶ��ഫ�����
        int StartTime = StartHour*60*60 + StartMinute*60 + StartSecond;
        int EndTime = EndHour*60*60 + EndMinute*60 + EndSecond;

        //�ɶ��t�������ɶ���}�l�ɶ�
        System.out.println("�ɶ��t�G"+(EndTime-StartTime)+"��");
	}

}
