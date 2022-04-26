package com.example.manifestation.bean;

import javax.persistence.*;

@Entity
public class ContributionSponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
    private  String ref ;
    private String organisme;
    private Double montant;
    private String nture;
    @ManyToOne
    private Manifestation manifestation;

    public ContributionSponsor() {
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

    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getNture() {
        return nture;
    }

    public void setNture(String nture) {
        this.nture = nture;
    }
}
