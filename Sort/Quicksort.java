package Sist.com.array;

import java.util.Arrays;

public class Quicksort {
	public void swap (int[] arr, int low, int high) { 
		int tmp; // �������� �ӽð�
		tmp= arr[low];
		arr[low] = arr[high];
		arr[high] = tmp;
		
	}
	
	
	public void quickSort(int[] arr, int low, int high) {
		if (low >= high) return; // �迭�� ���̰� 1�̸� ���� �Ϸ�
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
			
		
		if(low<right) quickSort(arr, low, right); // ���� 
		if(left < high) quickSort(arr, left, high); // ������
				
	}
	public static void main (String[] args) {
		int[] a = {42,46,24,2,68,1,22,86,3,34,15};
		Quicksort start = new Quicksort();
		start.quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
