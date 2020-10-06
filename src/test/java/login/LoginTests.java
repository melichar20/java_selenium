package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        loginPage.clickLogin();
    }
}
