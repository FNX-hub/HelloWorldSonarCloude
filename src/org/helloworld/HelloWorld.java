package org.helloworld;
import java.util.logging.Logger;


public class HelloWorld {

	public static void main(String[] args) {
		
		// Create a Logger
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
		logger.info("HelloWorld");
	}
}

