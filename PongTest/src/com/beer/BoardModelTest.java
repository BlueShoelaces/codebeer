package com.beer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class BoardModelTest {

	@Test
	public void testBoardConstructedWithBall() throws Exception {
		final Ball expectedBall = new MockBallModel();

		final BoardModel board = new BoardModel(expectedBall);
		final Ball actualBall = board.getBall();

		assertSame(expectedBall, actualBall);
	}

	@Test
	public void testBoardHasCorrectDimensions() throws Exception {
		final Ball expectedBall = new MockBallModel();
		final BoardModel board = new BoardModel(expectedBall);

		final int expectedWidth = 36;
		final int expectedHeight = 12;

		final int actualWidth = board.getWidth();
		final int actualHeight = board.getHeight();

		assertEquals(expectedWidth, actualWidth);
		assertEquals(expectedHeight, actualHeight);
	}
}
