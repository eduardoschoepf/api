package com.eduardoschoepf.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.io.Serializable;

import lombok.Data;

@Data                                                   // This is a Lombok annotation; the library takes care of adding getters and setters
@Entity                                                 // This annotation indicates that the class corresponds to a database table
@Table(name = "employees")                            // Specifies the name of the associated table
public class Employee implements Serializable {

    @Id                                                 // The id attribute corresponds to the primary key of the table and is thus annotated with @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     // Since the id is auto-incremented, I added the @GeneratedValue(strategy = GenerationType.IDENTITY) annotation
    private Long id;

    @Column(name="first_name")                          // The @Column annotation is used to map to the table's field name
    private String firstName;

    @Column(name="last_name")                           // The @Column annotation is used to map to the table's field name
    private String lastName;

    private String mail;                                // No need to use the @Column annotation for mail because the field name is identical to the table's column name

    private String password;                            // No need to use the @Column annotation for password because the field name is identical to the table's column name

}