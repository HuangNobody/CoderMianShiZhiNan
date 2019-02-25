package Chapter8_ArrayAndMatrix;

public class PRoblem7_isContains {
	public boolean isContains(int [][] matrix, int k){
		int row =0;
		int col = matrix.length-1;
		while(row < matrix.length && col > -1){
			if(matrix[row][col] == k){
				return true;
			}else if(matrix[row][col]>k){
				col--;
			}else{
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3,5},{2,3,4,7},{4,4,4,8},{5,7,7,9}};
		PRoblem7_isContains pi = new PRoblem7_isContains();
		System.out.println(pi.isContains(arr, 7));

	}

}
/*
 * �㷨˼�룺
 * 1.�Ӿ��������Ͻǵ�����ʼѰ�ң�row= 0,col=M-1��
 * 2.�Ƚϵ�ǩ��matrix[row][col]��k�Ĺ�ϵ
 * 	�����k��ȣ�˵���Ѿ��ҵ���ֱ�ӷ���true
 *  �����k����Ϊ����ÿһ�ж��Ѿ��ź��������ڵ�ǰ�����ڵ����и������ڵ�ǰ���·����������k����û�б�Ҫ�����ڵ�col���ϼ���Ѱ�ң���col = col-1�ظ�����2
 *  �����kС����Ϊ����ÿһ�ж��Ѿ��ź��������ڵ�ǰ�����ڵ����У����ڵ�ǰ���󷽵��������kС����û�б�Ҫ�����ڵ�row����Ѱ�ң���row=row+1���ظ�����2
 * 3���û�ҵ�Խ�綼û�з�����k��ȵ������򷵻�false
 * 
 * ����һ��������������P348
 */
