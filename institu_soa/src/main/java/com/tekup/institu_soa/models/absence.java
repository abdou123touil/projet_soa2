package com.tekup.institu_soa.models;

import java.util.Date;

public class absence  extends etudient{
    private boolean abse;
    public absence(Long id,String nom, String prenom, Date datedenaissance, String adr, String ville,int NEtude,boolean abse){
        super(id,nom,prenom,datedenaissance,adr,ville,NEtude);
        this.abse=abse;
    }
    public boolean getAbs(){
        return abse;
    }
    public void setAbs(boolean abse){
        this.abse=abse;
    }
}