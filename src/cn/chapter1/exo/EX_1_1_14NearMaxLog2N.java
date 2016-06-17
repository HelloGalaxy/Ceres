package cn.chapter1.exo;

import edu.princeton.cs.algs4.*;

public class EX_1_1_14NearMaxLog2N {

	public static void main(String[] args) {
		StdOut.print("Pls, input N: ");
		int n = StdIn.readInt();
		int max = lg(n);
		StdOut.print("Max n for log2(" + n + "): " + max);
	}

	public static int lg(int n) {

		int maxN = 0;
		int product = 1;

		while (n > product) {
			product *= 2;
			maxN++;
		}

		return maxN;
	}
}
