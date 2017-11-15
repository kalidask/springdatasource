package com.aa.test;

import com.aa.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Calculator;

public class AATest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Calculator calculator = context.getBean("calculator", Calculator.class);
		System.out.println("Sum : " + calculator.add(10, 20));
		System.out.println("Sum : " + calculator.add(10, 20));
	}
}
