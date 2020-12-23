package JAVATIL;



public class StudyArray2 {
	public void getmode(int[] x) {// 최빈값 구하기
		int[] tmp = new int[x.length];//최빈수 세주는 배열
		int inputdata; //일시적인 데이터
		for(int i=0; i<tmp.length; i++) {
			tmp[i]=0;
		}// 1으로 초기화 시켜준다.
		for(int i=0; i<x.length; i++) {// 빈도수만큼 세주기
			inputdata = x[i];
			for(int j=1; j<x.length; j++) {
				if(inputdata==x[j]) {
					tmp[i]++;
				}
			}
		}
		for(int i=0; i<tmp.length; i++) { // 최빈값 구하기
			if (tmp[i]>1) {
				for (int j=1; j<x.length; j++) {
					if(x[i]==x[j]) continue;
					
				}
				System.out.printf("최빈값:%2d 그 갯수:%2d",x[i],tmp[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		StudyArray2 get = new StudyArray2();
		int [] arr = {78,15,46,15,26,48,25};
		get.getmode(arr);
		
	}
}
