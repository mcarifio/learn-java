import static java.lang.System.out;
import java.util.Map.*;

public class EnvironmentClient {

	public static void main(String[] args) {
		
		// java needs a 'var' keyword
		for (Entry<String, String> key : System.getenv().entrySet()) {
			out.printf("%s = %s\n", key.getKey(), key.getValue());
		}
		
		out.printf("\n\n\njava_tries_root = %s\n", System.getenv().get("java_tries_root"));
		
		out.println(Environment.get("java_tries_root", "all else failed"));
	}
	
}
