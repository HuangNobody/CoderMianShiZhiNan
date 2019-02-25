package Chapter8_ArrayAndMatrix;

import java.util.Arrays;

public class Problem23_partion {
	
	public void leftUnique(int [] arr){
		if(arr == null || arr.length <2)
			return ;
		int u = 0;//arr[0...u]都是无重复元素且升序
		int i = 1; // i做从左到右的遍历，arr[u+1...i]是不保证没有重复元素且升序的
		while(i!=arr.length){
			if(arr[i++] != arr[u]){
				swap(arr, ++u,i-1);
			}
		}
	}
	
	public void swap(int [] arr, int index1, int index2){
		int temp = arr[index1];
		 arr[index1] = arr[index2];
		 arr[index2] = temp;
	}
	
	//进阶问题
	public void sort(int [] arr){
		if(arr == null || arr.length <2)
			return ;
		int left = -1;
		int index = 0;
		int right = arr.length;
		while(index<right){
			if(arr[index] == 0){
				swap(arr,++left, index++);
			}else if(arr[index]  == 2){
				swap(arr, index, --right);
			}else{
				index++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,2,2,3,3,4,5,6,6,7,7,8,8,8,9};
		Problem23_partion pp =new Problem23_partion();
		pp.leftUnique(arr);
		System.out.println(Arrays.toString(arr));
		
		//进阶问题
		int [] arr2 = {1,2,0,2,2,1,1,0,2,0,2,1,1,2};
		pp.sort(arr2);
		System.out.println(Arrays.toString(arr2));

	}

}
