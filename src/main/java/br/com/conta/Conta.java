package br.com.conta;

public class Conta {
    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacar(double valor){
        if (valor < 0 ){
            System.out.println("Valor deve ser maior do que zero!");
        } else if (saldo >= valor) {
            System.out.println("Saque realizado realizado. Saldo atual: " + saldo);
        }else {
            System.out.println("Saldo insufuciente");
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Dépósito realizado com sucesso. Saldo atual: " + saldo);
        }else {
            System.out.println("Valor deve ser maior que zero!");
        }

    }
}
