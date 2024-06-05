package main;

import java.util.Scanner;

public class GeraEtiqueta {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Cd. da Unidade: ");
        int unid = entrada.nextInt();

        System.out.println("Digite o ano corrente: ");
        int ano = entrada.nextInt();

        System.out.println("AIH Inicial: ");
        long esquerda = entrada.nextLong();
        System.out.println("Digito: ");
        int direita = entrada.nextInt();

        Etiqueta etq1 = new Etiqueta(unid, ano, esquerda, direita);

        Scanner entrada2 = new Scanner(System.in);


        System.out.println("AIH Final: ");
        long esquerda2 = entrada.nextLong();
        System.out.println("Digito: ");
        int direita2 = entrada.nextInt();

        Etiqueta etq2 = new Etiqueta(unid, ano, esquerda2, direita2);


        System.out.println(etq1.toString(unid + ano + esquerda + direita));
        System.out.println(etq2.toString(unid + ano + esquerda2 + direita2));


        entrada.close();
        entrada2.close();


    }
}
