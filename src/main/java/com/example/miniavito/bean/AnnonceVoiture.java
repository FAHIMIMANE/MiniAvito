package com.example.miniavito.bean;


import javax.persistence.*;

@Entity
public class AnnonceVoiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String ref;
    @ManyToOne
    private User user;
    private String titre;
    private String description;
    private double montant;
    private String refModel;
    private String refCarburant;
    private int anneeMiseEnCirculation;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getRefModel() {
        return refModel;
    }

    public void setRefModel(String refModel) {
        this.refModel = refModel;
    }

    public String getRefCarburant() {
        return refCarburant;
    }

    public void setRefCarburant(String refCarburant) {
        this.refCarburant = refCarburant;
    }

    public int getAnneeMiseEnCirculation() {
        return anneeMiseEnCirculation;
    }

    public void setAnneeMiseEnCirculation(int anneeMiseEnCirculation) {
        this.anneeMiseEnCirculation = anneeMiseEnCirculation;
    }
}
