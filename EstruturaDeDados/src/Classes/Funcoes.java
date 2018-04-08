package Classes;

import java.util.Random;
import java.lang.Integer;
import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo
 */
public class Funcoes {

         /**
          *
          * @param size = Tamanho do Vetor
          * @return
          */
         public static int[] generateVetor(int size) {
                  int[] vetor = new int[size];
                  for (int i = 0; i < size; i++) {
                           vetor[i] = randomNumber(999, 1);;
                  }
                  return vetor;
         }

         /**
          *
          * @param max = valor máximo
          * @param min = valor mínimo
          * @return
          */
         public static int randomNumber(int max, int min) {
                  Random rand = new Random();
                  int num = rand.nextInt((max - min) + 1) + min;
                  return num;
         }

         /**
          *
          * @param initialtime
          * @param finaltime
          * @param time
          * @param algoritmo
          * @param tamanho
          */
         public static void print(long initialtime, long finaltime, BigDecimal time, String algoritmo, int tamanho) {
                  System.out.println(algoritmo);
                  System.out.println("Tamanho da Entrada: "+tamanho);
                  System.out.println(": {\n   Tempo Inicial (ns): " + initialtime);
                  System.out.println("   Tempo Final (ns): " + finaltime);
                  System.out.println("   Delta Tempo (s): " + time + "\n}\n");
         }

}
