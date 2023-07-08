package com.example.demo1ee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="student")
public class StudentTo {
    String name;
    String city;
    @Id
    String email;

}
