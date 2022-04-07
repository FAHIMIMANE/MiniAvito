package com.example.miniavito.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnnonceImmobilier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long id;
    private String ref;
    private String refUser;
    private String refTypeImmobilier;
    private String typeAnnonce;
    private String refVille;
    private double prix;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRefUser() {
        return refUser;
    }

    public void setRefUser(String refUser) {
        this.refUser = refUser;
    }

    public String getRefTypeImmobilier() {
        return refTypeImmobilier;
    }

    public void setRefTypeImmobilier(String refTypeImmobilier) {
        this.refTypeImmobilier = refTypeImmobilier;
    }

    public String getTypeAnnonce() {
        return typeAnnonce;
    }

    public void setTypeAnnonce(String typeAnnonce) {
        this.typeAnnonce = typeAnnonce;
    }

    public String getRefVille() {
        return refVille;
    }

    public void setRefVille(String refVille) {
        this.refVille = refVille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
