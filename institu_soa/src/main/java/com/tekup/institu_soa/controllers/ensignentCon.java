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

import com.tekup.institu_soa.models.ensignent;
import com.tekup.institu_soa.servises.ensignentServ;

@RestController
@RequestMapping("/ensignent")
public class ensignentCon {
    @Autowired
    private ensignentServ ensService;

    @PostMapping()
    public ResponseEntity<ensignent> createens(@RequestBody ensignent ensignent){

        ensignent en = ensService.createens(ensignent);
        return new ResponseEntity<>(en, HttpStatus.OK);
    }

     @GetMapping("{id}")
    public ResponseEntity<ensignent> getensById(@PathVariable("id") Long ensId){
        
        ensignent ensignent = ensService.getensById(ensId);
        return new ResponseEntity<>(ensignent, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<ensignent>> getAllens(){

        List<ensignent> ensignent = ensService.getAllens();
        return new ResponseEntity<>(ensignent, HttpStatus.OK);
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<ensignent> updateens(@PathVariable("id") Long ensId,@RequestBody ensignent ensignent){
        ensignent updatedens = ensService.updateens(ensId, ensignent);
        return new ResponseEntity<>(updatedens, HttpStatus.OK);
    }

   @DeleteMapping("/{id}")
   public String deleteens(@PathVariable("id") Long ensId)
   {
       ensService.deleteens(ensId);
       return "Deleted Successfully";
   }
}