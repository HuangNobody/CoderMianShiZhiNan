package Chapter5_String;

import java.util.HashMap;

public class Problem_8_2 {
	
	public boolean isUnique2(char [] chas){
		if(chas == null){
			return true;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<chas.length;i++){
			if(map.containsKey(chas[i])){
				return false;
			}else{
				map.put(chas[i], 1);
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		char chas1 [] = {'a', 'b', 'c'};
		char chas2 [] = {'1', '2', '1'};
		Problem_8_2 p =new Problem_8_2();
		System.out.println(p.isUnique2(chas1));
		System.out.println(p.isUnique2(chas2));
	}

}
