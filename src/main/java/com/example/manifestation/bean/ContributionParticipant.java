package com.example.manifestation.bean;

import javax.persistence.*;

@Entity
public class ContributionParticipant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String ref;
    private String couvrement ;
    private String fonction ;
    private Double montant ;
    @ManyToOne
    private Manifestation manifestation;

    public ContributionParticipant() {
    }

    public Manifestation getManifestation() {
        return manifestation;
    }

    public void setManifestation(Manifestation manifestation) {
        this.manifestation = manifestation;
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

    public String getCouvrement() {
        return couvrement;
    }

    public void setCouvrement(String couvrement) {
        this.couvrement = couvrement;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
