package Chapter5_String;

public class Problem3 {

	public String removeKZero(String str, int k){
		if(str == null || k <1 )
			return str;
		char [] chas = str.toCharArray();
		int count = 0;
		int start = -1;//��ʾ��������0�����ֵ�λ��
		for(int i= 0;i!=chas.length;i++){
			if(chas[i] == '0'){
				count++;
				start = start == -1 ? i:start;
			}else{
				if(count == k){
					while(count-- !=0){
						chas[start++] = 0;
					}
				}
				count = 0;
				start =-1;
			}
		}
		if(count == k){
			while(count-- !=0){
				chas[start++] = 0;
			}
		}
		return String.valueOf(chas);//�� char ���� data ת�����ַ��� 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "A00B";
		String str2 = "A0000B000";
		Problem3 p = new Problem3();
		System.out.println(p.removeKZero(str1, 2));
		System.out.println(p.removeKZero(str2, 3));

	}

}
