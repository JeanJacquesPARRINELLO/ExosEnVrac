/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.poo;
/**
 *
 * @author padbrain
 */
public class Personne { 
    
    /************************************
     * ATTRIBUTS DE LA CLASSE
    *************************************/
    
    String name;
    int age;
    Adresse adresse;
    String sexe;
    String couleurYeux;
    String couleurCheveux;
    float taille;
    String profession;
    
    public void personne(String nom){
        this.name = nom;
        this.adresse = new Adresse();
    }
    
    
    /************************************
     * SETTERS
    *************************************/
    public void setName(String nom){
        this.name = nom;
    }
    
    public void setAge(int aj){
        this.age = aj;
    }
    
    public void setAdresse(String rue, int CP, String ville){
        this.adresse.setRue(rue);
        this.adresse.setCPostal(CP);
        this.adresse.setVille(ville);
    }
    
    public void setSex(String sex){
        this.sexe = sex;
    }
    
    public void setCouleurYeux(String couleur){
        this.couleurYeux = couleur;
    }
    
    public void setCouleurCheveux(String couleur){
        this.couleurCheveux = couleur;
    }
    
    public void setTaille(float taill){
        this.taille = taill;
    }
    
    public void setProfession(String prof){
        this.profession = prof;
    }
     
    /************************************
     * GETTERS
     * @return 
    *************************************/
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getAdresse(){
        return this.adresse.getAdresse();
    }
    
    public String getSex(){
        return this.sexe;
    }
    
    public String getCouleurYeux(){
        return this.couleurYeux;
    }
    
    public String getCouleurCheveux(){
        return this.couleurCheveux;
    }
    
    public float getTaille(){
        return this.taille;
    }
    
    public String getProfession(){
        return this.profession;
    }
}
