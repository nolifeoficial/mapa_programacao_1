/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaixaEletronico;

/**
 *
 * @author alexg
 */
public class Conta {
    protected int agencia;
    protected int numero;
    protected int digito;
    protected double saldo;
    
    public Conta() {
        
    }

    public Conta(int agencia, int numero, int digito, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void saldo() {
        System.out.println("Agência: " + this.agencia + 
                "\nNúmero: " + this.numero + 
                "\nDigito: " + this.digito + 
                "\nSaldo: R$ " + this.saldo + "\n");
    }
    
    public void saque(double saque) {
        if (saldo > saque) {
            this.saldo = this.saldo - saque;
            System.out.println("Você realizou com sucesso um saque de: R$ " + saque +
                    "\nSeu saldo restante é de: R$ " + this.saldo + "\n");
        } else {
            System.out.println("Você solicitou um saque no valor de R$ " + saque + 
                    " ,mas não possui saldo suficiente!"
                    + "\nSeu saldo disponível é de: R$ " + this.saldo + "\n");
        }
    }
    
    public void deposito(double deposito) {
        this.saldo = this.saldo + deposito;
        System.out.println("Seu depósito foi efetuado com sucesso. \n"
                + "Seu novo saldo é de: R$ " + this.saldo + "\n");
    }
    
    public void transferencia(double valor, ContaPoupanca cp1) {
        if(valor <= saldo) {
            this.setSaldo(saldo - valor); 
            cp1.setSaldo(cp1.getSaldo() + valor); 
            System.out.println("Tranferência realizada com sucesso!");
            System.out.println("Valor transferido: R$ "+ valor);
            System.out.println("Seu saldo atual: R$ "+ this.getSaldo() + "\n");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
            System.out.println("Valor solicitado de: R$ " + valor);
            System.out.println("Seu saldo atual: R$ " + this.getSaldo() + "\n");
        }
    }
    
}