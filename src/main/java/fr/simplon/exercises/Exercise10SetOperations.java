package fr.simplon.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union, intersection, différence)
 */
public class Exercise10SetOperations {
    
    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
      boolean b = false;
      for (int i : array){
        if(i == value){
            b = true;
        }
      } return b;

    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {
        Set <Integer> set = new HashSet<>();
        for (int i : array1) { 
            set.add(i); 
        } 
        for (int n : array2) {
             set.add(n); 
            } 
            int[] result = new int[set.size()];
             int count = 0; for (int n : set) {
                 result[count++] = n; 
                }
                  return result;
            }
    

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {
  int[] tab = new int[array1.length];
  int count =0;
        for (int i : array1){
            if(contains(array2, i)){
                tab[count++]=i;
            }
        }return Arrays.copyOf(tab, count);
    }
    
    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
       Set <Integer> set = new HashSet<>();
        for (int i : array1) { 
            set.add(i); 
        } 
        for (int n : array2) {
             set.remove(n); 
            } 
            int[] result = new int[set.size()];
             int count = 0; for (int n : set) {
                 result[count++] = n; 
                }
                  return result;
            }
    
    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        int[] union= union(array1, array2);
        int[] intersection = intersection(array1, array2);
           return difference(union, intersection);
            }  




    
    
    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {
        for (int i : array1){
            if(!contains(array2, i)){
                return false;
            }
        } return true;

    }
    
    /**
     * Supprime les doublons d'un tableau
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        int[] tab = new int[array.length];
  int count =0;
        for (int i : array){
            if(seen.add(i)){
                tab[count++]=i;
            }
        }return Arrays.copyOf(tab, count);
   
    }
    
    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
       int[] tab = new int[array.length];
  int count =0;
        for (int i : array){
            if(contains(tab, i)){
               continue;
            }
             tab[count++]=i;
        }return count ;
    }
}
