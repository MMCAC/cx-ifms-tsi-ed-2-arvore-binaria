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

    public void resetarVisitados(No no){
        if(no != null){
            no.setVisitado(false);
            resetarVisitados(no.getEsq());
            resetarVisitados(no.getDir());
        }
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
    
    public void mostrarEmOrdem() { // percurso in-order - em ordem
        if(raiz == null) {
            System.out.println("Árvore Vazia");
        }
        else {
            No aux = raiz;
            while(aux != null) {
                if(aux.getEsq() != null && !aux.getEsq().isVisitado()) {
                    aux = aux.getEsq();
                }
                else if(!aux.isVisitado()) {
                    System.out.println(aux.getValor());
                    aux.setVisitado(true);
                }
                else if(aux.getDir() != null && !aux.getDir().isVisitado()) {
                    aux = aux.getDir();
                }
                else {
                    aux = aux.getPai();
                }
            }
        }
    }
    
    public void mostrarEmOrdemRecursivo(No no) {
        if(no != null) {
            mostrarEmOrdemRecursivo(no.getEsq());
            System.out.println(no.getValor());
            mostrarEmOrdemRecursivo(no.getDir());
        }
    }

    public void mostrarPreOrdem() {
        if(raiz == null) {
            System.out.println("Árvore Vazia");
        }
        else {
            No aux = raiz;
            while (aux != null){
                if(!aux.isVisitado()){
                    System.out.println(aux.getValor());
                    aux.setVisitado(true);
                } else if(aux.getEsq() != null && !aux.getEsq().isVisitado()){
                    aux = aux.getEsq();
                } else if(aux.getDir() != null && !aux.getDir().isVisitado()){
                    aux = aux.getDir();
                } else {
                    aux = aux.getPai();
                }
            }
        }
    }

    public void mostrarPreOrdemRecursivo(No no){
        if(no != null){
            System.out.println(no.getValor());
            mostrarPreOrdemRecursivo(no.getEsq());
            mostrarPreOrdemRecursivo(no.getDir());
        }
    }

    public void mostrarPosOrdem() {
        if(raiz == null){
            System.out.println("Árvore Vazia");
        } else {
            No aux = raiz;
            while(aux != null){
                if(aux.getEsq() != null && !aux.getEsq().isVisitado()){
                    aux = aux.getEsq();
                } else if(aux.getDir() != null && !aux.getDir().isVisitado()){
                    aux = aux.getDir();
                } else if(aux.isVisitado() == false){
                    System.out.println(aux.getValor());
                    aux.setVisitado(true);
                } else {
                    aux = aux.getPai();
                }
            }
        }
    }

    public void mostrarPosOrdemRecursivo(No no){
        if(no != null){
            mostrarPosOrdemRecursivo(no.getEsq());
            mostrarPosOrdemRecursivo(no.getDir());
            System.out.println(no.getValor());
        }
    }
}
