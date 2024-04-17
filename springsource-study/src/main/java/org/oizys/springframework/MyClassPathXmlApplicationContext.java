/*
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 */
package org.oizys.springframework;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wyn * @version MyClassPathXmlApplicationContext.java, v 0.1 2024-04-15 22:17 wyn
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext(String ... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources方法...");

		// 添加必要属性值的检查
		getEnvironment().setRequiredProperties("os.name");
		getEnvironment().validateRequiredProperties();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {

		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);

		super.customizeBeanFactory(beanFactory);
	}
}
