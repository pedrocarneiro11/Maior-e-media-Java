package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, vezes, contador = 1, maior = 0, soma = 0, media;

        do {
            System.out.println("Digite o numero de vezes: ");
            vezes = scan.nextInt();
        } while (vezes < contador);

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            media = soma / contador;

            if (numero > maior) {
                maior = numero;
            }

            contador = contador + 1;
        } while(contador<=vezes);
        System.out.println("Maior numero: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
