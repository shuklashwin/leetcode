package com.leetcode.problems.floodfill_733;

import java.awt.Point;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] image = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				image[i][j] = 1;
			}
		}

		image[1][2] = 0;
		image[2][1] = 0;

		int sr = 1, sc = 1, newColor = 2;

		System.out.println("Image before flood fill:");
		s.printImage(image);

		image = s.floodFill(image, sr, sc, newColor);

		System.out.println("Image after flood fill:");
		s.printImage(image);

	}

	public void printImage(int[][] image) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(image[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColour) {
		int currentColour = image[sr][sc];
		if (currentColour != newColour) {
			depthFirstSearch(image, new Point(sr, sc), currentColour, newColour);
		}
		return image;
	}

	public void depthFirstSearch(int[][] image, Point point, int oldColour, int newColour) {
		if (image[point.x][point.y] == oldColour) {
			image[point.x][point.y] = newColour;

			if (point.x >= 1) {
				depthFirstSearch(image, new Point(point.x - 1, point.y), oldColour, newColour);
			}
			if (point.y >= 1) {
				depthFirstSearch(image, new Point(point.x, point.y - 1), oldColour, newColour);
			}
			if (point.x + 1 < image.length) {
				depthFirstSearch(image, new Point(point.x + 1, point.y), oldColour, newColour);
			}
			if (point.y + 1 < image[0].length) {
				depthFirstSearch(image, new Point(point.x, point.y + 1), oldColour, newColour);
			}
		}
	}

}
