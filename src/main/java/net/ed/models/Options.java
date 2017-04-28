package net.ed.models;
/**
 * Inspired by LaunchCode
 * Created by Edward Dupre
 * Copyright 2017
 */

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Options {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=25)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

//    @ManyToOne
//    private Options options;

    public Options(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Options() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
