/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosmatriz;
 import java.util.Scanner;
/**
 *
 * @author Plugify
 */
public class ExerciciosMatriz {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // CHAME O EXERCÍCIO QUE QUISER RODAR AQUI:
       
        //exercicio1();
        //exercicio2A();
        // exercicio2B();
        // exercicio2C();
        exercicio3();
        // exercicio4();
        // exercicio5();
        // exercicio6A();
        // exercicio6B();
        // exercicio6C();

    }

    // ---------------------------------------------------------
    // 1) Ler matriz 4x4, somar pares e calcular média
    // ---------------------------------------------------------
    public static void exercicio1() {
        int[][] mat = new int[4][4];
        int somaPares = 0;
        int somaTotal = 0;
        int contTotal = 0;

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
                somaTotal += mat[i][j];
                contTotal++;

                if (mat[i][j] % 2 == 0) {
                    somaPares += mat[i][j];
                }
            }
        }

        double media = (double) somaTotal / contTotal;

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Média dos números digitados: " + media);
    }

    // ---------------------------------------------------------
    // 2A) Exibir matriz de caracteres
    // ---------------------------------------------------------
    public static void exercicio2A() {
        char[][] m = {
                {'a','b','c','d'},
                {'e','f','g','h'},
                {'i','j','k','l'},
                {'m','n','o','p'}
        };

        imprimeChar(m);
    }

    // ---------------------------------------------------------
    // 2B) Exibir matriz de inteiros
    // ---------------------------------------------------------
    public static void exercicio2B() {
        int[][] m = {
                {19, 25, 100, 90},
                {10, 7, 25, 14},
                {33, 2, 47, 74}
        };

        imprimeInt(m);
    }

    // ---------------------------------------------------------
    // 2C) Exibir matriz de decimais
    // ---------------------------------------------------------
    public static void exercicio2C() {
        double[][] m = {
                {1.9, 2.5, 10.0},
                {1.0, 7.5, 2.5},
                {3.5, 2.2, 4.7}
        };

        imprimeDouble(m);
    }

    // ---------------------------------------------------------
    // 3) Preencher 5x5 e somar ímpares, colunas e linhas
    // ---------------------------------------------------------
    public static void exercicio3() {
        int[][] mat = new int[5][5];
        int somaImpares = 0;

        System.out.println("Digite uma matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] % 2 != 0) somaImpares += mat[i][j];
            }
        }

        System.out.println("\nSoma dos ímpares: " + somaImpares);

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaCol = 0;
            for (int i = 0; i < 5; i++) somaCol += mat[i][j];
            System.out.println("Coluna " + j + ": " + somaCol);
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLin = 0;
            for (int j = 0; j < 5; j++) somaLin += mat[i][j];
            System.out.println("Linha " + i + ": " + somaLin);
        }
    }

    // ---------------------------------------------------------
    // 4) Matriz 3x5 e contar repetidos, pares e ímpares
    // ---------------------------------------------------------
    public static void exercicio4() {
        int[][] m = new int[3][5];

        System.out.println("Digite uma matriz 3x5:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                m[i][j] = sc.nextInt();

        int pares = 0, impares = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] % 2 == 0) pares++;
                else impares++;
            }
        }

        // verificar repetidos
        boolean repetidos = false;

        for (int i = 0; i < 15; i++)
            for (int j = i+1; j < 15; j++)
                if (valor(m, i) == valor(m, j)) repetidos = true;

        System.out.println("Possui repetidos? " + (repetidos ? "Sim" : "Não"));
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }

    // converter índice linear para valor da matriz
    private static int valor(int[][] m, int k) {
        int linha = k / 5;
        int col = k % 5;
        return m[linha][col];
    }

    // ---------------------------------------------------------
    // 5) Matriz 4x4 decimais – diagonais
    // ---------------------------------------------------------
    public static void exercicio5() {
        double[][] m = new double[4][4];

        System.out.println("Digite uma matriz 4x4:");

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                m[i][j] = sc.nextDouble();

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++)
            System.out.print(m[i][i] + " ");

        System.out.println("\n\nDiagonal secundária:");
        for (int i = 0; i < 4; i++)
            System.out.print(m[i][3 - i] + " ");
    }

    // ---------------------------------------------------------
    // 6) Figuras usando matrizes
    // ---------------------------------------------------------
    public static void exercicio6A() {
        int[][] m = {
                {1,0,1,0,1},
                {0,1,0,1,0},
                {1,0,1,0,1}
        };
        imprimeInt(m);
    }

    public static void exercicio6B() {
        int[][] m = {
                {1,1,1,1},
                {1,0,0,1},
                {1,1,1,1}
        };
        imprimeInt(m);
    }

    public static void exercicio6C() {
        int[][] m = {
                {1,0,0,0},
                {1,1,0,0},
                {1,1,1,0},
                {1,1,1,1}
        };
        imprimeInt(m);
    }

    // ---------------------------------------------------------
    // FUNÇÕES AUXILIARES PARA IMPRESSÃO
    // ---------------------------------------------------------
    public static void imprimeInt(int[][] m) {
        for (int[] linha : m) {
            for (int v : linha) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void imprimeDouble(double[][] m) {
        for (double[] linha : m) {
            for (double v : linha) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void imprimeChar(char[][] m) {
        for (char[] linha : m) {
            for (char c : linha) System.out.print(c + " ");
            System.out.println();
        }
    }
}
    

