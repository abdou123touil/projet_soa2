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

import com.tekup.institu_soa.models.adiministration;
import com.tekup.institu_soa.servises.administrationServ;

@RestController
@RequestMapping("/administration")
public class administrationCon {

    @Autowired
    private administrationServ adminService;

     @PostMapping()
    public ResponseEntity<adiministration> createCadre(@RequestBody adiministration admin){

        adiministration a = adminService.createAdmin(admin);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<adiministration> getAdminById(@PathVariable("id") Long adminId){
        
        adiministration admin = adminService.getAdminById(adminId);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<adiministration>> getAllSAdmin(){

        List<adiministration> admin = adminService.getAllSAdmin();
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }



      @PutMapping("{id}")
    public ResponseEntity<adiministration> updateAdmin(@PathVariable("id") Long adminId,@RequestBody adiministration admin){
        adiministration updated = adminService.updateAdmin(adminId,admin);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
   @DeleteMapping("/{id}")
   public String deleteAdmin(@PathVariable("id")Long adminId)
   {
       adminService.deleteAdmin(adminId);
       return "Deleted Successfully";
   }
}