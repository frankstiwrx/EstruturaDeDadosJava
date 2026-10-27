/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila;

/**
 *
 * @author frank
 */
public class Fila {

    private int[] dados;
    private int tamanho;

    // Construtor
    public Fila(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException(
                "A capacidade deve ser maior que zero."
            );
        }

        dados = new int[capacidade];
        tamanho = 0;
    }

    // Inserir elemento no final da fila
    public boolean enfileirar(int valor) {
        if (estaCheia()) {
            return false;
        }

        dados[tamanho] = valor;
        tamanho++;

        return true;
    }

    // Remover o primeiro elemento da fila
    public int desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }

        int removido = dados[0];

        for (int i = 0; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }

        tamanho--;

        return removido;
    }

    // Consultar o primeiro elemento sem removê-lo
    public int consultarInicio() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }

        return dados[0];
    }

    // Verificar se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Verificar se a fila está cheia
    public boolean estaCheia() {
        return tamanho == dados.length;
    }

    // Consultar a quantidade de elementos
    public int consultarTamanho() {
        return tamanho;
    }

    // Mostrar os elementos da fila
    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.print("Frente -> ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[i] + " ");
        }

        System.out.println("<- Final");
    }
}
