package com.tekup.institu_soa.models;

import java.io.File;
import java.util.Date;

public class adiministration extends utilisateur{


     private String roleadmin;
   

    public adiministration(){}

    public adiministration(Long id, String nom, String prenom, Date datedenaissance, String adr, String ville,String poste,Double salaire) {
        super(id, nom, prenom, datedenaissance, adr, ville);
        this.roleadmin=roleadmin;
       
    }

    public String getRole() {
        return roleadmin;
    }

    public void setRole(String poste) {
        this.roleadmin = roleadmin;
    }

   

    public class Main {
        public static void main(String[] args) {
            String xmlFilePath = "src/main/xml/administration.xml";
            File xmlFile = new File(xmlFilePath);


        }
    }
    
}