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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, int digito, double saldo){
        super(agencia,numero,digito,saldo);
    }
    
    @Override
    public void saldo() {
        System.out.println("Conta Poupança" +
                "\nAgência: " + agencia + 
                "\nNúmero: " + numero + 
                "\nDigito: " + digito + 
                "\nSaldo: R$ " + saldo + "\n");
    }
    
    public void rendimento(double perc) {
        this.saldo = (this.saldo * (perc / 100)) + this.saldo;
    }
    
}
