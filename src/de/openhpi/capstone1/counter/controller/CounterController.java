package de.openhpi.capstone1.counter.controller;

import de.openhpi.capstone1.counter.model.Counter;

public class CounterController {
	
	Counter counter;
	
	public CounterController(Counter counter) {
		this.counter = counter;
	}
	
	public void handleEvent() {
		counter.setCount(counter.getCount()+1);
	}
}
