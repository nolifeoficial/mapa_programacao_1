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
public class ContaCorrente extends Conta {
    private double limite;
    
    public void ContaCorrente() {
    
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void saque(double saque) {
        double limitetotal = this.limite + this.saldo;
        if (limitetotal >= saque) {
        limitetotal = limitetotal - saque;
            System.out.println("Você realizou com sucesso um saque de: R$ " + saque +
                    "\nSeu limite restante é de: R$ " + limitetotal + "\n");
        } else {
            System.out.println("Você não possui limite suficiente para realizar esse saque!"
                + "\nSeu saque disponível é de: R$ " + limitetotal + "\n");
        }
    }
    
    @Override
    public void saldo() {
        System.out.println("Conta Corrente" +
                "\nAgência: " + agencia + 
                "\nNúmero: " + numero + 
                "\nDigito: " + digito + 
                "\nSaldo: R$ " + saldo +
                "\nLimite: R$ " + limite + "\n");
    }
    

    public void transferencia(double valor, ContaCorrente cc1) {
        double limitetotal = this.limite + this.saldo;
        if(valor <= limitetotal) {
            this.setSaldo(limitetotal - valor); 
            cc1.setSaldo(limitetotal + valor); 
            System.out.println("Tranferência realizada com sucesso!");
            System.out.println("Valor transferido: R$ "+ valor);
            System.out.println("Seu saldo atual: R$ "+ this.getSaldo() + "\n");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
            System.out.println("Valor solicitado de: R$ " + valor);
            System.out.println("Seu saldo atual: R$ " + limitetotal + "\n");
        }
    }
}
