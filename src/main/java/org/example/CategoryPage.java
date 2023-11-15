package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class CategoryPage extends Utils
{//Declared Variable as ExpectedColor
   static String expectedColor = "#4ab2f1";
   //Find xpath of Computer Category Button
public static WebElement element= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));

public void verifyHoverOnComputerCategory()
{//Create actions method and move cursor to the Computer category button
    Actions actions = new Actions(driver);
    actions.moveToElement(element).build().perform();
}
public void verifyCategoryTextColor()
{//Stored value of color of Computer category button while hovering action in below method
    String s = element.getCssValue("color");
    String actual = Color.fromString(s).asHex();
    //Print color of Computer category hovering
    System.out.println("This color is after hovering "+actual);
    //Comparison of Actual and Expected color of hovering process
    Assert.assertEquals(actual,expectedColor,"Color is not changed");

}
}
