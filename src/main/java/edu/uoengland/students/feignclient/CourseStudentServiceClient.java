package edu.uoengland.students.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.uoengland.students.dto.CourseDTO;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "COURSES-SERVICE", url = "http://localhost:9696")
public interface CourseStudentServiceClient {

    @GetMapping("/forAStudent/{studentId}")
    ResponseEntity<List<CourseDTO>> getAListOfCoursesForAStudent(@PathVariable UUID studentId);
}