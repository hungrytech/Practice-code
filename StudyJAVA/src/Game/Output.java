package Game;

public class Output {
	public static void main(String[] args) {
		Champion zed= new ZED();
		Keyboard me = zed;
		
		
		
		
		
		
		System.out.println("q������="+me.clikQ());
		System.out.println("w ��ǥ��="+me.clikW());
		System.out.println("e������="+me.clikE());
		
		
		System.out.println("�ش�è�Ǿ��� ���� ä��="+me.clikR(new ZED()));
	}
}
