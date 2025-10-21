package testcases;

import org.testng.annotations.Test;
import utilities.DriverSetUp;

public class TestLogIn extends DriverSetUp {

    @Test
    public void testLogIn(){
        getBrowser().get("google.com");
    }
}
