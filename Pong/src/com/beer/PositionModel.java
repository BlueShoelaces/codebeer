package com.beer;

public class PositionModel implements Position {

	private final int xCoordinate;
	private final int yCoordinate;

	public PositionModel(final int xCoordinate, final int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public int getXCoordinate() {
		return this.xCoordinate;
	}

	public int getYCoordinate() {
		return this.yCoordinate;
	}

}
