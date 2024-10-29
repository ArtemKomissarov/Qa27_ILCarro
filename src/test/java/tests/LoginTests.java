package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isLogged());
          app.getHelperUser().logout();

    }

    @Test
    public void loginSuccess(){

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("artem.komissarov.1999@gmail.com","Arte@Kom0607");
        app.getHelperUser().submit();
        //Assert---> if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMassege(),"Logged in success");
       // app.getHelperUser().clickOkButton();





    }
    @Test
    public void loginSuccess1(){
        User user = new User().setEmail("artem.komissarov.1999@gmail.com").setPassword("Arte@Kom0607");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        //Assert---> if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMassege(),"Logged in success");
        // app.getHelperUser().clickOkButton();





    }
    @Test
    public void loginSuccessModel(){

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("artem.komissarov.1999@gmail.com","Arte@Kom0607");
        app.getHelperUser().submit();
        //Assert---> if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMassege(),"Logged in success");
       // app.getHelperUser().clickOkButton();





    }
    @AfterMethod
    public void postCondition(){
        app.getHelperUser().clickOkButton();
    }
}
