package com.roman_number_converter;

public class RomanNumberConverter {

	private String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	/**
	 * Converts integer numbers to Roman format.
	 * @param number to be converted
	 * @return given number in Roman format
	 * @throws NumberFormatException in case of nonpositive numbers.
	 */
	public String convert(int number) throws NumberFormatException {
		if (number <= 0) {
			throw new NumberFormatException("Roman numbers cannot be nonpositive.");
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			var currentValue = values[i];
			var currentSymbol = symbols[i];

			while (number >= currentValue) {
				result.append(currentSymbol);

				number -= currentValue;
			}
		}

		return result.toString();
	}

}
