package Chapter5_String;

public class Problem_8_1 {

	public boolean isUnique1(char [] chas){
		if(chas == null){
			return true;
		}
		boolean [] map = new boolean[256];
		for(int i=0;i<chas.length;i++){
			if(map[chas[i]]){
				return false;
			}
			map[chas[i]] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chas1 [] = {'a', 'b', 'c'};
		char chas2 [] = {'1', '2', '1'};
		Problem_8_1 p = new Problem_8_1();
		System.out.println(p.isUnique1(chas1));
		System.out.println(p.isUnique1(chas2));

	}

}
