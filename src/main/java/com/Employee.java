package com;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by JT on 03/04/2017.
 */
@Data
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String job;
    private String shiftDay;
    private String timeOfShift;
    private @Version @JsonIgnore Long version;

    private Employee() {}

    public Employee(String firstName, String lastName, String job, String shiftDay, String timeOfShift) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.shiftDay = shiftDay;
        this.timeOfShift = timeOfShift;
    }
}
