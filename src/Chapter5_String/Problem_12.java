package Chapter5_String;

public class Problem_12 {

	public int minDistance(String [] strs, String str1, String str2){
		if(str1 == null || str2 == null){
			return -1;
		}
		if(str1.equals(str2)){
			return 0;
		}
		int last1 = -1;
		int last2 = -1;
		int min = Integer.MAX_VALUE;
		for(int i=0;i!=strs.length;i++){
			if(strs[i].equals(str1)){
				min = Math.min(min, last2 == -1? min:i-last2);
				last1 = i;
			}
			if(strs[i].equals(str2)){
				min = Math.min(min, last1 == -1?min:i-last1);
				last2= i;
			}
		}
		return min==Integer.MAX_VALUE ? -1:min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {"1","3","3","3","2","3","1"};
		String str1 = "1";
		String str2 = "2";
		Problem_12 p12 = new Problem_12();
		System.out.println(p12.minDistance(strs, str1, str2));

	}

}
