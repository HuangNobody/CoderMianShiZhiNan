package Chapter8_ArrayAndMatrix;

import java.util.Arrays;

public class Problem15_modify {
	
	public int [] modify(int [] arr){
		if(arr == null || arr.length<2)
			return null;
		int even =0;
		int odd = 1;
		int end = arr.length-1;
		while(even <=end && odd<= end){
			if(arr[end] %2 == 0){
				swap(arr, end, even);
				even +=2;
			}else{
				swap(arr, end, odd);
				odd+=2;
			}
		}
		return arr;
	}
	
	public void swap(int [] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,8,3,2,4,6};
		Problem15_modify pm = new Problem15_modify();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(pm.modify(arr)));

	}

}
