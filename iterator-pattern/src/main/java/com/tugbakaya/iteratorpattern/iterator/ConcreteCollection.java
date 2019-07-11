package com.tugbakaya.iteratorpattern.iterator;

import java.awt.List;

public class ConcreteCollection implements IterableCollection {

	private String elements[] = { "eleman1", "eleman2", "eleman3" };

	public Iterator getIterator() {
		return new ConcreteIterator();
	}

	private class ConcreteIterator implements Iterator {

		private int index = 0;

		public boolean hasNext() {
			if (elements.length > index) {
				return true;
			} else {
				return false;
			}

		}

		public Object next() {
			if (this.hasNext()) {
				return elements[index++];
			} else {
				return null;
			}
		}

	}

}
