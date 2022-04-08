package com.example.miniavito.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private String login;
    private String password;
    private boolean prof;
    private boolean blocked ;
    @OneToMany(mappedBy = "user")
    private List<AnnonceHeureSuplementaire> annonceHeureSuplementaires;
    @OneToMany(mappedBy = "user")
    private List<AnnonceVoiture> annoncevoitures;

    @OneToMany(mappedBy = "user")
    private List<AnnonceImmobilier> annonceImmobiliers;



    public List<AnnonceHeureSuplementaire> getAnnonceHeureSuplementaires() {
        return annonceHeureSuplementaires;
    }

    public void setAnnonceHeureSuplementaires(List<AnnonceHeureSuplementaire> annonceHeureSuplementaires) {
        this.annonceHeureSuplementaires = annonceHeureSuplementaires;
    }

    public List<AnnonceVoiture> getAnnoncevoitures() {
        return annoncevoitures;
    }

    public void setAnnoncevoitures(List<AnnonceVoiture> annoncevoitures) {
        this.annoncevoitures = annoncevoitures;
    }

    public List<AnnonceImmobilier> getAnnonceImmobiliers() {
        return annonceImmobiliers;
    }

    public void setAnnonceImmobiliers(List<AnnonceImmobilier> annonceImmobiliers) {
        this.annonceImmobiliers = annonceImmobiliers;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isProf() {
        return prof;
    }

    public void setProf(boolean prof) {
        this.prof = prof;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
