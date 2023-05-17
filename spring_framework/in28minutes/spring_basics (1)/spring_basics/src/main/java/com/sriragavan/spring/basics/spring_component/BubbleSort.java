package com.sriragavan.spring.basics.spring_component;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BubbleSort implements SortingIf {
    public int[] sort(int[] numbers) {
        System.out.println("Inside BubbleSort sort mtd");
        return numbers; // Sorted
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Inside postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Inside preDestroy");
    }
}
