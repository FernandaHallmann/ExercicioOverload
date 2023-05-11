package com.mycompany.exerciciooverload;

/**
 *
 * @author Ferna
 */
public class ExercicioOverload {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(2, 5));
        
        System.out.println(calc.somar(2.8, 6.5));
        
        int[] vetor = {3, 8, 1, 6, 7, 4, 9};
        System.out.println(calc.somar(vetor));
    }
}
