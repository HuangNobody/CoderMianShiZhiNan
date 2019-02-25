package Chapter8_ArrayAndMatrix;

public class Problem16_maxSum {
	
	public int maxSum(int [] arr){
		if(arr == null || arr.length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for(int i=0;i!=arr.length;i++){
			cur += arr[i];
			max = Math.max(max, cur);
			cur = cur< 0 ? 0:cur;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,-2,3,5,-2,6,-1};
		Problem16_maxSum pm = new Problem16_maxSum();
		System.out.println(pm.maxSum(arr));

	}

}
