package com.leetcode.problems.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Multiprocessor {
	public static void main(String[] args) {
		Multiprocessor m = new Multiprocessor();

		int num = 5;
		List<Integer> ability = new ArrayList<>();
		ability.add(3);
		ability.add(1);
		ability.add(7);
		ability.add(2);
		ability.add(4);
		int processes = 15;

		System.out.println(m.scheduleProcesses(num, ability, processes));
	}

	public int scheduleProcesses(int num, List<Integer> ability, int processes) {

		int count = 0;

		while (processes > 0) {
			int max = Collections.max(ability);
			processes -= max;
			ability.set(ability.indexOf(max), max / 2);
			count++;
			System.out.println(ability);
		}
		return count;
	}
}
