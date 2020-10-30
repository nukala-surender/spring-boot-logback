package com.examples.interview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("FIRST_NAME")
    private String firstName;

    @JsonProperty("LAST_NAME")
    private String lastName;

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
}
