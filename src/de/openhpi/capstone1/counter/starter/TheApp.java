package de.openhpi.capstone1.counter.starter;

import processing.core.PApplet;
import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.view.*;
import de.openhpi.capstone1.counter.model.Counter;

public class TheApp extends PApplet {

	private Observer counterView;
	private CounterController counterController;
	private Counter counter;
	
	@Override
	public void settings() {
		size(200, 200);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate = 30;
		counter = new Counter();
		counterController = new CounterController(counter);
		counterView = new CounterView(this, counter);
	}

	@Override
	public void draw() { }  // draw() loops forever, until stopped

	//Add further user interaction as necessary
	@Override
	public void mouseClicked() {
		counterController.handleEvent();
	}
}
