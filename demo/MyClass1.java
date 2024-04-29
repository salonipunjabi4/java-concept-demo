package com.demo;

public class MyClass1 {
	static void printMatrix(int [][]P, int rowSize, int colSize) {
		for(int i = 0; i<rowSize; i++) {
			for(int j = 0; j<colSize; j++) {
				System.out.print(P[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	   
	static void multiplyMatrix(int row1, int col1, int[][] A, int col2, int row2, int[][] B) {
		
		System.out.println("Matrix A");
		printMatrix(A, row1, col1);
		System.out.println("Matrix B");
		printMatrix(B, row2, col2);
		
		if(col1 != row2) {
			System.out.println("Not possible");
		}
		int C[][] = new int[row1][col2];
		
		for(int i = 0; i< row1; i++) {
			for(int j = 0; j< col2; j++) {
				for(int k = 0; k< row2; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		System.out.println("Result");
		printMatrix(C, row1, col2);
	
		  
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	

	   int row1 = 3, col1 = 3, row2 = 3, col2 = 3;
	   int A[][] = {{2,2,2},{2,2,2}, {2,2,2}};
	   int B[][] = {{4,4,4},{4,4,4}, {4,4,4}};
	   multiplyMatrix(row1, col1, A, row2, col2, B);
	
	}

}



//int[] arr = { 5,3,9,4,1,7 };
//int missing_number = missingNumber(arr, arr.length);
//System.out.println("The smallest missing number " + missing_number);
//}
//static int missingNumber(int[] arr, int n) {
//int i;
//for (i = 0; i < n; i++) {
//   if (arr[i] != i) {
//      return i;
//   }
//}
//return i;
//}

//int temp = 0 ;
//int max = 0;
//for(int i = 0; i<arr.length; i++) {
//	if(arr[i] > temp) {
//		temp = arr[i];
//		max = arr[i];
//	}
//}
//int n = arr.length;
//
//for(int i=0; i< n; i++) {
//	for(int j=0; j<n-1; j++) {
//		if(arr[j]> arr[j+1]) {
//			temp = arr[j];
//			arr[j] = arr[j+1];
//			arr[j+1] = temp;
//			
//		}
//	}
//}
//for(int i = 0; i<arr.length; i++) {
//	System.out.println(arr[i]);
//}

//System.out.println(max);

