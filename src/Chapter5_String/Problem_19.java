package Chapter5_String;


public class Problem_19 {

	public String pointNewchar(String str, int k){
		if(str == null || str.equals("")||k<0||k>=str.length()){
			return "";
		}
		char [] chas = str.toCharArray();
		int uNum = 0;
		for(int i=k-1;i>=0;i--){
			if(!isUpper(chas[i])){
				break;
			}
			uNum++;
		}
		if(uNum%2==1){
			return str.substring(k-1,k+1);
		}
		if(isUpper(chas[k])){
			return str.substring(k,k+2);
		}
		return String.valueOf(chas[k]);
	}
	
	private boolean isUpper(char c) {
		// TODO Auto-generated method stub
		if(c>='A' && c<='Z')
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaABCDEcBCg";
		Problem_19 p19 = new Problem_19();
		System.out.println(p19.pointNewchar(str, 7));
		System.out.println(p19.pointNewchar(str, 4));
		System.out.println(p19.pointNewchar(str, 10));

	}

}
