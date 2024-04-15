package org.oizys.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.oizys.springframework.beans.Person;

/**
 * @author hsfxuebao
 * Created on 2022-06-28
 */
public class XmlMainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");

		Person bean = context.getBean(Person.class);
		System.out.println(bean.getName());

	}
}
