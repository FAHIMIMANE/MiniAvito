package com.example.miniavito.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnnonceHeureSuplementaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String ref;
    private User user;
    private  String titre;
    private  String description;
    private double montant;
    private  Matiere matiere;
    private  String jourDisponnibilite;

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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getRefMatiere() {
        return refMatiere;
    }

    public void setRefMatiere(String refMatiere) {
        this.refMatiere = refMatiere;
    }

    public String getJourDisponnibilite() {
        return jourDisponnibilite;
    }

    public void setJourDisponnibilite(String jourDisponnibilite) {
        this.jourDisponnibilite = jourDisponnibilite;
    }
}
