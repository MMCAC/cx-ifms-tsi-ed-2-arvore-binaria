/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed2ab32110;

/**
 *
 * @author renato
 */
public class ArvoreBinaria {
    private No raiz;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    
    public void inserir(int valor) {
        No novo = new No(valor);
        if(raiz == null) {
            raiz = novo;
        }
        else {
            No aux = raiz;
            do {
                if(novo.getValor() <= aux.getValor()) { // entra à esquerda
                    if(aux.getEsq() == null) { // não tem filho à esquerda
                        aux.setEsq(novo); // adiciona o novo nó como filho da esquerda
                        novo.setPai(aux); // adiciona aux como pai do novo nó
                    }
                    else {
                        aux = aux.getEsq(); // caminha para o filho da esquerda
                    }
                }
                else { // entra à direita
                    if(aux.getDir() == null) { // não tem filho à direita
                        aux.setDir(novo); // adiciona o novo nó como filho da direita
                        novo.setPai(aux); // adiciona aux como pai do novo nó
                    }
                    else {
                        aux = aux.getDir(); // caminha para o filho da direita
                    }
                }
            } while(novo.getPai() == null);
        }
    }
    
    public void mostrar() { // percurso in-order - em ordem
        
    }
}
