package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank
    @Size (min = 1, max = 60, message = "Location must be between 3 and 60 characters long")
    private String location;

    @OneToMany(mappedBy = "employer" )
    //@JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer(){};



    public String getLocation() {
        return location;
    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
