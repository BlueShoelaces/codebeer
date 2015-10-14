package com.beer;

public class BoardModel {

	private final int width = 36;
	private final int height = 12;

	private final Ball ball;

	public BoardModel(final Ball ball) {
		this.ball = ball;
	}

	public Ball getBall() {
		return this.ball;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
}
