package com.sriragavan.spring.basics.spring_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingIf sortingIf;


    public int search(int[] numbers, int target){
        //Sort numbers
        System.out.println("Inside Binary Search method");
        sortingIf.sort(numbers);
        //Search element
        //Return index
        return 3;
    }
}
