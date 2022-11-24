package Com.Example;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertiesProgram {
	static Logger log=Logger.getLogger(PropertiesProgram.class);
	public static void main(String[]args) {
		PropertyConfigurator.configure("Log4j.Properties");
		log.info("Information");
		log.warn("Warning");
		log.error("Error Occurs");
		log.fatal("Gritical Error");
		log.debug("Debugging the error");
				

}
}
