package com.spring.model.enums;

public enum Gender {
    MALE("messages.gender.MALE"),
    FEMALE("messages.gender.FEMALE");

    Gender(String s) {label=s;}

    String label;

    public String getLabel()
    {
        return label;
    }
}