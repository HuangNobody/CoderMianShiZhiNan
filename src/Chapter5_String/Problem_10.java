package Chapter5_String;

import java.util.Arrays;

public class Problem_10 {

	public char [] replace(char [] chas){
		if(chas == null || chas.length == 0){
			return null;
		}
		int num = 0;
		int len = 0;
		for(len = 0;len<chas.length&&chas[len] !=0;len++){
			if(chas[len] == ' '){
				num++;
			}
		}
		int j = len + num * 2-1;
		for(int i = len -1;i>-1;i--){
			if(chas[i] !=' '){
				chas[j--] = chas[i];
			}else{
				chas[j--] = '0';
				chas[j--] = '2';
				chas[j--] = '%';
			}
		}
		return chas;
	}
	
	public char [] modify(char [] chas){
		if(chas == null || chas.length== 0){
			return null;
		}
		int j= chas.length -1;
		for(int i=chas.length-1;i>-1;i--){
			if(chas[i] !='*'){
				chas[j--] = chas[i];
			}
		}
		for(;j>-1;){
			chas[j--] = '*';
		}
		return chas;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_10 p10 = new Problem_10();
		
		char [] chas1 = {'a',' ','b',' ',' ','c',0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println(Arrays.toString(chas1));
		System.out.println(Arrays.toString(p10.replace(chas1)));
		
		char [] chas2 = {'1', '2', '*', '*', '3','4','5'};
		System.out.println(Arrays.toString(chas2));
		System.out.println(Arrays.toString(p10.modify(chas2)));
		

	}

}
