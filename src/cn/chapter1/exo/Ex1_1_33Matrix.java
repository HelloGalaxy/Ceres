package cn.chapter1.exo;

import java.security.InvalidParameterException;

import cn.helper.RandomArray;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_33Matrix {

	public static void main(String[] args) {

		double[] x = RandomArray.GetRandomArray(3, 0, 10);
		double[] y = RandomArray.GetRandomArray(3, 0, 10);
		double[] z = RandomArray.GetRandomArray(100, 0, 10);

		double[][] a = RandomArray.GetRandomArray(2, 3, 0, 10);
		double[][] b = RandomArray.GetRandomArray(3, 2, 0, 10);

		// StdArrayIO.print(x);
		StdArrayIO.print(y);
		// StdOut.println(dot(x, y));
		// StdOut.println(dot(x, z));
		// StdArrayIO.print(a);
		// StdArrayIO.print(transpose(a));
		StdArrayIO.print(b);
		// StdArrayIO.print(mult(a, b));

		// StdArrayIO.print(mult(a, y));
		StdArrayIO.print(mult(y, b));
	}

	static double dot(double[] x, double[] y) {
		if (x.length != y.length)
			throw new InvalidParameterException(
					String.format("Vector size is not equeal: %s vs %s", x.length, y.length));
		double result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i] * y[i];
		}
		return result;
	}

	static double[][] mult(double[][] a, double[][] b) {

		double[][] r = new double[a.length][b[0].length];

		for (int i = 0; i < r.length; i++)
			for (int j = 0; j < r[i].length; j++) {
				for (int k = 0; k < a.length; k++)
					r[i][j] += (a[i][k] * b[k][j]);
			}

		return r;
	}

	static double[][] transpose(double[][] a) {

		double[][] t = new double[a[0].length][a.length];

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				t[j][i] = a[i][j];

		return t;
	}

	static double[] mult(double[][] a, double[] y) {

		double[][] b = new double[a.length][1];
		for (int i = 0; i < a.length; i++)
			b[i][0] = y[i];

		double[] result = new double[a.length];
		b = mult(a, b);
		for (int i = 0; i < a.length; i++)
			result[i] = b[i][0];
		return result;
	}

	static double[] mult(double[] y, double[][] a) {

		double[][] b = new double[1][y.length];
		for (int i = 0; i < a.length; i++)
			b[0][i] = y[i];

		double[] result = new double[a[0].length];
		b = mult(b, a);
		for (int i = 0; i < a[0].length; i++)
			result[i] = b[0][i];
		return result;
	}

}
