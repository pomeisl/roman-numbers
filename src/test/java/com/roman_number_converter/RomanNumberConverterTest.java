package com.roman_number_converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumberConverterTest {

	private RomanNumberConverter converter;

	@BeforeEach
	void setup() {
		converter = new RomanNumberConverter();
	}

	@ParameterizedTest(name = "{index} - {0}, {1}")
	@CsvSource(value = { "1,I", "14,XIV", "27,XXVII", "150,CL", "2,II", "15,XV", "28,XXVIII", "200,CC", "3,III",
			"16,XVI", "29,XXIX", "300,CCC", "4,IV", "17,XVII", "30,XXX", "400,CD", "5,V", "18,XVIII", "31,XXXI",
			"500,D", "6,VI", "19,XIX", "40,XL", "600,DC", "7,VII", "20,XX", "50,L", "700,DCC", "8,VIII", "21,XXI",
			"60,LX", "9,IX", "22,XXII", "70,LXX", "900,CM", "10,X", "23,XXIII", "80,LXXX", "1000,M", "11,XI", "24,XXIV",
			"90,XC", "1600,MDC", "12,XII", "25,XXV", "100,C", "1700,MDCC", "13,XIII", "26,XXVI", "101,CI", "1900,MCM",
			"206,CCVI", "1944,MCMXLIV", "2006,MMVI"})
	void testConvertToValidRomanNumberFormat(int number, String romanFormat) {
		assertEquals(romanFormat, converter.convert(number));
	}

	@Test
	void testDoesNotConvertNonpositive() {
		var exception = assertThrows(NumberFormatException.class, () -> converter.convert(-1));
		assertEquals("Roman numbers cannot be nonpositive.", exception.getMessage());
	}

}
