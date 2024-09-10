package com.deusley.desafio_snail;

import java.util.ArrayList;
import java.util.List;

public class Snail {


        public static List<Integer> snail(int[][] matrix) {
            List<Integer> result = new ArrayList<>();

            if (matrix.length == 0 || matrix[0].length == 0) {
                return result;
            }

            int top = 0, bottom = matrix.length - 1;
            int left = 0, right = matrix[0].length - 1;

            while (top <= bottom && left <= right) {
                                                               // Percorrer a linha superior,esquerda para a direita
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;

                                                               // Percorrer a coluna direita, de cima para baixo
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;

                if (top <= bottom) {
                                                              // Percorrer a linha inferior, da direita para a esquerda
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                if (left <= right) {
                                                                   // Percorrer a coluna esquerda, de baixo para cima
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrix2 = {
                    {1, 2, 3},
                    {4, 10, 12},
                    {6, 7, 33}
            };

           // execução da saída esperada 1 : [1, 2, 3, 6, 9, 8, 7, 4, 5]

            System.out.println(snail(matrix1));

            // execução da saída esperada 2 : [1, 2, 3, 12, 33, 7, 6, 4, 10]

            System.out.println(snail(matrix2));
        }
    }
