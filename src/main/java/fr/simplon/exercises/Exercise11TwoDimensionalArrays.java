package fr.simplon.exercises;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    /**
     * Crée une matrice remplie de zéros
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {
    int [][] result = new int[rows][cols];
        int [][] matrix = new int [rows][cols];
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < cols; k++) {
                        result[i][k] = 0;
                    }
                    for (int k = 0; k < rows; k++) {
                        result[k][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = result[i][j];
            }
        } return result;
    }

    
    /**
     * Calcule la somme de tous les éléments d'une matrice
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {
       int sum =0;
       for ( int i = 0; i < matrix.length; i++){
        for(int j =0 ; j< matrix[0].length; j++){
            sum += matrix[i][j];
        }
       } return sum;
       }

    
    /**
     * Trouve le maximum dans une matrice
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {
        int max =matrix[1][1];
      
        for (int i=0; i < matrix.length; i++ ){
            for (int j =0; j< matrix[0].length; j++){
			
                if (matrix[i][j] > max)
				max = matrix[i][j];
		}}
        return max;
    }

    
    
    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
       int[][] b  = new int [matrix[0].length][matrix.length] ;
       for (int i =0; i< b.length; i++){
        for (int j=0; j< b[i].length;j++){
                b[i][j]= matrix[j][i];
            }
        }return b;
       } 
        
            
    
    
    /**
     * Retourne la diagonale principale d'une matrice carrée
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {
     int[] diagonal = new int[matrix.length];
         for (int i = 0; i < matrix.length; i++) {
             diagonal[i] = matrix[i][i]; 
            } 
            return diagonal;
    }}
    

