package sample;

import java.util.*;

public class AddMatrix {
	public static int[][] matrixValues(int n, int m){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	public static void addMatrix(int[][] a, int[][] b){
		int[][] result = new int[a.length][b.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		printMatrix(result);
	}
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[][] arr = matrixValues(n,m);
	int[][] brr = matrixValues(n,m);
	 addMatrix(arr,brr);
	sc.close();
	
	
}
}
