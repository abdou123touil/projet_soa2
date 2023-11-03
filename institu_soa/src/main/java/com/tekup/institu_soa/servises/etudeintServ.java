package com.tekup.institu_soa.servises;

import java.util.List;

import com.tekup.institu_soa.models.etudient;

public interface etudeintServ {
 
    
    etudient createEtudient(etudient etudient);

    List<etudient> getAllEtudient();
    etudient getEtudientById(Long etuId);
    etudient updateEtudient(Long id,etudient etudient);
    void deleteEtudient(Long etutId);

}