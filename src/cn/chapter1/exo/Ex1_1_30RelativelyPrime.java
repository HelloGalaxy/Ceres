package cn.chapter1.exo;

import edu.princeton.cs.algs4.*;

public class Ex1_1_30RelativelyPrime {

	public static void main(String[] args) {
		StdOut.println("Pls, input N: ");
		int n = StdIn.readInt();
		boolean[][] array = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = Ex1_1_25GCD.gcd(i, j) == 1;
			}
		}

		StdArrayIO.print(array);
	}

}
