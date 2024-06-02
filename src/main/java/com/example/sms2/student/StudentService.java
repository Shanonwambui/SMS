package com.example.sms2.student;

import com.example.sms2.institution.Institution;
import com.example.sms2.institution.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final InstitutionRepository institutionRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, InstitutionRepository institutionRepository) {
        this.studentRepository = studentRepository;
        this.institutionRepository = institutionRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();}

    public void saveStudent() {
        Institution institution1 = institutionRepository.findById(1L).orElse(null);
        Institution institution2 = institutionRepository.findById(2L).orElse(null);
        Institution institution3 = institutionRepository.findById(3L).orElse(null);
        Institution institution4 = institutionRepository.findById(4L).orElse(null);

        if (institution1 != null && institution2 != null && institution3 != null && institution4 != null) {
            //Create and save the first student
            Student student1 = new Student();
            student1.setStudentName("Allan Doe");
            student1.setInstitution(institution1);
            studentRepository.save(student1);

            //Create and save the second student
            Student student2 = new Student();
            student2.setStudentName("Jane Doe");
            student2.setInstitution(institution2);
            studentRepository.save(student2);

            //Create and save the third student
            Student student3 = new Student();
            student3.setStudentName("John Doe");
            student3.setInstitution(institution3);
            studentRepository.save(student3);

            //Create and save the fourth student
            Student student4 = new Student();
            student4.setStudentName("Mary Doe");
            student4.setInstitution(institution4);
            studentRepository.save(student4);

            //Create and save the fifth student
            Student student5 = new Student();
            student5.setStudentName("Peter Doe");
            student5.setInstitution(institution1);
            studentRepository.save(student5);

            //Create and save the sixth student
            Student student6 = new Student();
            student6.setStudentName("Paul Doe");
            student6.setInstitution(institution2);
            studentRepository.save(student6);

            //Create and save the seventh student
            Student student7 = new Student();
            student7.setStudentName("James Doe");
            student7.setInstitution(institution3);
            studentRepository.save(student7);

            //Create and save the eighth student
            Student student8 = new Student();
            student8.setStudentName("Grace Doe");
            student8.setInstitution(institution4);
            studentRepository.save(student8);

            //Create and save the ninth student
            Student student9 = new Student();
            student9.setStudentName("Joseph Doe");
            student9.setInstitution(institution1);
            studentRepository.save(student9);

            //Create and save the tenth student
            Student student10 = new Student();
            student10.setStudentName("Mercy Doe");
            student10.setInstitution(institution2);
            studentRepository.save(student10);


        }
    }
}
