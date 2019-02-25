package Chapter8_ArrayAndMatrix;

import java.util.Arrays;

public class Problem14_sort1 {
	
	public int [] sort1(int [] arr){
		int tmp = 0;
		int next =0;
		for(int i=0;i<arr.length;i++){
			tmp = arr[i];
			while(arr[i] != i+1){
				next = arr[tmp-1];
				arr[tmp-1] = tmp;
				tmp = next;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,5,3,4};
		Problem14_sort1 ps = new Problem14_sort1();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ps.sort1(arr)));

	}

}
