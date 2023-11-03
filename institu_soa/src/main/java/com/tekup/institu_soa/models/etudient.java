package com.tekup.institu_soa.models;

import java.io.File;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class etudient extends utilisateur {
      @Column(name = "niveau_etude")
        private int  NEtude;
        public etudient(){}
        public etudient(Long id,String nom, String prenom, Date datedenaissance, String adr, String ville,int niveauEtude) {
            super(id,nom, prenom, datedenaissance, adr, ville);
            this.NEtude=NEtude;
        }
        public int getNEtude() {
        return NEtude;
    }

    public void setNEtude(int NEtude) {
        this.NEtude = NEtude;
    }

    public class Main {
        public static void main(String[] args) {
            String xmlFilePath = "src/main/xml/etudient.xml";
            File xmlFile = new File(xmlFilePath);


        }
    }
}