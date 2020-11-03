package com.urbanisationsi.microservices_assure.modele;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity    
public class Assure {
    @Id    
    @GeneratedValue(strategy=GenerationType.AUTO)     
    private Integer id;
    private String nom;
    private String prenom;
    private Long numeroPersonne;
    
    
    // Getter id
    public Integer getId() {
      return id;
    }
    // Setter id
    public void setId(Integer newId) {
      this.id = newId;
    }
    
    // Getter nom
    public String getNom() {
      return nom;
    }
    // Setter nom
    public void setNom(String newNom) {
      this.nom = newNom;
    }
    
    // Getter prenom
    public String getPrenom() {
      return prenom;
    }
    // Setter prenom
    public void setNewPrenom(String newPrenom) {
      this.prenom = newPrenom;
    }
    
    // Getter numeroPersonne
    public Long getNumeroPersonne() {
      return numeroPersonne;
    }
    // Setter numeroPersonne
    public void setNumeroPersonne(Long newNumeroPersonne) {
      this.numeroPersonne = newNumeroPersonne;
    }

}
// Ne pas oublier les getter et les setter