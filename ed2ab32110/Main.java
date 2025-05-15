/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed2ab32110;

/**
 *
 * @author maicon cezar
 */
public class Main {
    public static void main(String[] args) {
        // 14, 18, 4, 9, 7, 15, 3, 5, 17, 20
        ArvoreBinaria ab = new ArvoreBinaria();
        ab.inserir(14);
        ab.inserir(18);
        ab.inserir(4);
        ab.inserir(9);
        ab.inserir(7);
        ab.inserir(15);
        ab.inserir(3);
        ab.inserir(5);
        ab.inserir(17);
        ab.inserir(20);
        System.out.println("---------------------------");
        System.out.println("Mostrar em Ordem: ");
        ab.mostrarEmOrdem();


        System.out.println("\n---------------------------");
        System.out.println("Mostrar em Ordem Recursivo: ");
        ab.mostrarEmOrdemRecursivo(ab.getRaiz());
        ab.resetarVisitados(ab.getRaiz());


        System.out.println("\n---------------------------");
        System.out.println("Mostrar em Pré Ordem: ");
        ab.mostrarPreOrdem();
        ab.resetarVisitados(ab.getRaiz());


        System.out.println("\n---------------------------");
        System.out.println("Mostrar em Pré Ordem Recursivo: ");
        ab.mostrarPreOrdemRecursivo(ab.getRaiz());



        System.out.println("\n---------------------------");
        System.out.println("Mostrar em Pós Ordem: ");
        ab.mostrarPosOrdem();
        ab.resetarVisitados(ab.getRaiz());
        System.out.println("\n---------------------------");


        System.out.println("Mostrar em Pós Ordem Recursiva: ");
        ab.mostrarPosOrdemRecursivo(ab.getRaiz());
        System.out.println("\n---------------------------");

        System.out.println("Maior valor: ");
        ab.getMaiorValor(ab.getRaiz());
        System.out.println("---------------------------");

        System.out.println("Menor valor: ");
        ab.getMenorValor(ab.getRaiz());
        System.out.println("---------------------------");

        System.out.println("Predecessor: ");
        ab.getPredecessor(ab.getRaiz());
        System.out.println("---------------------------");

        System.out.println("Sucessor: ");
        ab.getSucessor(ab.getRaiz());
        System.out.println("---------------------------");
    }
}
