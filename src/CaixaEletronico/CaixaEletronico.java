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
public class CaixaEletronico {
    
    public static void main(String[] args) {        
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        
        cp1.setAgencia(8850);
        cp1.setNumero(58406);
        cp1.setDigito(5);
        cp1.setSaldo(850);
        
        cp2.setAgencia(8850);
        cp2.setNumero(58407);
        cp2.setDigito(6);
        cp2.setSaldo(900);
        
        cc1.setAgencia(8850);
        cc1.setNumero(58408);
        cc1.setDigito(7);
        cc1.setSaldo(1000);
        cc1.setLimite(750);
        
        cc2.setAgencia(8850);
        cc2.setNumero(58409);
        cc2.setDigito(8);
        cc2.setSaldo(1500);
        cc2.setLimite(850);
        
        cp1.saldo();
        cp1.saque(500);
        cp1.deposito(100);
        cp1.saque(950);
        
        cp2.transferencia(700, cp1);
        cp1.saldo();
        
        cp1.transferencia(200, cp2);
        cp2.saldo();
        
        cp1.transferencia(3000, cp2);
        
        
        cc1.saldo();
        cc1.saque(1200);
        cc1.saque(3000);
        
        cc1.transferencia(1400, cc2);
        cc2.saldo();
        
        cc2.transferencia(4200, cc1);
        
    }
}