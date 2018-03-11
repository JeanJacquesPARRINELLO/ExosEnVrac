/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.poo;

//  PROBLÈME RENCONTRÉS :
//  MALGRÉ LA PRÉSENCE D'UN CONSTRUCTEUR DANS LA CLASSE PERSONNE
//  IL M'EST IMPOSSIBLE D'INSTANCIER UN OBJET PERSONNE EN PASSANT
//  LE PARAMÈTRE "NOM"

public class ObjetsMain {

    /**
     * ATTRIBUTS DE LA CLASSE
     */
    public Personne Dupond;
    public Personne Dupont;
    
    public void main(String[] args) {
        /*
        */
        //  INSTANCIATION  D'UN OBJET DE TYPE Exercice01
        Dupond = new Personne();
        Dupond.setName("Dupond");
        Dupond.setAdresse("3 rue de la poupée qui tousse", 34500, "Béziers");
        Dupond.setAge(27);
        Dupond.setCouleurCheveux("chatain");
        Dupond.setCouleurYeux("brun");
        Dupond.setProfession("professeur");
        Dupond.setSex("homme");
        Dupond.setTaille(1.68f);
        
        System.out.print("Je suis " + Dupond.getName() + ". ");
        System.out.print("Je suis un " + Dupond.getSex()+ " ");
        System.out.print("de " + Dupond.getAge() + "ans ");
        System.out.print("J'ai les cheuveux " + Dupond.getCouleurCheveux() + " ");
        System.out.print("et des yeux  " + Dupond.getCouleurYeux() + " ");
        System.out.print("et mesure " + Dupond.getTaille() + " m. ");
        System.out.print("Mon métier est " + Dupond.getProfession() + " ");
        System.out.print("et j'habite au " + Dupond.getAdresse()+ ".");
        
        
        Dupont = new Personne();
        Dupont.setName("Dupont");
        Dupont.setAdresse("5 avenue de la Castafiore", 34160, "Lunel");
        Dupont.setAge(27);
        Dupont.setCouleurCheveux("noir");
        Dupont.setCouleurYeux("bleu");
        Dupont.setProfession("farfelu");
        Dupont.setSex("homme");
        Dupont.setTaille(1.73f);
        
        System.out.print("Je suis " + Dupont.getName() + ". ");
        System.out.print("Je suis un " + Dupont.getSex()+ " ");
        System.out.print("de " + Dupont.getAge() + "ans ");
        System.out.print("J'ai les cheuveux " + Dupont.getCouleurCheveux() + " ");
        System.out.print("et des yeux  " + Dupont.getCouleurYeux() + " ");
        System.out.print("et mesure " + Dupont.getTaille() + " m. ");
        System.out.print("Mon métier est " + Dupont.getProfession() + " ");
        System.out.print("et j'habite au " + Dupont.getAdresse()+ ".");
    }
    
}
