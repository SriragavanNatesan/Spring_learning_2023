package com.sriragavan.spring.basics.spring_component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class BinarySearchComponentImpl {

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
