package com.rest.webservice.restfulwebservices.versioning;

/**
 * Created by Muhammad.Asim on 3/1/2018.
 */
public class PersonV2 {

    private Name name;

    public PersonV2() {
        super();
    }

    public PersonV2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
