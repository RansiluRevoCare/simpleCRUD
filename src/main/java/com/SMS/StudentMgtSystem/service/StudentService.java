package com.SMS.StudentMgtSystem.service;

import com.SMS.StudentMgtSystem.dto.AddStudentDTO;
import com.SMS.StudentMgtSystem.dto.GetStudentDTO;
import com.SMS.StudentMgtSystem.entity.Student;

import java.util.List;

public interface StudentService {

   List<GetStudentDTO> findAllStudent();
    GetStudentDTO findStudentById(Long id);

    // add
    AddStudentDTO addStudent(Student student);
//update
    AddStudentDTO updateStudent(Long id,Student student);
    public void deleteStudent(Long id);
}
