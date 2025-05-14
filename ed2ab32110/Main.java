/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed2ab32110;

/**
 *
 * @author renato
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
        System.out.println("");
        ab.mostrarRecursivo(ab.getRaiz());
    }
}
