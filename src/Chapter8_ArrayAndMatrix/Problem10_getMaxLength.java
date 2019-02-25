package Chapter8_ArrayAndMatrix;

public class Problem10_getMaxLength {
	public int getMaxLength(int [] arr, int k){
		if(arr == null || arr.length ==0 ||k <=0)
			return 0;
		int left = 0;
		int right = 0;
		int sum = arr[0];
		int len = 0;
		while(right<arr.length){
			if(sum == k){
				len = Math.max(len, right-left+1);
				sum -= arr[left++];
			}else if(sum<k){
				right++;
				if(right==arr.length)
					break;
				sum +=arr[right];
			}else{
				sum -=arr[left++];
			}
		}
		return len;
	}
	
	public static void main(String [] args){
		int [] arr = {1,2,1,1,1,};
		Problem10_getMaxLength pg = new Problem10_getMaxLength();
		System.out.println(pg.getMaxLength(arr, 3));
	}

}
