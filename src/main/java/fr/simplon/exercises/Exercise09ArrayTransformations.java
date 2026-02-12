package fr.simplon.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux
 * existants
 */
public class Exercise09ArrayTransformations {

    /**
     * Double tous les éléments d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;
        }
        return result;

    }

    /**
     * Filtre les nombres pairs d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int[] tabPairs = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                tabPairs[count++] = array[i];

            }
        }
        int[] tabResult = new int[count];
        for (int i = 0; i < count; i++) {
            tabResult[i] = tabPairs[i];
        }
        return tabResult;
    }

    /**
     * Copie un tableau dans l'ordre inverse
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {
        int[] tab = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tab[i] = array[array.length - 1 - i];
        }
        return tab;

    }

    /**
     * Concatène deux tableaux
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis
     *         ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
       int len = array1.length + array2.length; 
    int[] res = new int[len];  
    int pos = 0;
    for (int i : array1) 
    {
      res[pos] = i;
      pos++;        
    }
    for (int i : array2) 
    {
      res[pos] = i;
      pos++;
    }
    return res; 
}

    /**
     * Extrait une sous-partie d'un tableau
     * 
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end   l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
       int[] tab = new int[array.length];
        int count = 0;
        for (int i = start; i < end; i++) {
            tab[count++]= array[i];
        }
        int[] tabResult = new int[count];
        for (int i = 0; i < count; i++) {
            tabResult[i] = tab[i];
        }
        return tabResult;
    }
}
