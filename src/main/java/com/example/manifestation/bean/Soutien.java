package com.example.manifestation.bean;

import javax.persistence.*;

@Entity
public class Soutien {
    @Id     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref ;
    private String rubrique ;
    private int nombre ;
    private Double montant ;
    private Double montantPropose ;

    @ManyToOne
    private Manifestation manifestation;

    public Soutien() {
    }

    public Double getMontantPropose() {
        return montantPropose;
    }

    public void setMontantPropose(Double montantPropose) {
        this.montantPropose = montantPropose;
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

    public String getRubrique() {
        return rubrique;
    }

    public void setRubrique(String rubrique) {
        this.rubrique = rubrique;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

}
