package com.tekup.institu_soa.models;

import java.io.File;
import java.util.Date;

import jakarta.persistence.Entity;



@Entity
public class ensignent extends utilisateur {

        public ensignent(){
        super();
    };
    //constructeur
    public ensignent(Long id,String nom, String prenom, Date datedenaissance, String adr,String ville) {
        super(id, nom, prenom, datedenaissance, adr, ville);
    }


    public class Main {
        public static void main(String[] args) {
            String xmlFilePath = "src/main/xml/ensignent.xml";
            File xmlFile = new File(xmlFilePath);


        }
    }

    
}