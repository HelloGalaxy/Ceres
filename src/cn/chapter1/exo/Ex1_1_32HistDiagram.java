package cn.chapter1.exo;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1_1_32HistDiagram {

	static int randomNumCount = 10;

	public static void main(String[] args) {
		double[] array = new double[randomNumCount];
		for (int i = 0; i < randomNumCount; i++) {
			array[i] = StdRandom.uniform(0, 10);
		}
		int[] result = count(l, r, n, array);

		StdOut.print("Input: ");
		StdArrayIO.print(array);
		StdOut.print("Count: ");
		StdArrayIO.print(result);
		DrawDiagram(result);
	}

	static int n = 2;
	static double l = 2.0;
	static double r = 6.0;

	static int[] count(double l, double r, int n, double[] array) {
		int[] result = new int[n + 2];

		for (int i = 0; i < array.length; i++) {
			int index = (int) ((array[i] - l) / n);
			if (index < 0)
				result[0]++;
			else if (index < n)
				result[index + 1]++;
			else
				result[n + 1]++;
		}

		return result;
	}

	static void DrawDiagram(int[] array) {
		for (int i = 0; i < array.length; i++) {
			double x = 1.0 * i / array.length;
			double y = array[i] / 50.0;
			StdDraw.filledRectangle(x, y, 0.01 / array.length,  y);
		}
	}
}
