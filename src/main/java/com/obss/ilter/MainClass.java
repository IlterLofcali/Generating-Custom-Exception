package com.obss.ilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
	private static Logger log = LoggerFactory.getLogger(MainClass.class);

	public static void main(String[] args) throws CustomException {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		try {
			Class3 class3 = new Class3();
			class3.wrapException();
		} catch (CustomException e) {
			log.info("ClassName:" + MainClass.class.getName(), e);
		}
	}
}
