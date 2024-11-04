package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCarTests extends TestBase {


    @Test
    public void searchCurrentMonthSuccess(){

       app.getHelperCar().searchCurrentMonth("Haifa, Israel","11/4/2024","11/5/2024");
       app.getHelperCar().submit();
       Assert.assertTrue(app.getHelperCar().isListCarsAppeared());


    }

    @Test
    public void searchCurrentYearSuccess(){

        app.getHelperCar().searchCurrentYear("Haifa, Israel","11/21/2024","12/25/2024");
        app.getHelperCar().submit();
        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());

    }

   // @Test
  //  public void searchAnyPeriodSuccess(){

   // }
}
