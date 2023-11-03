package com.tekup.institu_soa.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.tekup.institu_soa.models.etudient;
import com.tekup.institu_soa.repository.etudientRep;

@Service
public class etudeintServlmp implements etudeintServ {
    
     @Autowired

    private etudientRep etudientRepository;

    @Override
    public etudient createEtudient(etudient etudient) {
        return etudientRepository.save(etudient);
    }

    @Override
    public List<etudient> getAllEtudient() {

            return (List<etudient>)etudientRepository.findAll();
    }

    @Override
    public etudient getEtudientById(Long etuId) {
        Optional<etudient> optionalEtudient = etudientRepository.findById(etuId);
        return optionalEtudient.get();
    }

    @Override
    public etudient updateEtudient(Long id,etudient etudient) {
        Optional<etudient> ot = etudientRepository.findById(id);
        if(ot.isPresent()){
            etudient t=ot.get();
            t.setId(id);
            t.setNom(etudient.getNom());
            t.setPrenom(etudient.getPrenom());
            t.setDatedenaissance(etudient.getDatedenaissance());
            t.setAdr(etudient.getAdr());
            t.setVille(etudient.getVille());
            etudient updatedEtudient = etudientRepository.save(t);
            return updatedEtudient;
        }
        return null;
    }

    @Override
    public void deleteEtudient(Long etuId) {
        etudientRepository.deleteById(etuId);
    }
    




}