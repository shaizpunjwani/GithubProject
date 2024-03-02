package TestCases;

import org.testng.annotations.Test;

public class Test1 {

    @Test(priority = 1, description = "myfirsttest")
    public void FirstTest()
    {
        System.out.println("my first test");
    }
}
