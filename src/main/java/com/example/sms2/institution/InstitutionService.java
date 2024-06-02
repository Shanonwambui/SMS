package com.example.sms2.institution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionService {
    private final InstitutionRepository institutionRepository;

    @Autowired
    public InstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    public List<Institution> getAllInstitutions() {
        return institutionRepository.findAll();
    }

    public void saveInstitution() {
        Institution institution1 = new Institution();
        institution1.setInstitutionName("University of Nairobi");
        institutionRepository.save(institution1);

        Institution institution2 = new Institution();
        institution2.setInstitutionName("Kenyatta University");
        institutionRepository.save(institution2);

        Institution institution3 = new Institution();
        institution3.setInstitutionName("Strathmore University");
        institutionRepository.save(institution3);

        Institution institution4 = new Institution();
        institution4.setInstitutionName("Jomo Kenyatta University of Agriculture and Technology");
        institutionRepository.save(institution4);



    }
    public List <Institution> sortInstitutionsByName(String sortOrder) {
        Sort sort = sortOrder.equalsIgnoreCase("asc") ? Sort.by(Sort.Direction.ASC, "institutionName")
                : Sort.by(Sort.Direction.DESC, "institutionName");
        return institutionRepository.findAll(sort);
    }

    public List<Institution> searchInstitutions(String searchTerm) {
        return institutionRepository.findByInstitutionNameContaining(searchTerm);
    }

    public ResponseEntity<?> createInstitution(Institution institution){

        Institution existingInstitution = institutionRepository.findByInstitutionName(institution.getInstitutionName());

        if (existingInstitution != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("An institution with the same name already exists.");

        }

        Institution savedInstitution = institutionRepository.save(institution);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedInstitution);
    }
}
