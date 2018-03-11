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
public class Exercice06 {
    //  DÉCLARATION DU TABLEAU DE BOOLEEN
    boolean[] tab = new boolean[10];
    
    public void launch(){
        //  REMPLISSAGE DU TABLEAU AVEC DES VALEURS TRUE
        int indiceTableau = 0;
        while(indiceTableau < tab.length){
            tab[indiceTableau] = true;
            indiceTableau++;
        }
        
        //  REMPLISSAGE DU TABLEAU AVEC DES VALEURS FALSE
        indiceTableau = 0;
        while(indiceTableau < tab.length){
            tab[indiceTableau] = false;
            indiceTableau++;
        }
        
        //  REMPLISSAGE DU TABLEAU AVEC DES VALEURS TRUE ET FALSE ALTERNATIVES
        indiceTableau = 0;
        while(indiceTableau < tab.length){
            tab[indiceTableau] = indiceTableau%2 == 1;
            System.out.println(tab[indiceTableau]);
            indiceTableau++;
        }
    }
}
