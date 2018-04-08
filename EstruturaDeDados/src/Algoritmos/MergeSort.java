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
public class MergeSort {

         public static void run(int[] vetor) {
                  long inicio = System.nanoTime();
                  mergesort(vetor, vetor.length);
                  long fim = System.nanoTime();
                  long tempo = fim - inicio;
                  double t = (double) tempo / 1000000000.0;
                  BigDecimal te = new BigDecimal(t).setScale(10, BigDecimal.ROUND_CEILING);
                  Funcoes.print(inicio, fim, te, "*** Merge Sort ***", vetor.length);
         }

         private static void mergesort(int a[], int n) {
                  if (n <= 1) {
                           return;
                  }
                  int mid = n / 2;
                  int left[] = new int[mid];
                  int right[] = new int[n - mid];
                  for (int i = 0; i < mid; i++) {
                           left[i] = a[i];
                  }
                  for (int i = mid; i < n; i++) {
                           right[i - mid] = a[i];
                  }
                  mergesort(left, mid);
                  mergesort(right, n - mid);
                  merge(left, right, a);

         }

         private static void merge(int left[], int right[], int a[]) {
                  int nL = left.length;
                  int nR = right.length;
                  int i, j, k;
                  i = j = k = 0;
                  while (i < nL && j < nR) {
                           if (left[i] <= right[j]) {
                                    a[k] = left[i];
                                    i++;
                                    k++;
                           } else {
                                    a[k] = right[j];
                                    j++;
                                    k++;
                           }
                  }
                  while (i < nL) {
                           a[k] = left[i];
                           i++;
                           k++;
                  }
                  while (j < nR) {
                           a[k] = right[j];
                           j++;
                           k++;
                  }
         }

}
