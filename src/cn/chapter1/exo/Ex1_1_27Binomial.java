package cn.chapter1.exo;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_27Binomial {

	public static void main(String[] args) {

		StdOut.println("Recusif: " + binomial(n, k, p));
		StdArrayIO.print(x);
		StdOut.println("Iteration: " + binomialArray(n, k, p));
	}

	static int n =5;
	static int k = 3;
	static double p = 0.1;
	static double[][] x = new double[n + 1][k + 1];

	public static double binomialArray(int n, int k, double p) {

		double[][] a = new double[n + 1][k + 1];
		// for the (0, i) row, in case of 0 - 1, it terminate its value is 0.
		// but for the (i,0) col, i - 2 where i >= 1,
		// it will get the value from (1.0 - p) * binomial(n - 1, k, p)
		a[0][0] = 1.0;
		for (int i = 1; i < n + 1; i++) {
			a[i][0] = (1.0 - p) * a[i - 1][0];
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < k + 1; j++) {
				a[i][j] = (1.0 - p) * a[i - 1][j] + p * a[i - 1][j - 1];
			}
		}

		StdArrayIO.print(a);

		return a[n][k];
	}

	public static double binomial(int n, int k, double p) {
		if (n == 0 && k == 0) {
			x[n][k] = 1.0;
			return 1.0;
		}
		if (n < 0 || k < 0)
			return 0.0;
		x[n][k] = (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
		return (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
	}
}
