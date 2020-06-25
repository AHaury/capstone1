package de.openhpi.capstone1.counter.model;

import java.util.ArrayList;
import de.openhpi.capstone1.counter.view.Observer;

public class Counter implements Subject {
	
	private int count = 0;
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		notifyAllObservers();
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void notifyAllObservers() {
		for (Observer observer: observers) {
			observer.update();
		}
	}
	
}
