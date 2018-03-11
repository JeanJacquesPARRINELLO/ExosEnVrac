/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.algo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 *
 * @author padbrain
 */
public class Exercice11 {
    //  DÉCLARATION DU TABLEAU CONTENANT LES 1000 PREMIERS
    //  NOMBRES DE LA SUITE FABONACCI
    int[] suite = new int[1000];
    
    //  LES LISTES PEUVENT ÊTRE REMPLIES DYNAMIQUEMENT
    //  SANS PRÉCISER DE TAILLE INITIALES
    List nombrespairs;
    List  nombresimpairs;
    List  multiplesdecinq;
    List  multiplesdetrois;


    public Exercice11() {
        //  INSTANCIATIONS DES LISTES NÉCESSAIRES
        this.nombrespairs = new LinkedList();
        this.nombresimpairs = new LinkedList();
        this.multiplesdecinq = new LinkedList();
        this.multiplesdetrois = new LinkedList();
    }
    
    public void launch(){
        //  REMPLISSAGE DU TABLEAU AVEC LES VALEURS DE LA SUITE
        //  LES DEUX PREMIÈRE VALEURS VALENT 0.
        //  LES VALEURS SUIVANTE OBEISSE À LA FORMULE SUIVANTE :
        //  Fn = Fn-2 + Fn-1    pour n≥2
        
        for(int n = 0 ; n < 1000 ; n++){
            switch(n){
                case(0):
                    suite[n] = 0;
                    break;
                case(1):
                    suite[n] = 1;
                    break;
                default:
                    suite[n] = suite[n-2] + suite[n-1];
                    break;
            }// System.out.println("F" + n + " est égal à : " + suite[n]);
        }
        
        //  PARSAGE ET CLASSEMENT DES NOMBRES DANS LES TABLEAUX CORRESPONDANTS
        //  PLUSIEURS POSSIBILITÉS POUR UN MÊME NOMBRES
        //  30 EST À LA FOIS UN NOMBRE PAIR, MULTIPLE DE 5 ET DE 3
        //  15 EST À LA FOIS UN NOMBRE IMPAIR, MULTIPLE DE 5 ET DE 3
        //  10 EST À LA FOIS UN NOMBRE PAIR ET MULTIPLE DE 5
        //  9 EST À LA FOIS UN NOMBRE IMPAIR ET MULTIPLE DE 3
        //  PUIS LES NOMBRES PAIRS ET LES NOMBRES IMPAIRS NON MULTIPLE DE 3 ET DE 5
        
        //  int nbPairs = 0, nbImpairs = 0, nbX3= 0, nbX5 = 0;
        
        for(int n = 0 ; n < 1000 ; n++){
            
            if(suite[n]%2 == 0 && suite[n]%3 == 0 && suite[n]%5 == 0){
                nombrespairs.add(suite[n]);  //    nbPairs++;
                multiplesdecinq.add(suite[n]); //    nbX3++;
                multiplesdetrois.add(suite[n]);//    nbX5++;
            }
            if(suite[n]%2 == 1 && suite[n]%3 == 0 && suite[n]%5 == 0){
                nombresimpairs.add(suite[n]);  //    nbImpairs++;
                multiplesdecinq.add(suite[n]); //    nbX3++;
                multiplesdetrois.add(suite[n]);//    nbX5++;                
            }
            if(suite[n]%2 == 1 && suite[n]%5 == 0){
                nombresimpairs.add(suite[n]);  //    nbImpairs++;
                multiplesdecinq.add(suite[n]); //    nbX5++;                
            }
            if(suite[n]%2 == 0 && suite[n]%3 == 0){
                nombrespairs.add(suite[n]);  //   nbPairs++;
                multiplesdetrois.add(suite[n]);//   nbX3++;            
            }
            if(suite[n]%2 == 0){
                nombrespairs.add(suite[n]);  //    nbPairs++;           
            }
            if(suite[n]%2 == 1){
                nombresimpairs.add(suite[n]);  //    nbImpairs++;          
            }
            /*
            System.out.println(suite[n]%2 == 0 && suite[n]%3 == 0 && suite[n]%5 == 0);*/
        }
        /*
            System.out.println("Les nombres pairs " + nbPairs);
            System.out.println("Les nombres nbImpairs " + nbImpairs);
            System.out.println("Les nombres nbX3 " + nbX3);
            System.out.println("Les nombres nbX5 " + nbX5);
        */
        
        //  AFFICHAGE DES DONNÉES POUR LES NOMBRES PAIRS
        System.out.println("Le tableau nombrespairs contient " + nombrespairs.size() + " valeurs");
        //  INSTANCIATION D'UN OBJET DE TYPE LISTITERATOR
        ListIterator liPairs = nombrespairs.listIterator();
        //  PARCOURS DE L'ITERATEUR TANT QU'IL POSSÈDE UE VALEUR
        while(liPairs.hasNext()){
            //  AFFICHAGE DES VALEURS SUR UNE LIGNE
            System.out.print(liPairs.next() + " ");
        }
        
        //  AFFICHAGE DES DONNÉES POUR LES NOMBRES IMPAIRS
        System.out.println("\n\nLe tableau nombresimpairs contient " + nombresimpairs.size() + " valeurs");
        //  INSTANCIATION D'UN OBJET DE TYPE LISTITERATOR
        ListIterator liImpairs = nombresimpairs.listIterator();
        //  PARCOURS DE L'ITERATEUR TANT QU'IL POSSÈDE UE VALEUR
        while(liImpairs.hasNext()){
            //  AFFICHAGE DES VALEURS SUR UNE LIGNE
            System.out.print(liImpairs.next() + " ");
        }
        
        //  AFFICHAGE DES DONNÉES POUR LES NOMBRES PAIRS
        System.out.println("\n\nLe tableau multiplesdecinq contient " + multiplesdecinq.size() + " valeurs");
        //  INSTANCIATION D'UN OBJET DE TYPE LISTITERATOR
        ListIterator liXde5 = multiplesdecinq.listIterator();
        //  PARCOURS DE L'ITERATEUR TANT QU'IL POSSÈDE UE VALEUR
        while(liXde5.hasNext()){
            //  AFFICHAGE DES VALEURS SUR UNE LIGNE
            System.out.print(liXde5.next() + " ");
        }
        
        //  AFFICHAGE DES DONNÉES POUR LES NOMBRES PAIRS
        System.out.println("\n\nLe tableau multiplesdetrois contient " + multiplesdetrois.size() + " valeurs");
        //  INSTANCIATION D'UN OBJET DE TYPE LISTITERATOR
        ListIterator liXde3 = multiplesdetrois.listIterator();
        //  PARCOURS DE L'ITERATEUR TANT QU'IL POSSÈDE UE VALEUR
        while(liXde3.hasNext()){
            //  AFFICHAGE DES VALEURS SUR UNE LIGNE
            System.out.print(liXde3.next() + " ");
        }
    }
    
}
