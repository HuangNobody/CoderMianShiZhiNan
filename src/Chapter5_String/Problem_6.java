package Chapter5_String;

public class Problem_6 {

	public String replace(String str, String from, String to){
		if(str == null || from == null || str.equals("") || from.equals("")){ // str.equals("")如果str为空
			return str;
		}
		char [] chas = str.toCharArray();
		char [] chaf = from.toCharArray();
		int match = 0;
		for(int i=0;i< chas.length;i++){
			if(chas[i] == chaf[match++]){
				if(match == chaf.length){
					clear(chas, i, chaf.length);
					match = 0;
				}
			}else{
				if(chas[i] == chaf[0]){
					i--;
				}
				match = 0;
			}
		}
		
		String res = "";
		String cur = "";
		for(int i=0;i<chas.length;i++){
			if(chas[i] !=0){
				cur = cur+ String.valueOf(chas[i]);//转换成字符串
			}
			if(chas[i] ==0 && (i==0 ||chas[i-1] !=0)){
				res = res +cur +to;
				cur = "";
			}
		}
		if(!cur.equals("")){
			res = res + cur;
		}
		return res;
	}
	
	public void clear(char [] chas, int end, int len){
		while(len-- !=0){
			chas[end--] = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123abc";
		String from1 = "abc";
		String to1 = "4567";
		
		String str2 = "123";
		String from2 = "abc";
		String to2 = "456";
		
		String str3 = "123abcabc";
		String from3 = "abc";
		String to3 = "X";
		
		Problem_6 p = new Problem_6();
		System.out.println(p.replace(str1, from1, to1));
		System.out.println(p.replace(str2, from2, to2));
		System.out.println(p.replace(str3, from3, to3));

	}

}
