package Chapter8_ArrayAndMatrix;

import java.util.Arrays;

public class Problem14_sort2 {
	
	public int [] sort2(int [] arr){
		int tmp = 0;
		for(int i=0;i!=arr.length;i++){
			while(arr[i] != i+1){
				tmp = arr[arr[i]- 1];
				arr[arr[i]- 1] = arr[i];
				arr[i] = tmp;
 			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,5,3,4};
		Problem14_sort1 ps = new Problem14_sort1();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ps.sort1(arr)));
	}

}
