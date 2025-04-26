package com.ust;

import java.util.logging.Logger;

public class DemoOnDoWhile {
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(DemoOnDoWhile.class.getName());
		logger.info("Application Started");
		int i =1;
		logger.info("loop about to start");
		do {
			System.out.println("hello");
			logger.info("with in the loop");
			i++;
		}while(i<=10);
		logger.info("loop stoped");
		logger.info("Application closed");
	}

}
