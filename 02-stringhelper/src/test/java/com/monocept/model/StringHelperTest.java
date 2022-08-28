package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class StringHelperTest {

	StringHelper sh;

	@BeforeEach
	void test() {
		sh = new StringHelper();
	}

	@Test
	@DisplayName("Truncate A from first 2 position")
	void testTruncate() {
		String[] actual = { sh.truncateAinFirst2Pos("AABCD"), sh.truncateAinFirst2Pos("BABCD"),
				sh.truncateAinFirst2Pos("CBADAA"), sh.truncateAinFirst2Pos("AA"), sh.truncateAinFirst2Pos("A") };

		String[] expected = { "BCD", "BBCD", "CBADAA", "", "" };

		assertArrayEquals(expected, actual);

	}

	@Test
	@DisplayName("Check first and last character same")
	void testFisrtLastChar() {
		boolean[] actual = { sh.firstAndLastTwoCharSame("AABAA"), sh.firstAndLastTwoCharSame("ABA"),
				sh.firstAndLastTwoCharSame("BACA"), sh.firstAndLastTwoCharSame("CBAC"),
				sh.firstAndLastTwoCharSame("ABCD") };

		boolean[] expected = { true, true, false, true, false };

		assertArrayEquals(expected, actual);
	}

}
