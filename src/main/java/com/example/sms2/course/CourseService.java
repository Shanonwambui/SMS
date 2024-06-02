package com.example.sms2.course;

import com.example.sms2.institution.Institution;
import com.example.sms2.institution.InstitutionRepository;
import com.example.sms2.student.Student;
import com.example.sms2.student.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final InstitutionRepository institutionRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository, InstitutionRepository institutionRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.institutionRepository = institutionRepository;
        this.studentRepository = studentRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public void saveCourse() {
        Institution institution1 = institutionRepository.findById(1L).orElse(null);
        Institution institution2 = institutionRepository.findById(2L).orElse(null);
        Institution institution3 = institutionRepository.findById(3L).orElse(null);
        Institution institution4 = institutionRepository.findById(4L).orElse(null);

        Student student1 = studentRepository.findById(1L).orElse(null);
        Student student2 = studentRepository.findById(2L).orElse(null);
        Student student3 = studentRepository.findById(3L).orElse(null);
        Student student4 = studentRepository.findById(4L).orElse(null);
        Student student5 = studentRepository.findById(5L).orElse(null);
        Student student6 = studentRepository.findById(6L).orElse(null);
        Student student7 = studentRepository.findById(7L).orElse(null);
        Student student8 = studentRepository.findById(8L).orElse(null);
        Student student9 = studentRepository.findById(9L).orElse(null);
        Student student10 = studentRepository.findById(10L).orElse(null);


        if(institution1 !=null && institution2 !=null && institution3 !=null && institution4 !=null && student1 !=null && student2 !=null && student3 !=null && student4 !=null && student5 !=null && student6 !=null && student7 !=null && student8 !=null && student9 !=null && student10 !=null ) {

            //Create and save the first course
            List<Institution> institutions1 = new ArrayList<>();
            institutions1.add(institution1);
            institutions1.add(institution2);
            List<Student> students1 = new ArrayList<>();
            students1.add(student1);
            students1.add(student2);
            students1.add(student5);
            students1.add(student6);
            students1.add(student9);
            students1.add(student10);
            Course course1 = new Course();
            course1.setCourseName("Computer Science");
            course1.setInstitution(institutions1);
            course1.setStudent(students1);
            courseRepository.save(course1);

            List<Institution> institutions2 = new ArrayList<>();
            institutions2.add(institution2);
            institutions2.add(institution3);
            List<Student> students2 = new ArrayList<>();
            students2.add(student2);
            students2.add(student3);
            students2.add(student6);
            students2.add(student7);
            students2.add(student10);
            Course course2 = new Course();
            course2.setCourseName("Information Technology");
            course2.setInstitution(institutions2);
            course2.setStudent(students2);
            courseRepository.save(course2);

            List<Institution> institutions3 = new ArrayList<>();
            institutions3.add(institution3);
            institutions3.add(institution4);
            List<Student> students3 = new ArrayList<>();
            students3.add(student3);
            students3.add(student4);
            students3.add(student7);
            students3.add(student8);
            Course course3 = new Course();
            course3.setCourseName("Software Engineering");
            course3.setInstitution(institutions3);
            course3.setStudent(students3);
            courseRepository.save(course3);

            List<Institution> institutions4 = new ArrayList<>();
            institutions4.add(institution4);
            institutions4.add(institution1);
            List<Student> students4 = new ArrayList<>();
            students4.add(student1);
            students4.add(student4);
            students4.add(student5);
            students4.add(student8);
            students4.add(student9);
            Course course4 = new Course();
            course4.setCourseName("Computer Engineering");
            course4.setInstitution(institutions4);
            course4.setStudent(students4);
            courseRepository.save(course4);
        }



    }
}
