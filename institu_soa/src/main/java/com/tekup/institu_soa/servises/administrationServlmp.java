package com.tekup.institu_soa.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tekup.institu_soa.models.adiministration;
import com.tekup.institu_soa.repository.administrationRep;
import java.util.Optional;
import org.springframework.stereotype.Service;



@Service
public class administrationServlmp  implements administrationServ{
    

     @Autowired
    private administrationRep adminRep;

    @Override
    public adiministration createAdmin(adiministration admin) {
        return adminRep.save(admin);
    }

    @Override
    public List<adiministration> getAllSAdmin() {

            return (List<adiministration>)adminRep.findAll();
    }

    @Override
    public adiministration getAdminById(Long adminid) {
        Optional<adiministration> optionaladmin = adminRep.findById(adminid);
        return optionaladmin.get();
    }

    @Override
    public adiministration updateAdmin(Long adminid,adiministration admin) {
        Optional<adiministration> oc = adminRep.findById(adminid);
        if(oc.isPresent()) {
            adiministration c=oc.get();
            c.setId(adminid);
            c.setNom(admin.getNom());
            c.setPrenom(admin.getPrenom());
            c.setDatedenaissance(admin.getDatedenaissance());
            c.setAdr(admin.getAdr());
            c.setVille(admin.getVille());
            c.setRole(admin.getRole());
            
            adiministration updatedAdmin = adminRep.save(c);
            return updatedAdmin;
        }
        return null;
    }

    @Override
   public void deleteAdmin(Long adminId ){
        adminRep.deleteById(adminId);
   }


}