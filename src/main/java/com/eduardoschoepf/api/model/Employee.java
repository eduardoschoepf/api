package com.eduardoschoepf.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.io.Serializable;

import lombok.Data;

@Data                                                   // Est une annotation Lombok, la librairie s’en charge d’ajouter les getters et les setters 
@Entity                                                 // Est une annotation qui indique que la classe correspond à une table de la base de données
@Table(name = "employees")                              // Indique le nom de la table associée
public class Employee implements Serializable {

    @Id                                                 // L’attribut id correspond à la clé primaire de la table, et est donc annoté @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Comme l’id est auto-incrémenté, j’ai ajouté l’annotation @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")                          // L'annotation @Column pour faire le lien avec le nom du champ de la table
    private String firstName;

    @Column(name="last_name")                           // L'annotation @Column pour faire le lien avec le nom du champ de la table
    private String lastName;

    private String mail;                                // Pas besoin de mettre l'annotation @Column pour mail car le nom du champ de la table est identique

    private String password;                            // Pas besoin de mettre l'annotation @Column pour password car le nom du champ de la table est identique

}
