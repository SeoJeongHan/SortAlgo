package sort_Exam.quick.impl;

import sort_Exam.quick.QuickSort;

public class QuickSortImpl implements QuickSort {

	@Override
	public void sortList(int[] arr, int len) {

		q_sort(arr, 0, len - 1);

	}

	private void q_sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) q_sort(data, l, right);
        if(r > left) q_sort(data, left, r);
	}
}
