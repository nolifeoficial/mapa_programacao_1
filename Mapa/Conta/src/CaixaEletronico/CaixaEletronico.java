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
        ContaPoupanca cp1 = new ContaPoupanca(8850,58406,5,850);
        ContaPoupanca cp2 = new ContaPoupanca(8850,58407,6,900);
        ContaCorrente cc1 = new ContaCorrente(8850,58408,7,1000,750);
        ContaCorrente cc2 = new ContaCorrente(8850,58409,8,1500,850);
        
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