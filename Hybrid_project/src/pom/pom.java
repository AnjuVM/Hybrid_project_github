package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
@FindBy(id = "email")
private WebElement username_ele;

@FindBy(id = "pass")
private WebElement pwd_ele;

@FindBy(id = "login")
private WebElement login_ele;

public void Pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void username(String un1)
{
	username_ele.sendKeys(un1);
}
public void password(String un1)
{
	pwd_ele.sendKeys(un1);
}
public void login(String un1)
{
	login_ele.sendKeys(un1);
}

}
