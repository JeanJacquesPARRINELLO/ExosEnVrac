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
public class Exercice03{
    //  À CHAQUE CHANGEMENT DE LA VALEUR DE FLAG L'EXCUTION
    //  DÉMARRE APRÈS LA COMPILATIONs
    boolean flag;   //  Déclarez une variable booléene «flag»

    public Exercice03(){
        //  INITIALISATION DE LA VARIABLE
//        this.flag = true;
    }
    
    public void launch(){
        System.out.println("Exercie 03");
        //  AFFICHAGE DE LA REPRÉSENTATION DE L'ÉTAT DU TAG
//        System.out.println((flag) ? "allumé" : "éteint");
        if(flag){
            System.out.println("allumé");
        }else{
            System.out.println("éteint");
        }
    }
    
}
