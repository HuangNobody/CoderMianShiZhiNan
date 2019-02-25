package Chapter8_ArrayAndMatrix;

public class Problem18_getLessIndex {
	
	public int getLessIndex(int [] arr){
		if(arr == null ||arr.length == 0)
			return -1;   //²»´æÔÚ
		if(arr.length ==1||arr[0]<arr[1])
			return 0;
		if(arr[arr.length-1]<arr[arr.length-2])
			return arr.length-1;
		int left = 1;
		int right = arr.length-2;
		int mid =0;
		while(left<right){
			mid = (left+mid) /2;
			if(arr[mid]>arr[mid-1]){
				right = mid-1;
			}else if(arr[mid]>arr[mid+1]){
				left = mid+1;
			}else{
				return mid;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,-2,3,5,-2};
		Problem18_getLessIndex pg = new Problem18_getLessIndex();
		System.out.println(pg.getLessIndex(arr));

	}

}
