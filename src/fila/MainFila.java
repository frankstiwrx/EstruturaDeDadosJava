/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fila;

/**
 *
 * @author frank
 */
import java.util.Scanner;

public class MainFila {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Fila minhaFila = new Fila(5);

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE FILA =====");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Remover elemento");
            System.out.println("3 - Consultar primeiro elemento");
            System.out.println("4 - Mostrar fila");
            System.out.println("5 - Consultar tamanho");
            System.out.println("6 - Verificar se esta vazia");
            System.out.println("7 - Verificar se esta cheia");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    int valor = entrada.nextInt();

                    if (minhaFila.enfileirar(valor)) {
                        System.out.println("Elemento inserido!");
                    } else {
                        System.out.println("Fila cheia!");
                    }
                    break;

                case 2:
                    if (minhaFila.estaVazia()) {
                        System.out.println("A fila esta vazia!");
                    } else {
                        System.out.println(
                            "Removido: " + minhaFila.desenfileirar()
                        );
                    }
                    break;

                case 3:
                    if (minhaFila.estaVazia()) {
                        System.out.println("A fila esta vazia!");
                    } else {
                        System.out.println(
                            "Primeiro elemento: "
                            + minhaFila.consultarInicio()
                        );
                    }
                    break;

                case 4:
                    minhaFila.mostrarFila();
                    break;

                case 5:
                    System.out.println(
                        "Quantidade: " + minhaFila.consultarTamanho()
                    );
                    break;

                case 6:
                    System.out.println(
                        minhaFila.estaVazia()
                        ? "A fila esta vazia."
                        : "A fila nao esta vazia."
                    );
                    break;

                case 7:
                    System.out.println(
                        minhaFila.estaCheia()
                        ? "A fila esta cheia."
                        : "A fila nao esta cheia."
                    );
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}