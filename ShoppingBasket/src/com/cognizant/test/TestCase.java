package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cognizant.exception.ShoppingBasketException;
import com.cognizant.main.MainClass;

public class TestCase {
	String banana = "";
	String apple = "";
	String orange = "";
	String lemon = "";
	String peaches = "";
	MainClass addBasket = new MainClass();

	@Test
	public void successTest() {
		banana = "2";
		apple = "0";
		orange = "5";
		lemon = "4";
		peaches = "3";

		try {
			addBasket.addToCart(banana, apple, orange, lemon, peaches);
		} catch (ShoppingBasketException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void nullValueTest() {
		banana = "2";
		apple = null;
		orange = "5";
		lemon = "4";
		peaches = "3";

		try {
			addBasket.addToCart(banana, apple, orange, lemon, peaches);
		} catch (ShoppingBasketException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void negativeValueTest() {
		banana = "-1";
		apple = "9";
		orange = "5";
		lemon = "4";
		peaches = "3";

		try {
			addBasket.addToCart(banana, apple, orange, lemon, peaches);
		} catch (ShoppingBasketException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void alphabetValueTest() {
		banana = "1a";
		apple = "9";
		orange = "5";
		lemon = "4";
		peaches = "3";

		try {
			addBasket.addToCart(banana, apple, orange, lemon, peaches);
		} catch (ShoppingBasketException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

}
