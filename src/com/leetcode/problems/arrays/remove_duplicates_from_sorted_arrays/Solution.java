package com.leetcode.problems.arrays.remove_duplicates_from_sorted_arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		Solution s = new Solution();
		int length = s.removeDuplicates(nums);
		System.out.println(length);
	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		int i = 0;

		for (int j = 0; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
