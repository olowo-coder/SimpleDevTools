package com.example.simpldevtools.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Person {

    @NotEmpty
    @Pattern(regexp = "^[A-Z]", message = "must start with a capital letter")
    private String name;
}
