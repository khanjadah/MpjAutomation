package packageSix;

import org.testng.annotations.Test;

public class TestNgGroups {
	
	@Test(groups = {"sanity"})
	public void test1() {

		System.out.println("I am test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {

		System.out.println("I am test 2");
	}
	
	@Test(groups = {"regression"})
	public void test3() {

		System.out.println("I am test 3");
	}
	
	@Test
	public void test4() {

		System.out.println("I am test 4");
	}

}
