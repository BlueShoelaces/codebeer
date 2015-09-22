package com.beer;

public class ConsoleBoardDisplayer implements BoardDisplayer {

	@Override
	/**
	 * TODO: wtf.
	 * @Test the shit.
	 */
	public void displayBoard() {
		System.out.println(this.getBoardString());
	}

	public String getBoardString() {
		final StringBuilder theBoard = new StringBuilder();

		theBoard.append("====================================");
		for (int i = 0; i < 10; i++) {
			theBoard.append("|                                  |");
		}
		theBoard.append("====================================");

		final String toReturn = theBoard.toString();

		return toReturn;
	}
}
