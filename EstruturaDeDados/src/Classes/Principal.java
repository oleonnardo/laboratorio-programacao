/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Algoritmos.MergeSort;
import Algoritmos.BubbleSort;
import Algoritmos.InsertionSort;
import Algoritmos.SelectionSort;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Leonardo
 */
public class Principal {

         /**
          * @param args the command line arguments
          */
         public static void main(String[] args) {
                  int[] um = Funcoes.generateVetor(1);
                  int[] dez = Funcoes.generateVetor(10);
                  int[] vinte = Funcoes.generateVetor(20);
                  int[] trinta = Funcoes.generateVetor(30);
                  int[] quarenta = Funcoes.generateVetor(40);                  
                  
                  BubbleSort.run(um);
                  BubbleSort.run(dez);
                  BubbleSort.run(vinte);
                  BubbleSort.run(trinta);
                  BubbleSort.run(quarenta);
                  
                  SelectionSort.run(um);
                  SelectionSort.run(dez);
                  SelectionSort.run(vinte);
                  SelectionSort.run(trinta);
                  SelectionSort.run(quarenta);
                  
                  InsertionSort.run(um);
                  InsertionSort.run(dez);
                  InsertionSort.run(vinte);
                  InsertionSort.run(trinta);
                  InsertionSort.run(quarenta);
                  
                  MergeSort.run(um);
                  MergeSort.run(dez);
                  MergeSort.run(vinte);
                  MergeSort.run(trinta);
                  MergeSort.run(quarenta);
         }

}
