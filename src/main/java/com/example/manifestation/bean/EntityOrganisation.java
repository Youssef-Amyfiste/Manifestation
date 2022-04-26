package com.example.manifestation.bean;

import javax.persistence.*;

@Entity
public class EntityOrganisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    private String name ;
    private String resposableName;
    private String establishmentName;

    public EntityOrganisation() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResposableName() {
        return resposableName;
    }

    public void setResposableName(String resposableName) {
        this.resposableName = resposableName;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }
}
