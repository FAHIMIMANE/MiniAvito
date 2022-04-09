package com.example.miniavito.bean;

import javax.persistence.*;

@Entity
public class AnnonceAppareilInformatique {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private User user;
    private double prix;

    public AnnonceAppareilInformatique( String ref, Categorie categorie, User user, double prix) {
        this.ref = ref;
        this.categorie = categorie;
        this.user = user;
        this.prix = prix;
    }

    public AnnonceAppareilInformatique() {
    }

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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
