package de.openhpi.capstone1.counter.view;

import processing.core.PApplet;
import de.openhpi.capstone1.counter.model.Counter;

public class CounterView extends Observer {

	Counter counter;
		
	public CounterView(PApplet display, Counter counter) {
		super(display, counter);
		this.counter = counter;
		update();
	}
	
	public void update() {
		display.fill(0);
		display.bckground(204);
		display.rect(counter.getCount(), 10, 10, 10 );
		display.redraw();
	}
}
