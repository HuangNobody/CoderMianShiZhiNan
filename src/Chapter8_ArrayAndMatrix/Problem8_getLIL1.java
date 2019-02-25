package Chapter8_ArrayAndMatrix;

import java.util.Arrays;

public class Problem8_getLIL1 {
	public int getLIL1(int [] arr){
		if(arr == null || arr.length == 0)
			return 0;
		int len = 0;
		for(int i=0;i<arr.length;i++){
			for(int j = i;j<arr.length;j++){
				if(isIntegrated(arr, i, j)){
					len = Math.max(len, j-i+1);
				}
			}
		}
		return len;
	}
	
	public boolean isIntegrated(int [] arr, int left, int right){
		int [] newArr = Arrays.copyOfRange(arr, left, right+1);//O(n)
		Arrays.sort(newArr);  // O(nlogn)
		for(int i=1;i<newArr.length;i++){
			if(newArr[i-1] != newArr[i] -1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,5,3,2,6,4,3};
		Problem8_getLIL1 pg = new Problem8_getLIL1();
		System.out.println(pg.getLIL1(array));

	}

}

//总的时间复杂度为O（n^3logn）
