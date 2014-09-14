package javaExamJune01;

import java.util.Scanner;

public class _01_StuckNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String inputNumbers = input.nextLine();
		String[] numbers = inputNumbers.split(" ");
		boolean isNumber = false;
		String ab = "";
		String cd = "";

		for (String a : numbers) {
			for (String b : numbers) {
				for (String c : numbers) {
					for (String d : numbers) {

						if (!a.equals(b) && !a.equals(c) && !a.equals(d)
								&& !b.equals(c) && !b.equals(d) && !c.equals(d)) {
							ab = a + "" + b;
							cd = c + "" + d;
							if (ab.equals(cd)) {
								System.out.printf("%s|%s==%s|%s%n", a, b, c, d);
								isNumber = true;
							}

						}

					}
				}
			}
		}
		if (!isNumber) {
			System.out.println("No");
		}
	}

}
