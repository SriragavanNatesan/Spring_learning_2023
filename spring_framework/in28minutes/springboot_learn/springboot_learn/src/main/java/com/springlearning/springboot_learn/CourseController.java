package com.springlearning.springboot_learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//Courses
// course :
// id, name, author
@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(0L, "Learn AWS", "in28Minutes"),
                new Course(1L, "Learn K8s", "in28Minutes"),
                new Course(2, "Learn devops", "in28Minutes"),
                new Course(3, "Learn devops1", "in28Minutes")
        );
    }
}
