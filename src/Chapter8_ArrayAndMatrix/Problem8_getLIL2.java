package Chapter8_ArrayAndMatrix;

import java.util.HashSet;

public class Problem8_getLIL2 {
	public int getLIL2(int [] arr){
		if(arr ==null ||arr.length ==0)
			return 0;
		int len = 0;
		int max = 0;
		int min = 0;
		HashSet<Integer> set = new HashSet<Integer>(); // 判断重复
		for(int i=0;i<arr.length;i++){
			//max = Integer.MAX_VALUE;
			//min = Integer.MIN_VALUE;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;   //刚开始写成上面那样，一直没发现，坑爹
			for(int j = i;j<arr.length;j++){
				if(set.contains(arr[j])){
					break;
				}
				set.add(arr[j]);
				max = Math.max(max, arr[j]);
				min = Math.min(min, arr[j]);
				if(max-min == j-i){//新的检验公式
					len = Math.max(len,j-i+1);
				}
			}
			set.clear(); //不要忘了。不然就内存泄漏了
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,5,3,2,6,4,3};
		Problem8_getLIL2 p = new Problem8_getLIL2();
		System.out.println(p.getLIL2(array));

	}

}
