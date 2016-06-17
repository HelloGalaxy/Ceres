package cn.chapter1.exo;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX1_1_20LnN {

	public static void main(String[] args) {
		
		StdOut.print("Pls, input N : ");
		int n = StdIn.readInt();
		StdOut.print("ln(N!) : " + Math.log(faktoriell(n)));

	}

	static int faktoriell(int n) {
		if (n == 1)
			return 1;
		else
			return n * faktoriell(n - 1);
	}
}
