package fmi.informatics.events;

import java.util.ArrayList;
import java.util.List;

public class Greating implements Observable {

	private List<Observer> people = new ArrayList<>();
	private boolean greatings;

	@Override
	public void addObserver(Observer o) {
		people.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		people.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer person : people) {
			person.update(); // not allowed to remove elements from the list at this time
		}
	}

	public boolean isGreatings() {
		return greatings;
	}

	public void setGreatings(boolean great) {
		this.greatings = great;
		if (great)
			notifyObserver();
	}


	}