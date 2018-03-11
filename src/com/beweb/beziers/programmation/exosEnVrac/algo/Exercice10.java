/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.algo;

/**
 *
 * @author padbrain
 * F0 = 0
 * F1 = 0
 * Fn = Fn−2+ Fn−1 pour n≥2.
 */
public class Exercice10 {
    //  DÉCLARATION DU TABLEAU CONTENANT LES 100 PREMIERS
    //  NOMBRES DE LA SUITE FABONACCI
    int[] fabonacciTab = new int[100];
    
    public void launch(){
        //  REMPLISSAGE DU TABLEAU AVEC LES VALEURS DE LA SUITE
        //  LES DEUX PREMIÈRE VALEURS VALENT 0.
        //  LES VALEURS SUIVANTES SONT RÉGIES PAR LA FORMULE SUIVANTE :
        //  Fn = Fn-2 + Fn-1    pour n≥2
        
        for(int n = 0 ; n < 100 ; n++){
            switch(n){
                case(0):
                    fabonacciTab[n] = 0;
                    break;
                case(1):
                    fabonacciTab[n] = 1;
                    break;
                default:
                    fabonacciTab[n] = fabonacciTab[n-2] + fabonacciTab[n-1];
                    break;
            }
            System.out.println("F" + n + " est égal à : " + fabonacciTab[n]);
        }
    }
    
}
