package com.bridgelabz.deckofcards;

import java.util.Scanner;

public class DeckOfCards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter number of players :");
		int playerCount = sc.nextInt();
		CardsPlay play = new CardsPlay(playerCount);
		play.generateCards();
		play.addPlayer();
		play.setPlayerSequence();
		play.distributeCards();
		play.printCardList();
	}
}
