package com.example.miniavito.bean;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
public class AnnonceImmobilier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    @ManyToOne (fetch = FetchType.LAZY)
    private  User user;
    @ManyToOne
    private TypeImmobilier typeImmobilier;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TypeImmobilier getTypeImmobilier() {
        return typeImmobilier;
    }

    public void setTypeImmobilier(TypeImmobilier typeImmobilier) {
        this.typeImmobilier = typeImmobilier;
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
