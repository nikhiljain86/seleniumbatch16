package MyFruits;

import org.testng.annotations.Test;

public class priority {
	//testng execute test cases in alphabetical order
	
	@Test
	public void aeedback(){
		
		System.out.println("i am prioty1");
	}
	
	
	
	@Test
	public void bogout(){
		
		System.out.println("i am priority 2");
	}

	
	@Test(dependsOnMethods={"daunch"})
	public void aaogin(){
		
		System.out.println("priority 4");
	}

	
	@Test
	public void daunch(){
		
		System.out.println("priority 5");
	}

	
	@Test
	public void cegistration(){
		
		System.out.println("i am priority 3");
	}

}
