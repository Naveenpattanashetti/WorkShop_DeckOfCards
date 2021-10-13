package com.bridgelabz.deckofcards;

public class DeckOfCards {
	/**
	 * Deck of Cards program
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to Deck of cards");

		String[][] cardsCollection = new String[4][13];

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.createCards(suits, ranks, cardsCollection);

	}

	/**
	 * Create all cards
	 * 
	 * 	 */
	public void createCards(String[] suit, String[] ranks, String[][] cardsCollection) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {

				cardsCollection[i][j] = (suit[i] + "-" + ranks[j]);

			}

		}

	}

}
