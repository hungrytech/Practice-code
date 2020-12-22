package JAVATIL;

import java.util.Arrays;

public class StudyArray1 {

	public void lotto(int i) {//로또번호 랜덤으로 추점한 번호를 5번추첨한것을 보여주는 메서드
		if (i>=6) return;
		int[] lottoNumber = new int[6];
		for (int k=0; k<6; k++) {
			int randomNumber = (int)((Math.random()*45)+1);
			lottoNumber[k]= randomNumber;
		}
		lotto(i+1);
		// 재귀함수는 스택처럼 작동하기 때문에 스택에서 지우면서 출력.
		System.out.println(Arrays.toString(lottoNumber));	
		
	}
	public static void main(String[] args) {
		StudyArray1 start = new StudyArray1();
		start.lotto(1); // 로또 자동으로 5장 주세요~
	}
	
}
