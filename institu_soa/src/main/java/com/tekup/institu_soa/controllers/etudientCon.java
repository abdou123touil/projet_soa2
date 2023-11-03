package com.tekup.institu_soa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.institu_soa.models.etudient;
import com.tekup.institu_soa.servises.etudeintServ;

@RestController
@RequestMapping("/etudient")
public class etudientCon {



     @Autowired
    private etudeintServ etuService;
    @PostMapping()
    public ResponseEntity<etudient> createStudent(@RequestBody etudient etudient){

        etudient et= etuService.createEtudient(etudient);
        return new ResponseEntity<>(et, HttpStatus.OK);
    }
    // build get user by id REST API
    @GetMapping("/{id}")
    public ResponseEntity<etudient> getEtudientById(@PathVariable("id") Long etuId){
        etudient student = etuService.getEtudientById(etuId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<etudient>> getAllEtudient(){
        List<etudient> etudients = etuService.getAllEtudient();
        return new ResponseEntity<>(etudients, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("/{id}")
    public ResponseEntity<etudient> updateEtudient(@PathVariable("id") Long etuId,@RequestBody etudient etudient){
        etudient et = etuService.updateEtudient(etuId,etudient);
        return new ResponseEntity<>(et, HttpStatus.OK);
    }

    // Build Delete User REST API
   // Delete operation
   @DeleteMapping("/{id}")
   public String deleteEtudient(@PathVariable("id") Long etuId)
   {
       etuService.deleteEtudient(etuId);
       return "Deleted Successfully";
   }

    
}