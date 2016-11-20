package com.spring.model.enums;

public enum Color {
    RED("messages.color.RED"),GREEN("messages.color.GREEN"),BLUE("messages.color.BLUE"),BLACK("messages.color.BLACK");

    Color(String s) {label=s;}

    String label;

    public String getLabel()
    {
        return label;
    }
}