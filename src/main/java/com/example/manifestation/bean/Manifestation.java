package com.example.manifestation.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Manifestation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ref;
    private String etentue;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date DateStart;
    private String DateEnd;
    private String lieu;
    private int nbrParticipantPrevu;
    private String siteWeb;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ImplicatedEstablishment> implicatedEstablishments;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ImplicatedPartner> implicatedPartners;
    @OneToOne(mappedBy = "manifestation")
    private EntityOrganisation entityOrganisation;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ContributionSponsor> ContributionSponsors;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<CommitteeOrganisation> committeeOrganisations;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Coordonnateur> coordonnateurs;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ContributionEstablishment> contributionEstablishments;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ContributionParticipant> contributionParticipants;
    @OneToMany(mappedBy = "manifestation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Soutien> soutiens;


    public Manifestation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getEtentue() {
        return etentue;
    }

    public void setEtentue(String etentue) {
        this.etentue = etentue;
    }

    public Date getDateStart() {
        return DateStart;
    }

    public void setDateStart(Date dateStart) {
        DateStart = dateStart;
    }

    public String getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(String dateEnd) {
        DateEnd = dateEnd;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public List<ImplicatedEstablishment> getImplicatedEstablishments() {
        return implicatedEstablishments;
    }

    public void setImplicatedEstablishments(List<ImplicatedEstablishment> implicatedEstablishments) {
        this.implicatedEstablishments = implicatedEstablishments;
    }

    public List<ImplicatedPartner> getImplicatedPartners() {
        return implicatedPartners;
    }

    public void setImplicatedPartners(List<ImplicatedPartner> implicatedPartners) {
        this.implicatedPartners = implicatedPartners;
    }

    public int getNbrParticipantPrevu() {
        return nbrParticipantPrevu;
    }

    public void setNbrParticipantPrevu(int nbrParticipantPrevu) {
        this.nbrParticipantPrevu = nbrParticipantPrevu;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EntityOrganisation getEntityOrganisation() {
        return entityOrganisation;
    }

    public void setEntityOrganisation(EntityOrganisation entityOrganisation) {
        this.entityOrganisation = entityOrganisation;
    }

    public List<ContributionSponsor> getContributionSponsors() {
        return ContributionSponsors;
    }

    public void setContributionSponsors(List<ContributionSponsor> contributionSponsors) {
        ContributionSponsors = contributionSponsors;
    }

    public List<CommitteeOrganisation> getCommitteeOrganisations() {
        return committeeOrganisations;
    }

    public void setCommitteeOrganisations(List<CommitteeOrganisation> committeeOrganisations) {
        this.committeeOrganisations = committeeOrganisations;
    }

    public List<Coordonnateur> getCoordonnateurs() {
        return coordonnateurs;
    }

    public void setCoordonnateurs(List<Coordonnateur> coordonnateurs) {
        this.coordonnateurs = coordonnateurs;
    }

    public List<ContributionEstablishment> getContributionEstablishments() {
        return contributionEstablishments;
    }

    public void setContributionEstablishments(List<ContributionEstablishment> contributionEstablishments) {
        this.contributionEstablishments = contributionEstablishments;
    }

    public List<ContributionParticipant> getContributionParticipants() {
        return contributionParticipants;
    }

    public void setContributionParticipants(List<ContributionParticipant> contributionParticipants) {
        this.contributionParticipants = contributionParticipants;
    }

    public List<Soutien> getSoutiens() {
        return soutiens;
    }

    public void setSoutiens(List<Soutien> soutiens) {
        this.soutiens = soutiens;
    }
}
