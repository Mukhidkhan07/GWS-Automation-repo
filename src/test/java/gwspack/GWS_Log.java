package gwspack;

import org.apache.logging.log4j.*;

public class GWS_Log {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Logger log=LogManager.getLogger(GWS_Log.class);
	System.out.println("Logger Initiated");
	 
	log.fatal("For Fatal");
	log.error("For Errors");
	log.warn("For Warning");
	log.info("Initial Information");
	log.debug("For Debug");
	log.trace("For Trace");


	}

}
