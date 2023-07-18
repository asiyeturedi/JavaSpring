package com.test.spring.basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) 
	{
		
															//new BubblesortAlgorithm()
		 //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuicksortAlgorithm());
		 BinarySearchImpl binarySearch = new BinarySearchImpl(new QuicksortAlgorithm());
		 int result = binarySearch.binarySearch(new int[] {12,4,6} , 3);
		
		 ApplicationContext applicationContext=
		 SpringApplication.run(DemoApplication.class, args);
		 
		 BinarySearchImpl bean = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(result);
		
		
		
	}

}
