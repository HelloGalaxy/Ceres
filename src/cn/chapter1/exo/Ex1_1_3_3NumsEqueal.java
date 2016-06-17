package cn.chapter1.exo;

import edu.princeton.cs.algs4.*;

public class Ex1_1_3_3NumsEqueal {

	public static void main(String[] args) {

		StdOut.print("Pls, input 3 integers: ");
		int num1 = StdIn.readInt();
		int num2 = StdIn.readInt();
		int num3 = StdIn.readInt();

		if (num1 == num2 && num2 == num3)
			StdOut.print("equal");
		else
			StdOut.print("not equal");
	}
}
