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
 * 算法思想：
 * 1.从矩阵最右上角的数开始寻找（row= 0,col=M-1）
 * 2.比较当签署matrix[row][col]与k的关系
 * 	如果与k相等，说明已经找到，直接返回true
 *  如果比k大，因为矩阵每一列都已经排好序，所以在当前数所在的列中给，处于当前数下方的数都会比k大，则没有必要继续在第col列上继续寻找，令col = col-1重复步骤2
 *  如果比k小，因为矩阵每一行都已经排好序，所以在当前数所在的行中，处于当前数左方的数都会比k小，则没有必要继续在第row行上寻找，令row=row+1，重复步骤2
 * 3如果没找到越界都没有发现与k相等的数，则返回false
 * 
 * 还有一个方法，见书上P348
 */
