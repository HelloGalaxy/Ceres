package cn.chapter1.exo;

import cn.helper.RandomArray;
import edu.princeton.cs.algs4.*;

public class Ex1_1_13Transpose {

	public static void main(String[] args) {

		StdOut.print("Pls, input m and n value for array: ");
		int m = StdIn.readInt();
		int n = StdIn.readInt();
		int[][] array = RandomArray.GetRandomArray(m, n);
		StdOut.print("Before: ");
		StdArrayIO.print(array);
		StdOut.print("After: ");
		StdArrayIO.print(Transpose(array));
	}

	static int[][] Transpose(int[][] array) {
		int[][] tranArray = new int[array[0].length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				tranArray[j][i] = array[i][j];
			}
		}
		return tranArray;
	}
}
