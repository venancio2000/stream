package br.com.conta;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do titular: ");
        String nome = leitura.next();
        conta.setTitular(nome);

        System.out.println("Digite o valor do depositor");
        double valor = leitura.nextDouble();
        conta.depositar(valor);
    }
}
