package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginSuccess(){

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("artem.komissarov.1999@gmail.com","Arte@Kom0607");
        app.getHelperUser().submitLogin();
        //Assert---> if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMassege(),"Logged in success");
        app.getHelperUser().clickOkButton();





    }
}
