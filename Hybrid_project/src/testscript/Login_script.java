package testscript;

import org.testng.annotations.Test;

import generic.Fetchdata;
import generic.Generic_class;
import pom.pom;

public class Login_script extends Generic_class
{
@Test
public void test1()
{
	String user_name = Fetchdata.get_data("Sheet1",0,0);
	String pwd = Fetchdata.get_data("Sheet1",0,1);
	Pom p = new Pom(driver);
	p.username(user_name);
	p.password(pwd);
	p.login(null);
	
	
	
	
}
}
