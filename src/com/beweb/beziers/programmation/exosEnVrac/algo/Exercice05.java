/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.algo;

/**
 *
 * @author padbrain
 */
public class Exercice05 {
    //  DÉCLARATION DE LA VARIABLE COMPTEUR
    int compteur;

    public Exercice05() {
        //  Initialisez une variable entière «compteur»à 10
        this.compteur = 10;
    }
    
    public void launch(){
        while(compteur <= 100){
            //  Utilisez une boucle while pour afficher en console toutes les valeurs 
            //  que peut prendre cette variable entre 10 et 100 inclus
            System.out.println(compteur++);
        }
    }
    
}
