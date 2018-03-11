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
public class Exercice08 {
    //  Initialisez une variable entière à 243. Décrémentez-la jusqu’à 0
    int intVar = 243;
    
    public void launch(){
        for(int compteur = intVar ; compteur >= 1 ; compteur--){
            if(compteur%10 == 0){
                System.out.println("Le nombre " + compteur + " est un multiple de 10");
            }else if(compteur%5 == 0){
                System.out.println("Le nombre " + compteur + " est un multiple de 5");
            }else if(compteur%2 == 0){
                System.out.println("Le nombre " + compteur + " est pair");
            }else{
                System.out.println("Le nombre est " + compteur);
            }
        }
    }
}
