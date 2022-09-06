package com.laioffer.staybooking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "stay_image")
public class StayImage implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String url;

    @ManyToOne
    @JoinColumn(name = "stay_id")
    // create a column matches to stay table column stay_id
    @JsonIgnore
    // json Ignore since we only want return url table
    // otherwise it will create on stay table 嵌套
    private Stay stay;

    public StayImage() {}

    public StayImage(String url, Stay stay) {
        this.url = url;
        this.stay = stay;
    }

    public String getUrl() {
        return url;
    }

    public StayImage setUrl(String url) {
        this.url = url;
        return this;
    }

    public Stay getStay() {
        return stay;
    }

    public StayImage setStay(Stay stay) {
        this.stay = stay;
        return this;
    }
}