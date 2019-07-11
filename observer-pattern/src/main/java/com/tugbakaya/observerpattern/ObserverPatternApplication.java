package com.tugbakaya.observerpattern;

import javax.naming.BinaryRefAddr;

import com.tugbakaya.observerpattern.publisher.Publisher;
import com.tugbakaya.observerpattern.subscriber.BinarySubscriber;
import com.tugbakaya.observerpattern.subscriber.OctalSubscriber;

public class ObserverPatternApplication {

	public static void main(String[] args) {
		System.out.println("Observer Pattern Application");
		
		Publisher p = new Publisher();
		p.addSubscriber(new BinarySubscriber());
		p.addSubscriber(new OctalSubscriber());
		p.setState(0);

	}

}
