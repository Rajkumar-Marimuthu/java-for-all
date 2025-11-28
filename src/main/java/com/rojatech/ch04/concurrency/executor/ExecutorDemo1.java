package com.rojatech.ch04.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {

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
		// submit method returns a Future object which can be used to check the status of the task
		es.shutdown();
	}

}
