package cn.chapter1.exo;

import edu.princeton.cs.algs4.*;

public class Ex1_1_5NumIn0And1 {

	public static void main(String[] args) {

		StdOut.print("Pls, input x double value: ");
		double x = StdIn.readDouble();
		StdOut.print("Pls, input y double value: ");
		double y = StdIn.readDouble();

		StdOut.print(isIn0And1(x) && isIn0And1(y));
	}

	public static boolean isIn0And1(double value) {
		return value > 0 && value < 1;
	}

}
