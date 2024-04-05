package br.lawtrel;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    static int qtdContas = 0;

    public Conta(String pTitular) {
        this.titular = pTitular;
        qtdContas++;
        this.numero = qtdContas;
        this.saldo = 0;
    }

    public void DadosBancarios() {
        System.out.println("");
        System.out.println("--Dados Bancarios--");
        System.out.println("--Número" + this.numero);
        System.out.println("--Titular: " + this.titular);
        System.out.println("- Saldo: " + this.saldo);
        System.out.println("");
    }

    public void Depositar(double pValor) {
        System.out.println("--Realizando Deposito--");
        System.out.println("--Saldo Anterior: " + this.saldo);

        this.saldo += pValor;

        System.out.println("- Saldo Anterior:" + this.saldo);
        System.out.println("--Fim do Depósito--");
        System.out.println("");
    }

    public void Sacar(double pValor) {
        if (pValor <= this.saldo) {
            this.saldo -= pValor;
            System.out.println("- Saldo Posterior: "+ this.saldo);
        } else {
            System.out.println("- Saldo Insuficiente");
        }
    }
}
