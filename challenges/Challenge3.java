package com.te.challenges;

public class Challenge3 {
	static public void printEqual(int x, int y, int z) {
		if (x < 0 || y < 0 || z < 0) {
			System.out.println("invalid value");
		} else if (x == y && y == z) {
			System.out.println("all numbers are equal");
		} else if (x != y && y != z && z != x) {
			System.out.println("all numbers are different");
		} else {
			System.out.println("neither all are equal or different");
		}
	}

	public static void main(String[] args) {
		printEqual(30, 20, 20);

	}

}