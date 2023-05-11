package com.sriragavan.spring.basics.spring_basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingIf{
    public int[] sort(int[] numbers) {
        System.out.println("Inside BubbleSort sort mtd");
        return numbers; // Sorted
    }
}
