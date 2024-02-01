package com.videoHosting.demo.subscriberModule.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SubscriberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ChannelInfo> subscribedTo;

    private String email;

    // Constructors, getters, and setters


    public SubscriberEntity() {
    }

    public SubscriberEntity(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getters and setters for subscribedTo
    public List<ChannelInfo> getSubscribedTo() {
        return subscribedTo;
    }

    public void setSubscribedTo(List<ChannelInfo> subscribedTo) {
        this.subscribedTo = subscribedTo;
    }
}
