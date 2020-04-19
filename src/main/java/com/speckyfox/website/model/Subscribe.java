package com.speckyfox.website.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="subscribe")
public class Subscribe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String email;

    @Column
    private Date subscribed_on;

    @Column
    private Date unsubscribed_on;

    @Column
    private String topics;

    public Subscribe()
    {

    }

    public Subscribe(Integer id, Date subscribed_on, Date unsubscribed_on, String topics) {
        this.id = id;
        this.email = email;
        this.subscribed_on = subscribed_on;
        this.unsubscribed_on = unsubscribed_on;
        this.topics = topics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSubscribed_on() {
        return subscribed_on;
    }

    public void setSubscribed_on(Date subscribed_on) {
        this.subscribed_on = subscribed_on;
    }

    public Date getUnsubscribed_on() {
        return unsubscribed_on;
    }

    public void setUnsubscribed_on(Date unsubscribed_on) {
        this.unsubscribed_on = unsubscribed_on;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }
}
