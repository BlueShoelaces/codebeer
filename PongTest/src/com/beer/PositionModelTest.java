package com.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositionModelTest {
	@Test
	public void testPositionConstructor() throws Exception {
		final int expectedXCoordinate = 0;
		final int expectedYCoordinate = 0;
		final PositionModel positionModel = new PositionModel(
				expectedXCoordinate, expectedYCoordinate);
		final int actualXCoordinate = positionModel.getXCoordinate();
		final int actualYCoordinate = positionModel.getYCoordinate();

		assertEquals(expectedXCoordinate, actualXCoordinate);
		assertEquals(actualYCoordinate, actualYCoordinate);
	}
}
