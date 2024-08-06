package com.in28minutes.springboot.learn_springboot_demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
 public List<Course> retrieveAllCourses() {
	 return Arrays.asList(
			 new Course(1, "Learn AWS", "in.28.minutes"),
			 new Course(2, "Learn DevOps", "in.28.minutes"),
			 new Course(3, "Learn Azure", "in.28.minutes"),
			 new Course(4, "Learn java", "in.28.minutes")

			 );
 }
}
