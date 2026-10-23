package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GreeterTest {

    @Test
    void testGreeter() {
        Greeter greeter = new Greeter();
        assertNotNull(greeter);
    }
}
