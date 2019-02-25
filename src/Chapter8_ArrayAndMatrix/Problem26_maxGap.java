package Chapter8_ArrayAndMatrix;

public class Problem26_maxGap {
	
	public int maxGap(int [] nums){
		if(nums == null ||nums.length<2)
			return 0;
		int len = nums.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<len;i++){
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		if(min == max)
			return 0;
		boolean [] hasNum = new boolean[len +1];
		int [] maxs = new int [len+1];
		int [] mins =new int[len+1];
		int bid = 0;
		for(int i=0;i<len;i++){
			bid= bucket(nums[i],len, min, max);
			mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]):nums[i];
			maxs[bid] = hasNum[bid] ? Math.max(mins[bid], nums[i]):nums[i];
			hasNum[bid]= true;
		}
		int res = 0;
		int lastMax = 0;
		int i=0;
		while(i<=len){
			if(hasNum[i++]){//�ҵ���һ����Ϊ�յ�Ͱ
				lastMax = maxs[i-1];
				break;
			}
		}
		for(;i<=len;i++){
			if(hasNum[i]){
				res = Math.max(res, mins[i] - lastMax);
				lastMax = maxs[i];
			}
		}
		return res;
	}
	
	//ʹ��long������Ϊ�˷������ʱ���
	public int bucket(long num, long len, long min, long max){
		return (int)((num-min)*len/(max-min));
	}

	public static void main(String[] args) {
		int [] arr = {9,3,1,10};
		int [] arr2 = {5,5,5,5};
		Problem26_maxGap pm = new Problem26_maxGap();
		
		System.out.println(pm.maxGap(arr));
		//System.out.println(pm.maxGap(arr2));
	}
}

//����������ȷ��û�ҵ����󣬴����������������������
