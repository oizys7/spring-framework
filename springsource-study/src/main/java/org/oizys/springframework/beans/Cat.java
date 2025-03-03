package org.oizys.springframework.beans;


import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//容器就应该给Cat再创建一个对象
@Scope(SCOPE_PROTOTYPE)
//@Component
public class Cat {

	public Cat(){
		System.out.println("cat被创建了...");
	}

	private String name;


	@Value("${JAVA_HOME}") //自动赋值功能
	public void setName(String name) {
		System.out.println("cat....setName正在赋值调用....");
		this.name = name;
	}

	//注解怎么定义这个是初始化方法？
	public String getName() {
		return name;
	}

}
