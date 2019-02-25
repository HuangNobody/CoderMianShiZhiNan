package Chapter5_String;

import java.util.Arrays;

public class Problem1_isDeformation {
	
	public boolean isDeformation(String str1, String str2){
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		char [] chas1 = str1.toCharArray();
		//System.out.println(Arrays.toString(chas1));
		char [] chas2 = str2.toCharArray();
		int [] map = new int[256];
		//System.out.println(Arrays.toString(map));
		for(int i=0;i<chas1.length;i++){
			map[chas1[i]]++;
		}
		for(int i=0;i<chas2.length;i++){
			if(map[chas2[i]]-- == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "112";
		Problem1_isDeformation pi = new Problem1_isDeformation();
		
		System.out.println(pi.isDeformation(str1, str2));

	}

}
