/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Classes.Funcoes;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Leonardo
 */
public class BubbleSort {

         public static void run(int[] vetor) {
                  long inicio = System.nanoTime();
                  bubblesort(vetor);
                  long fim = System.nanoTime();
                  long tempo = fim - inicio;
                  double t = (double) tempo / 1000000000.0;
                  BigDecimal te = new BigDecimal(t).setScale(10, BigDecimal.ROUND_CEILING);
                  Funcoes.print(inicio, fim, te, "*** Bubble Sort ***", vetor.length);
         }

         private static void bubblesort(int[] a) {
                  for (int i = 0; i < a.length - 1; i++) {
                           for (int j = 0; j < a.length - i - 1; j++) {
                                    if (a[j] > a[j + 1]) {
                                             a = swap(a, j, j + 1);
                                    }
                           }
                  }
         }

         private static int[] swap(int[] a, int i, int j) {
                  int temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                  return a;
         }

}
