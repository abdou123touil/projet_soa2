package com.tekup.institu_soa.models;



import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Data
@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
 
    @Column(name = "Firstname")
    protected String  nom;
    @Column(name = "Lastname")
    protected String prenom;
    @Column(name = "Birthday")
    protected Date datedenaissance;
    @Column(name = "Mail")
    protected String adr;
    @Column(name = "Adress")
    protected String ville;

    
        public utilisateur(Long id,String nom, String prenom, Date datedenaissance, String adr, String ville) {
            this.id=id;
            this.nom = nom;
            this.prenom = prenom;
            this.datedenaissance = datedenaissance;
            this.adr = adr;
            this.ville = ville;
    }
    public utilisateur() {

    }
    }
