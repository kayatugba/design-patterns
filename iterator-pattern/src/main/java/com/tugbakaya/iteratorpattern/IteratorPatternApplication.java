package com.tugbakaya.iteratorpattern;

import java.security.cert.CollectionCertStoreParameters;

import com.tugbakaya.iteratorpattern.iterator.ConcreteCollection;
import com.tugbakaya.iteratorpattern.iterator.Iterator;

public class IteratorPatternApplication {

	public static void main(String[] args) {
		System.out.println("Iterator pattern application");
		
		ConcreteCollection collection = new ConcreteCollection();
		Iterator it  = collection.getIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
