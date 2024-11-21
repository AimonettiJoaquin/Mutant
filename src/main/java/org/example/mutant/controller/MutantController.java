package org.example.mutant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.example.mutant.dto.DNARequest;
import org.example.mutant.service.MutantService;

@RestController
@RequestMapping("/mutant")
public class MutantController {

    @Autowired
    private MutantService mutantService;

    @PostMapping
    public ResponseEntity<String> isMutant(@RequestBody DNARequest dnaRequest) {
        String[] dna = dnaRequest.getDna();
        if (mutantService.isMutant(dna)) {
            return ResponseEntity.ok("Mutant detected!");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Not a mutant.");
        }
    }
}