package com.example.sms2.course;

import com.example.sms2.institution.Institution;
import com.example.sms2.student.Student;
import com.example.sms2.student.Views;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name")
    @JsonView(Views.StudentView.class)
    private String courseName;

    @ManyToMany
    @JoinTable(
            name = "course_institution",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "institution_id")
    )
    @JsonBackReference("institution-course")
    private List<Institution> institution;


    @JsonBackReference("course-student")
    @ManyToMany
    @JoinTable(name = "course_student",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> student;
}
