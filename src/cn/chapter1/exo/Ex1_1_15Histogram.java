package cn.chapter1.exo;

import cn.helper.RandomArray;
import edu.princeton.cs.algs4.*;

public class Ex1_1_15Histogram {

	public static void main(String[] args) {

		StdOut.print("Pls, input m for the historgram array: ");
		int m = StdIn.readInt();

		int[] array = RandomArray.GetRandomArray(10);
		int[] hist = Historgram(array, m);

		StdOut.println("Array: ");
		StdArrayIO.print(array);
		StdOut.println("Hist: ");
		StdArrayIO.print(hist);
	}

	static int[] Historgram(int[] array, int m) {
		int[] hist = new int[m];

		for (int i = 0; i < array.length; i++)
			if (array[i] < m)
				hist[array[i]]++;

		return hist;
	}

}
