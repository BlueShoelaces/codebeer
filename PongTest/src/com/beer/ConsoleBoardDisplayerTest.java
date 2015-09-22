package com.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConsoleBoardDisplayerTest {

	@Test
	public void testGetBoardString() throws Exception {
		final ConsoleBoardDisplayer boardDisplayer = new ConsoleBoardDisplayer();

		final StringBuilder theBoard = new StringBuilder();

		theBoard.append("====================================\n");
		for (int i = 0; i < 10; i++) {
			theBoard.append("|                                  |\n");
		}
		theBoard.append("====================================\n");

		final String expectedString = theBoard.toString();
		assertEquals(expectedString, boardDisplayer.getBoardString());
	}
}
