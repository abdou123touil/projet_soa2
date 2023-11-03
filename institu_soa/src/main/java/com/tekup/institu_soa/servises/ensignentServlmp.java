package com.tekup.institu_soa.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.institu_soa.models.ensignent;
import com.tekup.institu_soa.repository.ensignentRep;

@Service
public class ensignentServlmp implements ensignentServ {
    
      @Autowired
    private ensignentRep ensignentRep;

    @Override
    public ensignent createens(ensignent ensignent) {
        return ensignentRep.save(ensignent);
    }

    @Override
    public List<ensignent> getAllens() {

            return (List<ensignent>)ensignentRep.findAll();
    }

    @Override
    public ensignent getensById(Long teacherId) {
        Optional<ensignent> optionalUser = ensignentRep.findById(teacherId);
        return optionalUser.get();
    }

    @Override
    public ensignent updateens(Long id,ensignent ensignent) {
        Optional <ensignent> ot = ensignentRep.findById(id);
        if(ot.isPresent()) {
            ensignent t=ot.get();
            t.setId(id);
            t.setNom(ensignent.getNom());
            t.setPrenom(ensignent.getPrenom());
            t.setDatedenaissance(ensignent.getDatedenaissance());
            t.setAdr(ensignent.getAdr());
            t.setVille(ensignent.getVille());
            ensignent updatedens = ensignentRep.save(t);
            return updatedens;
        }
        return null;
    }

    @Override
    public void deleteens(Long ensId) {
        ensignentRep.deleteById(ensId);
    }
    
}