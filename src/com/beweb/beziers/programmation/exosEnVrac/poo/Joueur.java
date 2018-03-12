/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.poo;

/**
 *
 * @author padbrain
 */
public class Joueur {
    
    public String nom;
    public int[] liste = new int[10];
    private int nombreDeJets = 0;
    
    public void Joueur(String pNom){
        this.nom = pNom;
    }
    
    public void jet(){
        if(this.nombreDeJets > 10){
            System.exit(0);
        }else{
            liste[this.nombreDeJets] = (int)(Math.random() * 100);
            this.nombreDeJets++;
        }
    }
    
    public int getSomme(){
        int resultSum = 0;
        for(int i = 0 ; i < this.liste.length ; i++){
            resultSum += this.liste[i];
        }
        return resultSum;
    }
    
    public void afficherResultats(){
        System.out.println(this.nom + " a tiré les valeurs suivantes : ");
        for(int i = 0 ; i < this.liste.length ; i++){
            System.out.print(this.liste[i] + " | ");
        }
        System.out.println("\n\n");
    }
}
