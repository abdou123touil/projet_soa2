package com.tekup.institu_soa.servises;

import java.util.List;

import com.tekup.institu_soa.models.adiministration;

public interface administrationServ {

    adiministration createAdmin(adiministration admin);


    List<adiministration> getAllSAdmin();

     adiministration getAdminById(Long adminId);

     adiministration updateAdmin(Long id,adiministration admin);

    void deleteAdmin(Long adminId);
}   
