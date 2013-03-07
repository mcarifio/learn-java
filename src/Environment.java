/**
 * Unify java and os style environment treatment.
 * @author mcarifio
 *
 */


public class Environment {
	/**
	 * Using java and os mechanisms, get a String value for a String name.
	 * Look in order of:
	 *   - the command line, e.g. -Da_name=a_value
	 *   - the os environment, e.g. A_NAME=a_value java <app> # in bash
	 *   - a property file (tbs)
	 *   - a default if all else fails, passed in with the lookup
	 * @param name
	 * @return
	 */
	public static String get(String name, String default_value) {
		
		// -Dname=value
		String result = System.getProperty(name);
		if (null != result) return result;
		
		result = System.getenv().get(name);
		if (null != result) return result;
		
		return default_value;
	}
}
