package Sist.com.array;

import java.util.Arrays;

public class Quicksort {
	public void swap (int[] arr, int low, int high) { 
		int tmp; // 저장해줄 임시값
		tmp= arr[low];
		arr[low] = arr[high];
		arr[high] = tmp;
		
	}
	
	
	public void quickSort(int[] arr, int low, int high) {
		if (low >= high) return; // 배열의 길이가 1이면 정렬 완료
		int pivot = arr[(low+high)/2]; // pivot
		int left = low;
		int right= high;
		do {
			while(arr[left]< pivot)
				left++;
			while(arr[right]>pivot)
				right--;
			if(left <=right) {
				swap(arr, left, right);
				left++;
				right--;
				
			}
		}while(left <= right);
			
		
		if(low<right) quickSort(arr, low, right); // 왼쪽 
		if(left < high) quickSort(arr, left, high); // 오른쪽
				
	}
	public static void main (String[] args) {
		int[] a = {42,46,24,2,68,1,22,86,3,34,15};
		Quicksort start = new Quicksort();
		start.quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
