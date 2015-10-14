package com.beer;

public class MockPosition implements Position {

	private int xCoordinate;
	private int yCoordinate;

	public void setXCoordinate(final int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public void setYCoordinate(final int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	@Override
	public int getXCoordinate() {
		return this.xCoordinate;
	}

	@Override
	public int getYCoordinate() {
		return this.yCoordinate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.xCoordinate;
		result = prime * result + this.yCoordinate;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			if (!(obj instanceof Position)) {
				return false;
			}
		}
		final Position other = (Position) obj;
		if (this.xCoordinate != other.getXCoordinate()) {
			return false;
		}
		if (this.yCoordinate != other.getYCoordinate()) {
			return false;
		}
		return true;
	}
}
