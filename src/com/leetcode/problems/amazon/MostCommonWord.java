package com.leetcode.problems.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {

	public static void main(String[] args) {
		MostCommonWord m = new MostCommonWord();

		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = new String[]{"a"};

		System.out.println(m.mostCommonWord(paragraph, banned));
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		List<String> punctuationMarks = Arrays.asList("!", "?", "'", ",", ";", ".");
		Map<String, Integer> map = new HashMap<>();

		//Removing punctuation
		for (String punctuation : punctuationMarks) {
			paragraph = paragraph.replace(punctuation, " ");
		}

		String[] words = paragraph.split(" ");

		for (String word : words) {
			if (!word.isEmpty()) {
				Integer count = map.getOrDefault(word.toLowerCase(), 0);
				map.put(word.toLowerCase(), count + 1);
			}
		}

		//Removing banned words
		for (String bannedWord : banned) {
			map.remove(bannedWord);
		}

		int maxCount = 0;
		String maxWord = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			Integer value = entry.getValue();
			if (maxCount < value) {
				maxCount = value;
				maxWord = entry.getKey();
			}
		}
		return maxWord;
	}
}
