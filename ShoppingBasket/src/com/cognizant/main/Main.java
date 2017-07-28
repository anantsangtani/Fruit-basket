package com.cognizant.main;

import com.cognizant.exception.ShoppingBasketException;

public class Main {

	public void addToCart(String banana, String apple, String orange, String lemon, String peaches)
			throws ShoppingBasketException {

		// Cost of fruits per quantity.
		int bananaPrice = 10;
		int applePrice = 50;
		int orangePrice = 15;
		int lemonPrice = 5;
		int peachesPrice = 25;

		boolean flag = true;

		// Condition to check for null inputs.
		if (apple == null || orange == null || banana == null || lemon == null || peaches == null) {
			throw new ShoppingBasketException("Value cannot be null");
		} else {

			// To check if input contain alphabets.
			String fruits[] = { banana, apple, orange, lemon, peaches };
			for (int i = 0; i < fruits.length; i++) {
				String fruit = fruits[i];
				for (int j = 0; j < fruit.length(); j++) {
					if (Character.isDigit(fruit.charAt(j))) {

					} else {
						flag = false;
						break;
					}
					if (flag == false) {
						break;
					}
				}
			}
			if (flag == false) {
				throw new ShoppingBasketException("Value cannot be alphabet");
			}

			// Condition to check for negative inputs.
			else if (Integer.parseInt(banana) < 0 || Integer.parseInt(apple) < 0 || Integer.parseInt(lemon) < 0
					|| Integer.parseInt(peaches) < 0 || Integer.parseInt(orange) < 0) {

				throw new ShoppingBasketException("Value cannot be negative");

			} else {

				// Calculate total cost of basket.
				int totalPrice = (Integer.parseInt(banana) * bananaPrice) + (Integer.parseInt(apple) * applePrice)
						+ (Integer.parseInt(orange) * orangePrice) + (Integer.parseInt(lemon) * lemonPrice)
						+ (Integer.parseInt(peaches) * peachesPrice);
				System.out.println("Total price of basket is " + totalPrice);

			}

		}

	}

}
