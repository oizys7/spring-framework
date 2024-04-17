package org.oizys.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wyn * @version RunStepTest.java, v 0.1 2024-04-15 21:08 wyn
 */
public class RunStepTest {
	@Test
	void Test1(){
//		ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring-${username}.xml");

		// setAllowBeanDefinitionOverriding -> false
		ApplicationContext ac2 = new MyClassPathXmlApplicationContext("beans.xml");

		// setAllowCircularReferences
//		ApplicationContext ac3 = new MyClassPathXmlApplicationContext("");
	}

}
