package com.example.sms2.student;

import com.example.sms2.course.Course;
import com.example.sms2.institution.Institution;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_name")
    @JsonView(Views.StudentView.class)
    private String studentName;

    @JsonView(Views.StudentView.class)
    @JsonManagedReference("course-student")
    @ManyToMany(mappedBy = "student")
    private List<Course> course;

    @JsonView(Views.StudentView.class)
    @ManyToOne
    @JoinColumn(name = "institution_id")
    private Institution institution;



}