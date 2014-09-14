package javaExamJune01;

import java.util.Scanner;

public class _02_SumCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cardsInput = input.nextLine();
		cardsInput = cardsInput.replace("S", "");
		cardsInput = cardsInput.replace("H", "");
		cardsInput = cardsInput.replace("D", "");
		cardsInput = cardsInput.replace("C", "");
		String[] cards = cardsInput.split(" ");

		int count = 0;
		int sum = 0;
		int previous = -1;

		for (int i = 0; i < cards.length; i++) {
			int current = getCardsValue(cards[i]);
			if (current == previous) {
				count++;
			} else {
				count = 1;
			}
			sum += current;
			if (count == 2) {
				sum += 2 * current;
			}
			if (count > 2) {
				sum += current;
			}
			previous = current;
		}

		System.out.println(sum);
	}

	public static int getCardsValue(String card) {
		switch (card) {
		case "J":
			return 12;
		case "Q":
			return 13;
		case "K":
			return 14;
		case "A":
			return 15;
		default:
			return Integer.parseInt(card);

		}
	}
}
