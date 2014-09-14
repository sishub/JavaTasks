package javaExamJune01;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_SimpleExpression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputNumbers = input.nextLine();
		inputNumbers = inputNumbers.replace(" ", "");
		String[] digits = inputNumbers.split("[^0-9.]+");
		String[] operators = inputNumbers.split("[0-9.]+");
		BigDecimal sum = new BigDecimal(0);

		for (int i = 0; i < operators.length; i++) {
			BigDecimal number = new BigDecimal(digits[i]);
			if (operators[i].equals("+") || operators[i].equals("")) {
				sum = sum.add(number);
			} else {
				sum = sum.subtract(number);
			}
		}
		System.out.println(sum.toPlainString());
	}
}
