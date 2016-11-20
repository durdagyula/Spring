package com.spring.model.enums;

public enum School {
    PRIMARY("messages.school.PRIMARY"),
    HIGHSCHOOL("messages.school.HIGHSCHOOL"),
    COLLEGE("messages.school.COLLEGE"),
    UNI("messages.school.UNI");

    School(String s) {label=s;}

    String label;

    public String getLabel()
    {
        return label;
    }
}