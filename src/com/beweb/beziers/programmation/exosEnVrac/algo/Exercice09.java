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
public class Exercice09 {
    //  Initialisez une variable entière à 243. Décrémentez-la jusqu’à 0
    int intVar = 243;
        
    public void launch(){
        for(int compteur = intVar ; compteur >= 1 ; compteur--){
            if(compteur%10 == 0 && compteur%3 == 0 && compteur%5 == 0){
                int affichage = compteur + compteur + 1;
                System.out.println(compteur + " est un multiple de 10 de 3 et de 5 à la fois. Son addition avec le nombre précédent vaut : " + affichage);
            }else if(compteur%10 == 0){
                int affichage = compteur + compteur + 1;
                System.out.println(compteur + " est un multiple de 10. Son addition avec le nombre précédent vaut : " + affichage);
            }else if(compteur%2 == 0){
                int affichage = compteur + compteur - 2;
                System.out.println("Le nombre " + compteur + " est est pair et son addition avec le prochain nombre pair est " + affichage);
            }else if(compteur%3 == 0 && compteur%5 == 0){
                System.out.println("le nombre " + compteur + " est un multiple de 3 et de 5 à la fois");
            }else{
                System.out.println("Le nombre est " + compteur );
            }
        }
    }
    
}
