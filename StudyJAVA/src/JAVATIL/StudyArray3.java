package JAVATIL;

import java.util.Arrays;

public class StudyArray3 {
	public void getreverse(int[] x) { //버블정렬 연습 내림차순으로 만들어 봤다.
		int tmp; // 값을 넣어줄 임시값	
		for (int j=0; j<x.length-1; j++) {
			for(int i=0; i<x.length-1; i++) {		
				if(x[i]<x[i+1]) {
					tmp = x[i];
					x[i]= x[i+1];
					x[i+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
	
	
	
	
	public static void main(String[] args) {
		StudyArray3 a = new StudyArray3();
		int[] arr = {76,56,100,34,97,42,52};
		a.getreverse(arr);
		
		
	}
}


