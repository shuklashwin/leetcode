package com.leetcode.problems.amazon;

import java.util.Arrays;

public class KthLargestNumber {

	public static void main(String[] args) {
		KthLargestNumber k = new KthLargestNumber();
		System.out.println(k.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
	}

	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
