package com.example.sms2.institution;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/institution")
public class InstitutionController {
    private final InstitutionService institutionService;
    private static final Logger logger = LoggerFactory.getLogger(InstitutionController.class);


    @Autowired
    public InstitutionController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }


    @GetMapping
    public List<Institution> getAllInstitutions() {

        List<Institution> institutions = institutionService.getAllInstitutions();
        logger.info("Institutions: {}", institutions);
        return institutions;
    }

    @GetMapping("/sortByName")
    public List<Institution> sortInstitutionsByName(@RequestParam String sortOrder){
        return institutionService.sortInstitutionsByName(sortOrder);
    }

    @GetMapping("/search")
    public List<Institution> searchInstitutions(@RequestParam String searchTerm){
        return institutionService.searchInstitutions(searchTerm);
    }

    @PostMapping
    public ResponseEntity<?> createInstitution(@RequestBody Institution institution){
        return institutionService.createInstitution(institution);
    }

}
