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

//   la valeur de la variable entière vaut 2
public class Exercice04 {
    //  Déclaration d’une variable booléenne
    boolean flag = true;
    int myInt;

    public Exercice04() {
        //  initialisation d’une variable entière à 0
    }
    
    public void launch(){
        myInt = 0;
        System.out.println("Exercie 04");
        //  Ecrire une condition qui incrémente la variable entière si la variable booléenne est fausse
        if(!flag){++myInt;}
        //  Ecrire une condition qui décrémente la variable entière si la variable booléenne est vrai
        if(flag){--myInt;}
        //  Inverser la valeur de la variable booléenne
        flag = !flag;
        //  Ecrire une condition qui incrémente la variable entière si la variable booléenne est vrai
        if(flag){++myInt;}
        //  Ecrire une condition qui décrémente la variable entière si la variable booléenne est fausse
        if(!flag){--myInt;}
    System.out.println("myInt = " + myInt);
    }
    
}
