package com.leetcode.problems.amazon;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] answer = t.twoSum(new int[]{2, 7, 11, 15}, 9);
		System.out.println(Arrays.toString(answer));
	}

	public int[] twoSum(int[] nums, int target) {

		for (int index = 0; index < nums.length; index++) {
			int[] answer = recursive(index, nums, target);
			if (answer.length == 2) {
				return answer;
			}
		}
		return new int[]{};
	}

	public int[] recursive(int startIndex, int[] nums, int target) {
		if (startIndex < nums.length - 1) {
			int firstNum = nums[startIndex];
			int partialTarget = target - firstNum;

			for (int index = startIndex + 1; index < nums.length; index++) {
				if (nums[index] == partialTarget) {
					return new int[]{startIndex, index};
				}
			}
		}
		return new int[]{};
	}
}
