package cn.chapter1.exo;

import edu.princeton.cs.algs4.*;

public class Ex1_1_11_PrintBooleanMatrix {

	public static void main(String[] args) {
		boolean[][] booleanValues = ramdomBolleanArray(8, 5);
		printBoolArray(booleanValues);
	}

	public static boolean[][] ramdomBolleanArray(int x, int y) {

		boolean[][] values = new boolean[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				values[i][j] = StdRandom.bernoulli();
			}
		}

		return values;
	}

	public static void printBoolArray(boolean[][] values) {

		StdOut.print("  ");
		for (int i = 0; i < values[0].length; i++) {
			StdOut.print(i + " ");
		}
		StdOut.println();

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				if (j == 0)
					StdOut.print(i + " ");
				if (values[i][j])
					StdOut.print("*" + " ");
				else
					StdOut.print(" " + " ");
			}
			StdOut.println();
		}
	}
}
