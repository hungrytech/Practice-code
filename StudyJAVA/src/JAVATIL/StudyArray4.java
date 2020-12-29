package JAVATIL;

import java.util.Arrays;

public class StudyArray4 {
	int[] arr;
	
	
	public void createArray(int length) { // 배열 생성
		this.arr=new int[length];
	}
	public void push(int index, int value) { // 배열에 넣기
		this.arr[index]=value;
	}
	
	public void delete(int index) {
		int[] tmp = new int[this.arr.length-1];
		System.arraycopy(this.arr, 0, tmp, 0, this.arr.length-1);
		for(int i=index; i<tmp.length; i++) {
			if(i==tmp.length-1) 
				tmp[tmp.length-1]= this.arr[this.arr.length-2];
			tmp[i] = this.arr[i+1];
			
		}
		this.arr= tmp;
	}
	
	public static void main(String[] args) {
		StudyArray4 a = new StudyArray4();
		a.createArray(6);
		// 인덱스 번호와 들어갈 값 
		a.push(1, 3); 
		a.push(2, 4);
		a.push(3, 5);
		a.push(4, 6);
		a.push(5, 7);
		System.out.println(Arrays.toString(a.arr)); // 기존 배열값 확인
		
		a.delete(3); // 3번인덱스를 지운후
		System.out.println(Arrays.toString(a.arr)); // 배열값 확인
		
		a.delete(2);
		System.out.println(Arrays.toString(a.arr)); // 배열값 확인
	}

}
