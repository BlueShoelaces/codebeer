package com.beer;

public class App {
	public static void main(final String[] args) {
		final BoardDisplayer board = new ConsoleBoardDisplayer();
		board.displayBoard();
	}
}
