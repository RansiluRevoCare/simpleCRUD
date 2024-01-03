package com.SMS.StudentMgtSystem.controller;

import com.SMS.StudentMgtSystem.dto.AddStudentDTO;
import com.SMS.StudentMgtSystem.dto.GetStudentDTO;
import com.SMS.StudentMgtSystem.entity.Student;
import com.SMS.StudentMgtSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //find all student end point
    @GetMapping
    public List<GetStudentDTO> findAllStudent(){
        return studentService.findAllStudent();
    }

    //find student by id end point
    @GetMapping(path="/{id}")
    public GetStudentDTO findStudentById(@PathVariable("id")Long id){
        return studentService.findStudentById(id);
    }

    //add student data end point
    @PostMapping
    public AddStudentDTO addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    //update a student
    @PutMapping(path="/{id}")
    public AddStudentDTO updateStudent(@PathVariable("id")Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    //delete student from database
    @DeleteMapping(path="/{idx}")
    public void deleteStudent(@PathVariable("id")Long id){
        studentService.deleteStudent(id);
    }

}
