package com.leetcode.problems.arrays.rotation;

import java.util.Arrays;

public class Solution {
	public void rotate(int[] nums, int k) {
		int size = nums.length;
		int[] temp = new int[size];
		for (int index = 0; index < size; index++) {
			temp[index] = nums[index];
		}

		for (int index = 0; index <= size - k - 1; index++) {
			nums[index + k] = temp[index];
		}

		int j = 0;
		for (int index = size - k; index < size; index++) {
			nums[j++] = temp[index];
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
		int k = 3;

		System.out.println("before: " + Arrays.toString(nums));

		Solution s = new Solution();
		s.rotate(nums, k);
		System.out.println("after: " + Arrays.toString(nums));
	}
}
