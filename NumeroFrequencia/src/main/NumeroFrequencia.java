package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumeroFrequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> frequencia = new HashMap<>();

        // Inicializar o mapa de frequências com números de 1 a 25
        for (int i = 1; i <= 25; i++) {
            frequencia.put(i, 0);
        }

        System.out.println("Por favor, insira 10 sequências de 15 números (valores entre 1 e 25):");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a sequência " + i + " (15 números separados por espaço):");
            for (int j = 0; j < 15; j++) {
                int numero = scanner.nextInt();

                // Verificar se o número está no intervalo válido
                if (numero < 1 || numero > 25) {
                    System.out.println("Número inválido: " + numero + ". Por favor, insira números entre 1 e 25.");
                    j--; // Repetir a leitura deste número
                    continue;
                }

                // Atualizar a frequência do número
                frequencia.put(numero, frequencia.get(numero) + 1);
            }
        }

        // Exibir o resultado
        System.out.println("Frequência dos números:");
        for (int i = 1; i <= 25; i++) {
            System.out.println("Número " + i + ": " + frequencia.get(i) + " vez(es)");
        }

        scanner.close();
    }
}

