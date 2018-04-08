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
public class SelectionSort {

         public static void run(int[] vetor) {
                  long inicio = System.nanoTime();
                  selectionsort(vetor);
                  long fim = System.nanoTime();
                  long tempo = fim - inicio;
                  double t = (double) tempo / 1000000000.0;
                  BigDecimal te = new BigDecimal(t).setScale(10, BigDecimal.ROUND_CEILING);
                  Funcoes.print(inicio, fim, te, "*** Selection Sort ***", vetor.length);
         }
         
         private static void selectionsort(int[] a) {
                  for (int i = 0; i < a.length - 1; i++) {
                           int imin = i;
                           int temp;
                           for (int j = i + 1; j < a.length; j++) {
                                    if (a[j] < a[imin]) {
                                             imin = j;
                                    }
                           }
                           temp = a[i];
                           a[i] = a[imin];
                           a[imin] = temp;
                  }
         }
         

}
