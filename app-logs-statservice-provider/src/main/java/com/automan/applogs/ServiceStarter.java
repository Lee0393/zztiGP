package com.automan.applogs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2020/04/03
 */
public class ServiceStarter {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		while (true) {
			Thread.sleep(1000);
		}
	}
}
