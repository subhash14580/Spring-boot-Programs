package subhash.aspects;

import org.springframework.aop.ThrowsAdvice;

public class MyMethodThrowsAdvice implements ThrowsAdvice{
	
	public void afterThrowing(Exception e) {
		System.out.println("Exception is being thrown here");
	}
}
