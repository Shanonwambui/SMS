package com.example.sms2.institution;

import com.example.sms2.course.Course;
import com.example.sms2.student.Views;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "institution")



public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "institution_id")
    private Long institutionId;

    @Column(name = "institution_name")
    @JsonView(Views.StudentView.class)
    private String institutionName;

    @JsonManagedReference("institution-course")
    @ManyToMany(mappedBy = "institution")
    private List<Course> course;

}
