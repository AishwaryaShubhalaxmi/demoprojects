package testngproject;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups= {"type1"})  //use include and exclude tests
	public void print() {
		System.out.println("This belongs to type1");
	}
	@Test(groups= {"type2"})
	public void print1() {
		System.out.println("This belongs to type2");
	}
	@Test(groups= {"type1","type2"}, enabled=false)
	public void print3(){
		System.out.println("This belongs to type1 and type2");
	}
	@Test(groups= {"type1"},invocationCount=3)
	public void print4() {
		System.out.println("This belongs to type1");
	}
	@Test(groups= {"type2", "type3"})
	public void print5() {
		System.out.println("This belongs to type2 and type3");
	}
	@Test(dependsOnMethods= {"print6"})
	public void print7() {
		System.out.println("new type");
		
	}
	@Test()
	public void print6() {
		System.out.println("new type");
		
	}
	
}
