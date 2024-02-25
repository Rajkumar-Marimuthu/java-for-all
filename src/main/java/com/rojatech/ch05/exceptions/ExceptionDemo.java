package com.rojatech.ch05.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(5000);
			throw new MyThreadException("my thread exception");
		} catch (InterruptedException | MyThreadException e) {
			log.error("Exception: ", e);
		}
	}

}
