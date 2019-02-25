package Chapter5_String;

import java.util.Arrays;

public class Problem_11_2 {
	//补充问题，方法2,交换次数更少
		public char [] rotate2(char [] chas, int size){
			if(chas == null|| size<=0 ||size>= chas.length){
				return null;
			}
			int start = 0;
			int end = chas.length -1;
			int lpart = size;
			int rpart = chas.length - size;
			int s = Math.min(lpart, rpart);
			int d = lpart - rpart;
			while(true){
				exchange(chas,start,end,s);
				if(d == 0){
					break;
				}else if(d>0){
					start += s;
					rpart = d;
				}else{
					end -= s;
					rpart = -d;
				}
				s = Math.min(lpart, rpart);
				d = lpart - rpart;
			}
			return chas;
		}
		
		public void exchange(char [] chas, int start, int end, int size){
			int i = end - size +1;
			char tmp = 0;
			while(size-- !=0){
				tmp = chas[start];
				chas[start] = chas[i];
				chas[i] = tmp;
				start++;
				i++;
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] chas3 = {'1','2','3','4','5','6','7','a','b','c','d'};
		Problem_11_2 p11 = new Problem_11_2();
		
		System.out.println(Arrays.toString(chas3));
		System.out.println(Arrays.toString(p11.rotate2(chas3, 7)));
		
		//结果老是报异常，待处理！！！！！！！！

	}

}
