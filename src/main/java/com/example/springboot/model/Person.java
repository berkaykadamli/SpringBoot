package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {//Our model in here
    private final UUID id;

    @NotBlank
    private final String name;
    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {//we can write use by json
        this.id = id;
        this.name = name;
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
