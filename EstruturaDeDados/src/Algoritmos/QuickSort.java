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
public class QuickSort {

         public static void run(int[] vetor) {
                  long inicio = System.nanoTime();
                  quicksort(vetor, 0, vetor.length);
                  long fim = System.nanoTime();
                  long tempo = fim - inicio;
                  double t = (double) tempo / 1000000000.0;
                  BigDecimal te = new BigDecimal(t).setScale(10, BigDecimal.ROUND_CEILING);
                  Funcoes.print(inicio, fim, te, "*** Quick Sort ***", vetor.length);
         }

         private static void quicksort(int a[], int start, int end) {
                  if (start < end) {
                           int pIndex = quickpartition(a, start, end);
                           quicksort(a, start, pIndex - 1);
                           quicksort(a, pIndex + 1, end);
                  } else {
                           return;
                  }
         }

         private static int quickpartition(int a[], int start, int end) {
                  int temp;
                  int pivot = a[end];
                  int pIndex = start;
                  for (int i = start; i < end; i++) {
                           if (a[i] <= pivot) {
                                    temp = a[i];
                                    a[i] = a[pIndex];
                                    a[pIndex] = temp;
                                    pIndex++;
                           }
                  }
                  temp = a[pIndex];
                  a[pIndex] = a[end];
                  a[end] = temp;
                  return pIndex;
         }

}
