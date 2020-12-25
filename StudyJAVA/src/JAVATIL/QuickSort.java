package JAVATIL;

import java.util.Arrays;

public class QuickSort {

	public void swap(int[] arr, int low, int high) {
		int tmp; // �������� �ӽð�
		tmp = arr[low];
		arr[low] = arr[high];
		arr[high] = tmp;
	}

	public void quickSort(int[] arr, int low, int high) {
		if (low >= high)
			return; // �迭�� ���̰� 1�̸� ���� �Ϸ�
		int pivot = arr[(low + high) / 2]; // �迭�� �߰���
		int left = low; // ���� index
		int right = high; // ������ index
		while (left <= right) {
			while (arr[left] < pivot)
				left++;
			while (arr[right] > pivot)
				right--;
			if (left <= right) {
				swap(arr, left, right); // ���ǿ� ������ swap �ϱ�
				left++;
				right--;
			}
		}

		if (low <= right)
			quickSort(arr, low, right); // ����
		if (left <= high)
			quickSort(arr, left, high); // ������

	}

	public static void main(String[] args) {
		int[] a = { 52, 42, 46, 24, 2, 68, 3};
		QuickSort start = new QuickSort();
		start.quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

}
