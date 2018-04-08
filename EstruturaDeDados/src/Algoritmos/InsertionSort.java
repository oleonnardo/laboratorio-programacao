/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Classes.Funcoes;
import java.math.BigDecimal;

/**
 *
 * @author Leonardo
 */
public class InsertionSort {

         public static void run(int[] vetor) {
                  long inicio = System.nanoTime();
                  insertionsort(vetor);
                  long fim = System.nanoTime();
                  long tempo = fim - inicio;
                  double t = (double) tempo / 1000000000.0;
                  BigDecimal te = new BigDecimal(t).setScale(10, BigDecimal.ROUND_CEILING);
                  Funcoes.print(inicio, fim, te, "*** Insertion Sort ***", vetor.length);
         }

         private static void insertionsort(int a[]) {
                  for (int i = 1; i < a.length; i++) {
                           int val = a[i];
                           int hole = i;
                           while (hole > 0 && a[hole - 1] > val) {
                                    a[hole] = a[hole - 1];
                                    hole = hole - 1;
                           }
                           a[hole] = val;
                  }
         }
}
