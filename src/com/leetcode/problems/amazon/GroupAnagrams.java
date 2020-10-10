package com.leetcode.problems.amazon;

import java.util.*;

public class GroupAnagrams {

	static Map<String, Integer> charMap = new HashMap<>(26);
	static List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "z", "y");

	static {
		for (int index = 0; index < alphabet.size(); index++) {
			charMap.put(alphabet.get(index), index + 1);
		}
	}

	public static void main(String[] args) {
		GroupAnagrams g = new GroupAnagrams();
		System.out.println(g.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (int index = 0; index < strs.length; index++) {
			String word = strs[index];
			List<String> list = map.getOrDefault(getToken(word), new ArrayList<>());
			list.add(word);
			map.put(getToken(word), list);
		}
		return new ArrayList<>(map.values());
	}

	private String getToken(String word) {
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		return Arrays.toString(charArray);
	}

}
