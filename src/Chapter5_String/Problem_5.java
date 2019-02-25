package Chapter5_String;

public class Problem_5 {

	public boolean isValid(char [] chas){
		if(chas[0] != '-' && (chas[0] < '0' || chas[0] >'9'))
			return false;
		if(chas[0] == '-' && (chas.length == 1 ||chas[1] == '0'))
			return false;
		if(chas[0] == '0' && chas.length>1)
			return false;
		for(int i=1; i<chas.length;i++){
			if(chas[i] < '0' || chas[i] > '9'){
				return false;
			}
		}
		return true;
	}
	
	public int convert(String str){
		if(str == null || str.equals("")){
			return 0;//不能转
		}
		char [] chas = str.toCharArray();
		if(!isValid(chas)){
			return 0;//不能转
		}
		boolean posi = chas[0] == '-' ? false:true;
		int minq = Integer.MIN_VALUE / 10;
		int minr = Integer.MIN_VALUE % 10;
		int res = 0;
		int cur =0;
		for(int i =posi ?0:1;i<chas.length;i++){
			cur = '0' - chas[i];
			if(res < minq || (res == minq && cur < minr)){
				return 0;//不能转
			}
			res = res * 10 + cur;
		}
		if(posi && res == Integer.MIN_VALUE){
			return 0;
		}
		return posi? -res:res;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String str1 = "123";
		String str2 = "023";
		String str3 = "A13";
		String str4 = "0";
		String str5 = "2147483647";
		String str6 = "2147483648";
		String str7 = "-123";
		
		Problem_5 p = new Problem_5();
		System.out.println(p.convert(str1));
		System.out.println(p.convert(str2));
		System.out.println(p.convert(str3));
		System.out.println(p.convert(str4));
		System.out.println(p.convert(str5));
		System.out.println(p.convert(str6));
		System.out.println(p.convert(str7));
		

	}

}
