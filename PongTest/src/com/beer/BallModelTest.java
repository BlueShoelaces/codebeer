package com.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BallModelTest {

	@Test
	public void testBallStartsAtZeroZero() throws Exception {
		final MockPosition expectedPosition = new MockPosition();

		final int xCoordinate = 0;
		expectedPosition.setXCoordinate(xCoordinate);

		final int yCoordinate = 0;
		expectedPosition.setYCoordinate(yCoordinate);

		final Ball ball = new BallModel();
		final Position actualPosition = ball.getPosition();

		assertEquals(xCoordinate, actualPosition.getXCoordinate());
	}
}
