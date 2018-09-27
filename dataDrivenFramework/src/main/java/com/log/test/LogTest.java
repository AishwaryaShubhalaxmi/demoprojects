package com.log.test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogTest {
	
	private static Logger log= Logger.getLogger(LogTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      log.setLevel(Level.WARN);
      log.info("Info ");
      log.error("error");
      log.fatal("fatal");
      log.debug("debug");
      log.warn("warn");
      log.trace("trace");
      //all <debug <info <warn <error <fatal <off
      
	}

}
