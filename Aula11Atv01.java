package Aula11;

public class Ex01 {
	public static void main(String[] args) {
		//iniciando de forma direta
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Elemento: "+matrix[1][1]+"\n");
		
		//iniciando matrix de forma indireta
		int[][] n = new int[3][3];
		
		n[0][0] = 1;
		n[0][1] = 2;
		n[0][2] = 3;
		
		n[1][0] = 4;
		n[1][1] = 5;
		n[1][2] = 6;
		
		n[2][0] = 7;
		n[2][1] = 8;
		n[2][2] = 9;
		
		for(int l=0;l<n.length;l++) {
			for(int c=0;c<n.length;c++) {
				System.out.println("elemento: "+n[l][c]);
			}
		}
	}
}
