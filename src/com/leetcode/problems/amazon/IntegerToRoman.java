package com.leetcode.problems.amazon;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

	static Map<Integer, String> map = new LinkedHashMap<>(13);

	static {
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
	}

	public static void main(String[] args) {
		IntegerToRoman roman = new IntegerToRoman();
		String numeral = roman.intToRoman(4);
		System.out.println(numeral);
	}

	public String intToRoman(int num) {

		String romanNumeral = "";

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int currentMaxValue = entry.getKey();
			if (num >= currentMaxValue) {
				int count = num / currentMaxValue;
				while (count > 0) {
					num -= currentMaxValue;
					romanNumeral = romanNumeral.concat(entry.getValue());
					count--;
				}
			}
		}
		return romanNumeral;
	}
}
