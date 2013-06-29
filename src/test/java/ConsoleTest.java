import static org.junit.Assert.*;
import org.junit.*;

public class ConsoleTest {

	@Test
	public void testSystemConsole() {
		assertTrue("System.console() is null. :|", System.console() != null);
	}
}
