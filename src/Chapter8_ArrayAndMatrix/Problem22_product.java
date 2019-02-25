package Chapter8_ArrayAndMatrix;

import java.util.Arrays;

public class Problem22_product {
	
	public int [] product1(int [] arr){
		if(arr== null || arr.length < 2)
			return null;
		int count  = 0;
		int all = 1;
		for(int i=0;i !=arr.length;i++){
			if(arr[i] !=0){
				all *= arr[i];
			}else{
				count++;
			}
		}
		
		int [] res = new int [arr.length];//结果数组
		if(count ==0){
			for(int i=0;i!=arr.length;i++){
					res[i] = all/arr[i];
			}
		}
		
		if(count ==1){
			for(int i=0;i!=arr.length;i++){
				if(arr[i] == 0){
					res[i] = all;
				}
			}
		}
		return res;
	}
	
	//方法2，不用除法
	public static int [] product2(int [] arr){
		if(arr == null || arr.length <2)
			return null;
		int [] res = new int [arr.length];
		res[0] = arr[0];
		for(int i=1;i<arr.length;i++){
			res[i] = res[i-1] * arr[i];
		}
		int tmp=1;
		for(int i=arr.length-1;i>0;i--){
			res[i] = res[i-1] * tmp;
			tmp *= arr[i];
		}
		res[0] = tmp;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,3,1,4};
		int [] arr2 = {2,0,1,4};
		int [] arr3 = {2,0,1,0};
		Problem22_product pp=new Problem22_product();
		System.out.println(Arrays.toString(pp.product1(arr1)));
		System.out.println(Arrays.toString(pp.product1(arr2)));
		System.out.println(Arrays.toString(pp.product1(arr3)));
		
		System.out.println(Arrays.toString(pp.product2(arr1)));
		System.out.println(Arrays.toString(pp.product2(arr2)));
		System.out.println(Arrays.toString(pp.product2(arr3)));

	}

}
