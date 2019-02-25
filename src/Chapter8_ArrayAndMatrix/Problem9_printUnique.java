package Chapter8_ArrayAndMatrix;

public class Problem9_printUnique {
	
	public void printUniquePair(int [] arr, int k){
		if(arr ==null|| arr.length<2)
			return ;
		int left = 0;
		int right = arr.length -1;
		while(left<right){
			if(arr[left]+arr[right]< k){
				left++;
			}else if(arr[left]+arr[right]>k){
				right--;
			}else{
				if(left==0 || arr[left-1]!=arr[left])
					System.out.println(arr[left] + "," + arr[right]);
				left++;
				right++;
			}
		}
	}
	
	public void printUniqueTriad(int [] arr, int k){
		if(arr == null || arr.length<3)
			return ;
		for(int i=0;i<arr.length-2;i++){
			if(i == 0||arr[i] !=arr[i-1]){
				printRest(arr, i, i+1, arr.length-1, k-arr[i]);
			}
		}
	}
	
	public void printRest(int [] arr, int f, int l, int r, int k){
		while(l < k){
			if(arr[l] + arr[r] <k){
				l++;
			}else if(arr[l] + arr[r] > k){
				r--;
			}else{
				if(l == f+1 || arr[l-1] != arr[l]){
					System.out.println(arr[f] +"," + arr[l]+"," +arr[r]);
				}
				l++;
				r++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {-8,-4,-3,0,1,2,4,5,8,9};
		int [] arr2 = {-8,-4,-3,0,1,2,4,5,8,9};
		Problem9_printUnique pp1 = new Problem9_printUnique();
		Problem9_printUnique pp2 = new Problem9_printUnique();
		
		pp1.printUniquePair(arr1, 9);
		pp2.printUniqueTriad(arr2, 10);//为什么不能同时输出？？？待解决

	}

}
