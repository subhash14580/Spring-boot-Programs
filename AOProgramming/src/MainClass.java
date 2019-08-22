import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import subhash.model.Student;


public class MainClass {
		public static void main(String[] args) {
		/*
		 * XmlBeanFactory ac = new XmlBeanFactory(new ClassPathResource("web.xml"));
		 * Student s = (Student)ac.getBean("StudentProxy");
		 * 
		 * s.print("name"); try { s.printThrowException(); }catch(Exception e) {
		 * 
		 * }
		 */
			
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashedPassword = "";
		hashedPassword = encoder.encode("subhash");
		System.out.println("subhash   -- > " + hashedPassword);
		}
}	
