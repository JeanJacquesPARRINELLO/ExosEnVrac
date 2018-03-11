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
public class Adresse {
    
    /*  ATTRIBUTS DE LA CLASSE
    */
    
    public String noEtRue;
    public int codePostal;
    public String ville;
    
    public void adresse(){
        
    }
    
    public void setRue(String nomRue){
        this.noEtRue = nomRue;
    }
    
    public void setCPostal(int CP){
        this.codePostal = CP;
    }
    
    public void setVille(String villle){
        this.ville = villle;
    }
    
    public String getAdresse(){
        String adr = this.noEtRue + "\n" + this.codePostal + " " + this.ville;
        return adr;
    }
}
