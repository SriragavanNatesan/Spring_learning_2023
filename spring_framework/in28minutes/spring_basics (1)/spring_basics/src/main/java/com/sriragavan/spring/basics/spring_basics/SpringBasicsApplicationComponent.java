package com.sriragavan.spring.basics.spring_basics;

import com.sriragavan.spring.basics.spring_component.BinarySearchComponentImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sriragavan.spring.basics.spring_component")
public class SpringBasicsApplicationComponent {

	public static void main(String[] args) {


		System.out.println("Inside main");
		System.out.println("binarySearch");
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplicationComponent.class, args);
		BinarySearchComponentImpl binarySearch = applicationContext.getBean(BinarySearchComponentImpl.class);
//		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("------1-------"  +binarySearch);
//		System.out.println("------2-------"  +binarySearch2);
		System.out.println(binarySearch.search(new int[] {1, 3,4}, 5));
	}

}
