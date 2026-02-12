package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {

    /**
     * Calcule la somme des nombres de 1 à n
     * 
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

    }

    /**
     * Inverse un nombre (ex: 123 -> 321)
     * 
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int nbr) {
        int reversed = 0;
        while (nbr != 0) {
            reversed = reversed * 10 + nbr % 10;
            nbr = nbr / 10;
        }
        return reversed;
    }

    /**
     * Calcule la factorielle d'un nombre (n!)
     * 
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

    /**
     * Compte le nombre de chiffres dans un nombre
     * 
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    /**
     * Vérifie si un nombre est premier
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {
   for (int i = 2; i < (number); i++) {
                if (number % i == 0) {
                    return false;

    }
}
return number>1;
}
}
