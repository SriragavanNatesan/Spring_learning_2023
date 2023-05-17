package com.sriragavan.spring.basics.spring_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {


		System.out.println("Inside main");
		System.out.println("binarySearch");
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("------1-------"  +binarySearch);
		System.out.println("------2-------"  +binarySearch2);
		System.out.println(binarySearch.search(new int[] {1, 3,4}, 5));
	}

}
