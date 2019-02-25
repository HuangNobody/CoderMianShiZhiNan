package Chapter5_String;

import java.util.Arrays;

public class Problem_11 {

	public char [] rotateWord(char [] chas){
		if(chas == null|| chas.length ==0){
			return null;
		}
		reverse(chas, 0, chas.length-1);
		int l = -1;
		int r = -1;
		for(int i=0;i<chas.length;i++){
			if(chas[i] !=' '){
				l = i==0 ||chas[i-1] == ' ' ? i:l;
				r = i==chas.length-1 || chas[i+1] == ' ' ? i : r;
			}
			if(l != -1 && r != -1){
				reverse(chas, l, r);
				l = -1;
				r = -1;
			}
		}
		return chas;
	}
	
	public void reverse(char [] chas, int start, int end){
		char tmp =0;
		while(start <end){
			tmp = chas[start];
			chas[start] = chas[end];
			chas[end] = tmp;
			start++;
			end--;
		}
	}
	
	//²¹³äÎÊÌâ
	public char [] rotate1(char [] chas, int size){
		if(chas == null || size<=0||size>=chas.length){
			return null;
		}
		reverse(chas, 0, size-1);
		reverse(chas, size, chas.length-1);
		reverse(chas, 0, chas.length-1);
		return chas;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_11 p11 = new Problem_11();
		
		char [] chas = {'d','o','g',' ','l','o','v','e','s',' ','p','i','g'};
		
		char [] chas2 = {'a','b','c','d','e'};
		
		
		
		System.out.println(Arrays.toString(chas));
		System.out.println(Arrays.toString(p11.rotateWord(chas)));
		
		System.out.println(Arrays.toString(chas2));
		System.out.println(Arrays.toString(p11.rotate1(chas2, 3)));
		
		

	}

}
