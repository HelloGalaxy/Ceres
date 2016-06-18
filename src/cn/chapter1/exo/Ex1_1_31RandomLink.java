package cn.chapter1.exo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.*;

public class Ex1_1_31RandomLink {

	public static void main(String[] args) {
		ArrayList<Point> points = GetRandomPoints(n);
		DrawPoints(points);
		DrawRandomLines(points, p);
	}

	static int n = 10;// StdIn.readInt();
	static double p = 0.1;// StdIn.readDouble();
	static double radius = 0.5;
	static double x = 0.5;
	static double y = 0.5;

	static ArrayList<Point> GetRandomPoints(int n) {
		ArrayList<Point> points = new ArrayList<Point>();
		double angle = 2 * Math.PI / n;
		for (int i = 0; i < n; i++) {
			Point point = new Point();
			point.x = x + radius * Math.cos(angle * i);
			point.y = y + radius * Math.sin(angle * i);
			points.add(point);
		}
		return points;
	}

	static void DrawRandomLines(ArrayList<Point> points, double p) {
		
		for (int i = 0; i < points.size(); i++) {
			for (int j = 0; j < points.size(); j++) {
				if (i != j && StdRandom.uniform() < p) {
					StdDraw.point(points.get(i).x, points.get(i).y);
					StdDraw.point(points.get(j).x, points.get(j).y);
					StdDraw.line(points.get(i).x, points.get(i).y, points.get(j).x, points.get(j).y);
				}
			}
		}
	}

	private static void DrawPoints(ArrayList<Point> points) {
		StdDraw.circle(0.5, 0.5, 0.5);
		for (int i = 0; i < points.size(); i++) {
			StdDraw.circle(points.get(i).x, points.get(i).y, 0.01);
		}
	}

}
