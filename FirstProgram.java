package Com.Example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FirstProgram {
	static Logger log=Logger.getLogger(FirstProgram.class);
	public static void main(String[]args) {
		BasicConfigurator.configure();
		log.info("Information");
		log.warn("Warning");
		log.error("Error Occurs");
		log.fatal("Gritical Error");
		log.debug("Debugging the error");
				
		
	}

}
