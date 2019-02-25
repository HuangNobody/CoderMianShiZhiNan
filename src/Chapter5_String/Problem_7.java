package Chapter5_String;

public class Problem_7 {

	public String getCountString(String str){
		if(str == null || str.equals("")){
			return "";
		}
		char [] chs = str.toCharArray();
		String res = String.valueOf(chs[0]);
		int num = 1;
		for(int i=1;i<chs.length;i++){
			if(chs[i] != chs[i-1]){
				res = concat(res, String.valueOf(num), String.valueOf(chs[i]));
				num = 1;
			}else{
				num++;
			}
		}
		return concat(res, String.valueOf(num), "");
	}
	
	public String concat(String s1, String s2, String s3){
		return s1 + "_" + s2 + (s3.equals("") ? s3: "_" + s3);
	}
	
	//½ø½×ÎÊÌâ
	public char getCharAt(String cstr, int index){
		if(cstr == null || cstr.equals("")){
			return 0;
		}
		char [] chs = cstr.toCharArray();
		boolean stage = true;
		char cur = 0;
		int num = 0;
		int sum = 0;
		for(int i=0;i!=chs.length;i++){
			if(chs[i] == '_'){
				stage = !stage;
			}else if(stage){
				sum += num;
				if(sum > index){
					return cur;
				}
				num = 0;
				cur = chs[i];
			}else{
				num = num * 10 + chs[i] - '0';
			}
		}
		return sum + num > index ? cur : 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaabbaddffc";
		Problem_7 p7 = new Problem_7();
		System.out.println(p7.getCountString(str1));
		
		String str2 = "a_1_b_100";
		System.out.println(p7.getCharAt(str2, 50));

	}

}
