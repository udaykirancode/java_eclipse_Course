package cllglo_programs;
public class Multi_Matrix14 {
	public static void main(String[] args) {
		int mat1[][]= {{1,2},{5,3}};
		int mat2[][]= {{2,3},{5,1}};
		int mul[][]= {{0,0},{0,0}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;i++) {
				for(int k=0;k<2;k++) {
					mul[i][j]+=mat1[i][k]* mat2[k][j];
				}
			}
		}
		for(int i=0;i<mul.length;i++) {  
			for(int j=0;j<mul[i].length;j++) {
				System.out.print("\t"+mul[i][j]);
			}
		}
	}
}
