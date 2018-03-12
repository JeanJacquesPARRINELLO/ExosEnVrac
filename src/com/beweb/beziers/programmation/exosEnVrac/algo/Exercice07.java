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
public class Exercice07 {
    //  Initialisez une chaine de caractère avec le texte «bonjour»
    String bonjour = "bonjour";
    //  Initialisez une chaine de caractère avec le texte «bonsoir»
    String bonsoir = "bonsoir";
    //  Déclarez un booléen nommé «morning»
    boolean morning;
    
    public void launch(){
        System.out.println("Exercie 07");
        //  Affichez la chaine de caractère sur la console
        if(!morning){
            System.out.println(bonsoir + " vous");
        }else{
            System.out.println(bonjour + " vous");
        }
    }
}
