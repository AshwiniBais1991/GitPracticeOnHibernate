package com.spring.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
	public static void main(String[] args) {
		Resource resource= new ClassPathResource("spring.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Strudent stud =(Strudent) factory.getBean("strudent");
		stud.getData();
	}

}
