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
    private String remarque ;
    private Double montantGlobal ;
    @ManyToOne
    private Manifestation manifestation;

    public Soutien() {
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

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public Double getMontantGlobal() {
        return montantGlobal;
    }

    public void setMontantGlobal(Double montantGlobal) {
        this.montantGlobal = montantGlobal;
    }
}
