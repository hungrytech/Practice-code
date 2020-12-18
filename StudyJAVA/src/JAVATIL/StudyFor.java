package JAVATIL;

public class StudyFor {
	
	//switch 연습
	public void practiceSwitch(int value) {
		switch(value) {
		case 3 :
			System.out.println("전 3입니다.");
			break;
		case 5 :
			System.out.println("전 5입니다.");
		case 10 :
			System.out.println("전 10입니다 그리고 break없어서 저도 나와요");
		}
	}
	// for문 연습 받은값까지 짝수 홀수의 각각의 합 출력
	public void practiceFor(int value) {
		int resultEven=0;
		int resultOdd=0;
		for(int i=1; i<value+1; i++) {
			if(i%2==0) {
				resultEven+=i;
			}else if(i%2!=0) {
				resultOdd+=i;
			}
		}//for문 끝
		System.out.println("짝수의합:"+resultEven+"홀수의합:"+resultOdd);
	}
	
	public static void main(String[] args) {
		StudyFor stf = new StudyFor();
		//switch 함수
		stf.practiceSwitch(3);
		stf.practiceSwitch(5);
		stf.practiceSwitch(10);
		//for문 함수
		stf.practiceFor(10);
//		stf.practiceFor(100);
		
	}
}
