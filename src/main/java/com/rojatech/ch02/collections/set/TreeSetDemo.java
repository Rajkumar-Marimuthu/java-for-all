package com.rojatech.ch02.collections.set;

import com.rojatech.ch02.collections.StringBufferComparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<StringBuffer> set = new TreeSet<StringBuffer>();
		
		set.add(new StringBuffer("hello"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("new delhi"));
		set.add(new StringBuffer("newyork"));
		set.add(new StringBuffer("chennai"));
		
		for (StringBuffer e : set) {
			System.out.println(e);
			
		}
		
		Set<StringBuffer> set1 = new TreeSet<StringBuffer>(new StringBufferComparator());
		
		set1.add(new StringBuffer("hello"));
		set1.add(new StringBuffer("abc"));
		set1.add(new StringBuffer("new delhi"));
		set1.add(new StringBuffer("newyork"));
		set1.add(new StringBuffer("chennai"));
		
		for (StringBuffer e : set1) {
			System.out.println(e);
			
		}
	}

}
