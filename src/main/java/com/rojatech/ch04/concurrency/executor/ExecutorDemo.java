package com.rojatech.ch04.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] cps = { 
				new CheckProcessorTask("ATM"), 
				new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"),
				new CheckProcessorTask("Web")
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask checkProcessorTask : cps) {
			es.submit(checkProcessorTask);
		}
		
		es.shutdown();
	}

}
