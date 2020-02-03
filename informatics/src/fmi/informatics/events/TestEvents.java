package fmi.informatics.events;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEvents {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Greating great = new Greating();

		User user = new User("Pesho", great);
		great.addObserver(user);

		User user1 = new User("Geri", great);
		great.addObserver(user);
		great.setGreatings(true);

		boolean greating = true;

		if (greating) {
            System.out.println();
			System.out.println("Поздрав...");
			System.out.println();

		} else {
			System.out.println("Без поздрав...");
		}

		greating = false;

		if (greating) {

			System.out.println("Поздрав...");

		} else {
			System.out.println("Без поздрав...");
		}

	}
}