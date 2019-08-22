package subhash.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method Name : "+methodInvocation.getMethod().getName());
		System.out.println("Method arguments :"+Arrays.toString(methodInvocation.getArguments()));
		methodInvocation.proceed();
		System.out.println("around and again after actual method");
		return null;
	}

}
