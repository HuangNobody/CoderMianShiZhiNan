package Chapter8_ArrayAndMatrix;

public class Problem17_maxSum {
	
	public int maxSum(int [][] m){
		if(m == null || m.length == 0|| m[0].length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int cur = 0;
		int [] s = null;
		for(int i=0;i!=m.length;i++){
			s = new int[m[0].length];
			for(int j=i;j!=m.length;j++){
				cur = 0;
				for(int k=j;k!=s.length;k++){
					s[k] +=m[j][k];
					cur += s[k];
					max = Math.max(max, cur);
					cur = cur < 0 ? 0:cur;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m ={{-90,48,78},{64,-40,64},{-81,-7,66}};
		Problem17_maxSum pm = new Problem17_maxSum();
		System.out.println(pm.maxSum(m));

	}

}
