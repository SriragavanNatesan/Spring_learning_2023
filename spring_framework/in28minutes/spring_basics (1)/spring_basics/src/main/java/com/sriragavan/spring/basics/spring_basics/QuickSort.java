package com.sriragavan.spring.basics.spring_basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingIf{
    public int[] sort(int[] numbers){
        System.out.println("Inside QuickSort sort mtd");
        return numbers; // Sorted
    }
}
