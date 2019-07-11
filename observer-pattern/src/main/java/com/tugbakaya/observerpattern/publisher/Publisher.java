package com.tugbakaya.observerpattern.publisher;

import java.util.ArrayList;
import java.util.List;

import com.tugbakaya.observerpattern.subscriber.Subscriber;

public class Publisher {

	List<Subscriber> subscribers;
	private int state;

	public Publisher() {
		subscribers = new ArrayList<Subscriber>();
	}

	public void addSubscriber(Subscriber s) {
		subscribers.add(s);
	}

	public void removeSubscriber(Subscriber s) {
		subscribers.remove(s);
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllSubscribers();
	}

	public void notifyAllSubscribers() {
		for (Subscriber s : subscribers) {
			s.update();
		}
	}

}
