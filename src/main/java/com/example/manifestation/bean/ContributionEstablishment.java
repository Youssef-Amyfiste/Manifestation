package com.example.manifestation.bean;

import com.fasterxml.jackson.core.Base64Variant;

import javax.persistence.*;

@Entity
public class ContributionEstablishment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref ;
    private String establishmentName;
    private Double montant;
    private String nture;
    @ManyToOne
    private Manifestation manifestation;

    public ContributionEstablishment() {
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

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
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
