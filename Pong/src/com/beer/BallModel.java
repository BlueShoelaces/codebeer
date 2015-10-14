package com.beer;

public class BallModel implements Ball {

	private final Position position = new PositionModel(0, 0);

	@Override
	public Position getPosition() {
		return this.position;
	}
}
