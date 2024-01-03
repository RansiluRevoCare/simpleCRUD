package com.SMS.StudentMgtSystem.entity;


import io.micrometer.observation.ObservationFilter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity
@Table(name="student_tb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name="id")
    private Long id;


    @Column(name="first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 50)
    private String lastName;


    @Column(name="email_name", nullable = false, unique = true,length = 50)
    private String email;

    @Column(name="date_of_birth", nullable = false)
    private LocalDate dob;


    @Column(name="about_student", columnDefinition ="TEXT")
    private String about;

    @Column(name="password", nullable = false)
    private String password;

    @Transient
    private Integer age;

    public Integer getAge(){
        return Period.between(this.dob, LocalDate.now()).getYears();
    }



}
