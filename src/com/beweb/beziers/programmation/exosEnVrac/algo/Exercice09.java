package com.beweb.beziers.programmation.exosEnVrac.algo;

/**
 *
 * @author padbrain
 */
public class Exercice09 {
        
    public void launch(){
        System.out.println("Exercie 09");
        //  Décrémentation du compteur de 243 jusqu'à 1
        for(int compteur = 243 ; compteur > 0 ; compteur--){
            
            //  Traitement des nombres multiples à la fois de 10, 5 et 3
            if(compteur%10 == 0 && compteur%3 == 0 && compteur%5 == 0){
//                int affichage = compteur + compteur + 1;
                System.out.println(compteur + " est un multiple de 10 de 3 et de 5 à la fois. Son addition avec le nombre précédent vaut : " + (2 * compteur +1));
                System.out.println("Mais il est aussi pair donc son addition avec le prochain nombre pair est " + (2 * compteur - 2) + "\n");
            }
            
            //  Traitement des nombres multiples de 10.
            else if(compteur%10 == 0){
//                int affichage = compteur + compteur + 1;
                System.out.println(compteur + " est un multiple de 10. Son addition avec le nombre précédent vaut : " + (2 * compteur +1));
                System.out.println("Mais il est aussi pair donc son addition avec le prochain nombre pair est " + (2 * compteur - 2) + "\n");
            }
            
            //  Traitement des nombres pairs
            else if(compteur%2 == 0){
                int affichage = compteur + compteur - 2;
                System.out.println("Le nombre " + compteur + " est pair et son addition avec le prochain nombre pair est " + (2 * compteur - 2) + "\n");
            }
            
            //  Traitement des nombres multiples de trois et cinq
            else if(compteur%3 == 0 && compteur%5 == 0){
                System.out.println("le nombre " + compteur + " est un multiple de 3 et de 5 à la fois" + "\n");
            }
            
            //  Traitement de tous les autres nombres
            else{
                System.out.println("Le nombre est " + compteur + "\n");
            }
        }
    }
    
}
