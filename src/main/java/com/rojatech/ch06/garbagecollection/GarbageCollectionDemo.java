package com.rojatech.ch06.garbagecollection;

public class GarbageCollectionDemo {
	int id;
	
	GarbageCollectionDemo(int id) {
		this.id = id;
		System.out.println(this + " created with id " + this.id);
	}
	
	public static void main(String[] args) {
		for (int i=0; i<50000; i++) {
			new GarbageCollectionDemo(i);
		}
	}

	@Override
	protected void finalize() {
		System.out.println(this + " finalized " + id);
	}
}
