package com.tekup.institu_soa.servises;

import java.util.List;

import com.tekup.institu_soa.models.ensignent;

public interface ensignentServ {


    ensignent createens(ensignent ensignent);

    List<ensignent> getAllens();
    ensignent getensById(Long ensId);
    ensignent updateens(Long id,ensignent ensignent);

    void deleteens(Long ensId);
    
} 