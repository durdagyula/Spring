package com.spring.model;


import com.spring.model.enums.Color;
import com.spring.model.enums.Gender;
import com.spring.model.enums.School;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.StringJoiner;

@SuppressWarnings("Since15")
public class User
{
    @NotNull
    @Size(min=2, max=20)
    private String name;
    @NotNull
    private School school;
    @NotNull
    private String gender;
    @Size(min=1, max=4)
    private List<Color> colors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" - ");
        sj.add(getName());
        sj.add(getGender());
        sj.add(getSchool().toString());
        sj.add(getColors().toString());

        return sj.toString();
    }
}