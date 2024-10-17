package com.second;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.first.App;


public class Apptest {
	
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("CSE","CSE@2024"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("CSE","CSE@2024"));
	}

}
