package fr.polytech.mtp.coviwad_users.models;

import javax.persistence.*;

@Entity(name="users")
@Access(AccessType.FIELD)
public class User {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="email")
    private String email;

    @Column(name = "email_constraint")
    private String emailConstraint ;

    @Column(name = "email_verified")
    private Boolean emailVeried;

    @Column(name="enabled")
    private Boolean enabled;

    @Column(name = "federation_link")
    private String federationLink;

    @Column(name="last_name")
    private String lastName;

    @Column(name="realm_id")
    private String realmId;

    @Column(name="username")
    private String username;

    @Column(name="created_timestamp")
    private Double createdTimestamp;

    @Column(name="service_account_client_link")
    private String serviceAccountClientLink;

    @Column(name="not_before")
    private int notBefore;

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailConstraint() {
        return emailConstraint;
    }

    public void setEmailConstraint(String emailConstraint) {
        this.emailConstraint = emailConstraint;
    }

    public Boolean getEmailVeried() {
        return emailVeried;
    }

    public void setEmailVeried(Boolean emailVeried) {
        this.emailVeried = emailVeried;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFederationLink() {
        return federationLink;
    }

    public void setFederationLink(String federationLink) {
        this.federationLink = federationLink;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Double createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getServiceAccountClientLink() {
        return serviceAccountClientLink;
    }

    public void setServiceAccountClientLink(String serviceAccountClientLink) {
        this.serviceAccountClientLink = serviceAccountClientLink;
    }

    public int getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(int notBefore) {
        this.notBefore = notBefore;
    }
}
