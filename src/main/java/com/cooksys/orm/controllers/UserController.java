package com.cooksys.orm.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.services.UserService;





@RestController
@RequestMapping(path = "/users/@")
public class UserController {
	
	

	    private UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping
	    public List<UserResponseDto> getAllCourses() {
	        return userService.getAllUsers();
	    }
	    
	    @PostMapping
	    public UserResponseDto createStudent(@RequestBody UserRequestDto studentDto) {
	        return userService.createStudent(studentDto);
	    }

//	    @GetMapping
//	    public List<StudentResponseDto> getAllStudents(
//	            @RequestParam(name = "max_gpa", required = false) Double maxGpa,
//	            @RequestParam(name = "min_gpa", required = false) Double minGpa) {
//	        // Not all logic has to be in a service.
//	        // Simple things like conditional logic can be done by the controller if appropriate.
//	        // Here, since I have a method in my service for each case, it makes sense to place my checks in this method.
//	        if (maxGpa != null && minGpa != null) {
//	            return studentSerive.getAllStudentsWithinGpaRange(minGpa, maxGpa);
//	        }
//
//	        if (maxGpa != null) {
//	            return studentSerive.getStudentByGpaLessThan(maxGpa);
//	        }
//
//	        if (minGpa != null) {
//	            return studentSerive.getStudentByGpaGreaterThan(minGpa);
//	        }
//
//	        return studentSerive.getAllStudents();
//	    }
//
//	    @PostMapping
//	    public StudentResponseDto createStudent(@RequestBody StudentRequestDto studentDto) {
//	        return studentSerive.createStudent(studentDto);
//	    }
	    
	    
	    
	    
	    
	    
	    
	    
//
//	    @DeleteMapping("/{id}")
//	    public CourseResponseDto deleteCourse(@PathVariable Integer id) {
//	        return courseService.deleteCourse(id);
//	    }
//	}


}
