package com.codesignal.app.arcade.Intro;

public class MatrixElementsSum {
	int matrixElementsSum(int[][] matrix) {
		int result = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			int cnt = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i]==0) {
					cnt++;
					break;
				}
				if (cnt<1) {
					result += matrix[j][i]; 
				}
			}
		}
		return result;
	}
}
