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

		theBoard.append("====================================\n");
		for (int i = 0; i < 10; i++) {
			theBoard.append("|                                  |\n");
		}
		theBoard.append("====================================\n");

		final String toReturn = theBoard.toString();

		return toReturn;
	}
}
