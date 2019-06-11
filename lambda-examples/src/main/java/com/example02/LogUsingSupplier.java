package com.example02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogUsingSupplier {
	public static void main(String[] args) {
		String host = "coderanch.com";
		int port = 80;
		// set up logging
		Logger logger = Logger.getLogger("Status Logger");
		logger.setLevel(Level.SEVERE);	// line 5
		
		// in case we need to check the status
		Supplier<String> status = () -> {
			int timeout = 1000;
			try (Socket socket = new Socket()) {
				socket.connect(new InetSocketAddress(host, port), timeout);
				return "up";
			} catch (IOException e) { 
				return "down";	// Error; can't reach the system!
			}
		};
		
		try {
			logger.log(Level.INFO, status);	// only calls the get() method of the
											// status Supplier if level is INFO or below
			// do stuff with coderanch.com
			// ...
		} catch (Exception e) {
			logger.log(Level.SEVERE, status);	// calls the get() method of the status
												// Supplier if level is SEVERE or below
		}
	}
}