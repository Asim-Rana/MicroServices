package com.rest.webservice.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Muhammad.Asim on 3/6/2018.
 */
@Entity
@ApiModel(description="All posts by the user.")
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    @ApiModelProperty(notes="Description should have atleast 2 characters")
    @Size(min=2, message="Description should have atleast 2 characters")
    private String description;

    @ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("Post [id=%s, description=%s]", id, description);
    }

}