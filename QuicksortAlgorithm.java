package com.test.spring.basics.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary


public class QuicksortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		
		//Logic for quick sort
		
		return numbers;
	}

}
