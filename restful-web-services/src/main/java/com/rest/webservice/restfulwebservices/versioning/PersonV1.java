package com.rest.webservice.restfulwebservices.versioning;

/**
 * Created by Muhammad.Asim on 3/1/2018.
 */
public class PersonV1 {

    private String name;

    public PersonV1() {
        super();
    }

    public PersonV1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
