package cn.chapter1.exo;

import edu.princeton.cs.algs4.*;

public class Ex1_1_25GCD {

	public static void main(String[] args) {

		StdOut.print("Input 2 nums: ");

		int num1 = StdIn.readInt();
		int num2 = StdIn.readInt();

		StdOut.print("GCD: " + gcd(num1, num2));
	}

	public static int gcd(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if (min == 0)
			return max;
		else {
			return gcd(min, max % min);
		}
	}

}
