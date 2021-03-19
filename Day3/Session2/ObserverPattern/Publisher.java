package com.observer.pattern.handson;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

	String state;
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyAllObservers();
	}

	private List<Observer> observers = new ArrayList<>();
	@Override
	public void attach(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void detach(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer obs: observers) {
			obs.update();
		}
	}

}
