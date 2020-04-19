package com.speckyfox.website.model;

import org.springframework.data.annotation.LastModifiedDate;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "subject",nullable = false)
    private String subject;
    @Column(name = "message",nullable = false)
    private String message;
    @Column(name = "created",nullable = false)
    @LastModifiedDate
    private Date created;
    public Contact()
    {

    }
    public Contact(Integer id,Date created)
    {
        LocalDateTime now = LocalDateTime.now();
        this.id = id;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
