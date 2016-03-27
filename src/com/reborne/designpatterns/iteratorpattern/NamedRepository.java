package com.reborne.designpatterns.iteratorpattern;

public class NamedRepository implements Container {

	public String names[] = { "Robert", "Sue", "Jimmy", "Alan", "Stue", "Julie" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}
