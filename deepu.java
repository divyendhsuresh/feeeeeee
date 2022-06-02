package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
	
	private Greeter greeter = new Greeter();

	@Tevoid greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hel"));
	}

}
