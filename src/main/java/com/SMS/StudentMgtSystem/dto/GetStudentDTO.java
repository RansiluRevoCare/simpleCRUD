package com.SMS.StudentMgtSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetStudentDTO {

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;


}
