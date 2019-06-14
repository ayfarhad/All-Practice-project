package in.embryo;

import java.io.IOException;

import org.apache.log4j.Logger;

public class MyApp {
	public static void main(String[] args) throws IOException {
		
    	  Logger logger = Logger.getLogger(MyApp.class);
//		  //SimpleLayout simpleLayout = newSimpleLayout();
//		  PatternLayout layout = new PatternLayout(); FileAppender
//		  fileAppender = new FileAppender(layout, "MyLogfile.log");
//		  
//		  logger.addAppender(fileAppender);
//		 
		
		logger.error("This is error");
		logger.warn("This is warn");
		logger.debug("This is debug");
		logger.info("This is info method");
		logger.fatal("This is fatal");
	}
}
