package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un tableau
 */
public class Exercise07ArraysSumAverage {
    
    /**
     * Calcule la somme de tous les éléments d'un tableau
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {
       int somme = 0;
       for (int i : array){
        somme = somme + i;
       }
       return somme;}
    
    /**
     * Calcule la moyenne des éléments d'un tableau
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++){
            total = total + array[i];
        }
    double moyenne = total / array.length;
    return moyenne ;}
    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
     double average = average(array);
     int count = 0;
     for (int i = 0; i < array.length; i++ ){
        if ( array[i]> average){
            count++;
        }
     }
     return count;
    } 
    
    
    /**
     * Calcule la somme des nombres pairs dans un tableau
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
       
        int number = 0;
       for (int i = 0; i < array.length; i++){
        if ( array[i] % 2 == 0){
           number += array[i];
        }
       }
       return number;

    }
    
    /**
     * Calcule le produit de tous les éléments d'un tableau
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {
       int product = 1;
       for (int i=0; i < array.length; i++){
        product *= array[i];
       }
       return product;
    }
}

