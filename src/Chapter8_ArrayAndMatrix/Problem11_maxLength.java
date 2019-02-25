package Chapter8_ArrayAndMatrix;

import java.util.HashMap;

public class Problem11_maxLength {
	
	public int maxLength(int [] arr,int k){
		if(arr == null || arr.length == 0)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int len = 0;
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];
			if(map.containsKey(sum-k)){
				len = Math.max(i - map.get(sum-k), len);
			}
			if(!map.containsKey(sum)){
				map.put(sum, i);
			}
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={1,2,3,3};
		Problem11_maxLength pm = new Problem11_maxLength();
		System.out.println(pm.maxLength(arr, 6));

	}
}

//这个题有点动态规划的意思，不太好懂！！！！！！！！重点
