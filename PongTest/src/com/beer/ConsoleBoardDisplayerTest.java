package com.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConsoleBoardDisplayerTest {

	@Test
	public void testGetBoardString() throws Exception {
		final ConsoleBoardDisplayer boardDisplayer = new ConsoleBoardDisplayer();

		final StringBuilder theBoard = new StringBuilder();

		theBoard.append("====================================");
		for (int i = 0; i < 10; i++) {
			theBoard.append("|                                  |");
		}
		theBoard.append("====================================");

		final String expectedString = theBoard.toString();
		assertEquals(expectedString, boardDisplayer.getBoardString());
	}
}
