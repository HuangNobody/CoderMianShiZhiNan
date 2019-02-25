package Chapter5_String;

public class Problem_14 {

	public boolean isValid(String str){
		if(str == null || str.equals(" ")){
			return false;
		}
		char [] chas = str.toCharArray();
		int status = 0;
		for(int i=0;i<chas.length;i++){
			if(chas[i] !=')' && chas[i] !='('){
				return false;
			}
			if(chas[i] == ')' && --status <0){
				return false;
			}
			if(chas[i] == '('){
				status++;
			}
		}
		return status == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "()";
		String str2 = "(()())";
		String str3 = "())";
		Problem_14 p14 = new Problem_14();
		System.out.println(p14.isValid(str1));
		System.out.println(p14.isValid(str2));
		System.out.println(p14.isValid(str3));

	}

}
