package Game;

public class Output {
	public static void main(String[] args) {
		Champion zed= new ZED();
		Keyboard me = zed;
		
		
		
		
		
		
		System.out.println("q데미지="+me.clikQ());
		System.out.println("w 좌표값="+me.clikW());
		System.out.println("e데미지="+me.clikE());
		
		
		System.out.println("해당챔피언의 남은 채력="+me.clikR(new ZED()));
	}
}
