package MyFruits;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class grouping2 {
	
	
	@Test
	public void test1(){
		
		System.out.println("group1.test11");
	}
	

	@Test(parameters={"firstname"})
	public void test7(String firstname){
		
		System.out.println("group1.test77"+firstname);
		
	}
	

	@Test
	public void test2(){
		
		System.out.println("group1.test22");
		
		
	}
	

	@Test(priority=6)
	public void test11(){
		
		System.out.println("group1.test11");
	}
	

	@Test(description="description")
	public void test4(){
		
		System.out.println("group1.test44");
	}
	

	@Test
	public void test5(){
		
		System.out.println("group1.test55");
		
	}
	

}
