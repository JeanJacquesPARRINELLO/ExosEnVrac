/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.poo;

//import com.beweb.beziers.programmation.exosEnVrac.poo.Exercice02;

/**
 *
 * @author padbrain
 */
public class JeuDeHazard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Exercice02 joueur1 = new Exercice02("joueur 1");
        Exercice02 joueur2 = new Exercice02("joueur 2");
        
        for(int jet = 1 ; jet <= 10 ; jet++){
            joueur1.jet();
            joueur2.jet();
        }
        
        joueur1.afficherResultats();
        joueur2.afficherResultats();
        
        if(joueur1.getSomme() - joueur2.getSomme() == 0){
            System.out.println("Exercice02 1 : " + joueur1.getSomme());            
            System.out.println("Exercice02 2 : " + joueur2.getSomme());   
            System.out.println("Les deux joueurs sont à égalité");
        }else if(joueur1.getSomme() - joueur2.getSomme() < 0){
            System.out.println("Exercice02 1 : " + joueur1.getSomme());            
            System.out.println("Exercice02 2 : " + joueur2.getSomme());            
            System.out.println("Exercice02 2 gagne");        
        }else if(joueur1.getSomme() - joueur2.getSomme() > 0){
            System.out.println("Exercice02 1 : " + joueur1.getSomme());            
            System.out.println("Exercice02 2 : " + joueur2.getSomme());   
            System.out.println("Exercice02 1 gagne");            
        }
    }
    
}
