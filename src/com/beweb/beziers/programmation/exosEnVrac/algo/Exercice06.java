package com.beweb.beziers.programmation.exosEnVrac.algo;

/**
 *
 * @author padbrain
 */
public class Exercice06 {
    //  DÉCLARATION DU TABLEAU DE BOOLEEN
    boolean[] tab = new boolean[10];
    
    public void launch(){
        System.out.println("Exercie 06");
        //  REMPLISSAGE DU TABLEAU AVEC DES VALEURS TRUE
        //  On fait évoluer l'indiceTableau de 0 jusqu'à 9
        int indiceTableau = 0;
        while(indiceTableau < tab.length){
            //  le tableau est rempli de valeurs true
            tab[indiceTableau++] = true;
        }
        
        //  REMPLISSAGE DU TABLEAU AVEC DES VALEURS FALSE
        //  On fait évoluer l'indiceTableau de 0 jusqu'à 9
        indiceTableau = 0;
        while(indiceTableau < tab.length){
            //  le tableau est rempli de valeurs false
            tab[indiceTableau++] = false;
        }
        
        //  REMPLISSAGE DU TABLEAU AVEC DES VALEURS TRUE ET FALSE ALTERNATIVES
        //  On fait évoluer l'indiceTableau de 0 jusqu'à 9
        indiceTableau = 0;
        while(indiceTableau < tab.length){
            //  le tableau est rempli alternativement de valeurs false et true
            tab[indiceTableau] = indiceTableau%2 == 1;
            System.out.println("tab[" + indiceTableau + "] = " + tab[indiceTableau++]);
        }
    }
}
