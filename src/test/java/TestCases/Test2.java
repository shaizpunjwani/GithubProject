package TestCases;

import org.testng.annotations.Test;

public class Test2 {

    @Test(priority = 1, description = "myfirsttest")
    public void FirstTest()
    {
        System.out.println("my first test");
    }

    @Test(priority = 2, description = "mysecondtest")
    public void SecondTest()
    {
        System.out.println("my second test");
    }
}
