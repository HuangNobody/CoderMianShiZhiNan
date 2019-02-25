package Chapter5_String;

public class Problem_9 {

	public int getIndex(String [] strs, String str){
		if(strs == null|| strs.length == 0 || str == null){
			return -1;
		}
		int res = -1;
		int left = 0;
		int right = strs.length -1;
		int mid = 0;
		int i =0;
		while(left <= right){
			mid = (left + right) / 2;
			if(strs[mid] != null && strs[mid].equals(str)){
				res = mid;
				right = mid -1;
			}else if(strs[mid] != null){
				if(strs[mid].compareTo(str)<0){
					left = mid +1;
				}else{
					right = mid -1;
				}
			}else{
				i = mid;
				while(strs[i] == null && --i>=left){//我最开始把“&&”写成“||”，结果示例3不能输出结果
					;
				}
				if(i<left || strs[i].compareTo(str)<0){
					left = mid +1;
				}else{
					res = strs[i].equals(str) ? i:res;
					right = i-1;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {null, "a", null, "a", null, "b", null, "c"};
		String str = "a";
		String [] strs1 = {null, "a", null, "a", null, "b", null, "c"};
		String str1 = null;
		
		String [] strs2 = {null, "a", null, "a", null, "b", null, "c"};
		String str2 = "d";
		
		Problem_9 p9 = new Problem_9();
		System.out.println(p9.getIndex(strs, str));
		System.out.println(p9.getIndex(strs1, str1));
		System.out.println(p9.getIndex(strs2, str2));

	}

}
