/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco2023;

import java.util.Scanner;

/**
 *
 * @author 20221TIIMI0050
 */
public class ContaCorrente extends Conta{
    double limite;
    Scanner s = new Scanner(System.in);
    
    ContaCorrente(String num, Pessoa tit, Gerente g, Data d){
        super(num, tit, g, d);
        this.limite = 200;
    }
    
    ContaCorrente(Gerente g){
        super(g);
    }

    void chequeEspecial(double juro){
        if (saldo < 0){
            this.saldo *= (1+juro/100);
        }
    }
    
    void alterarLimite(String pwd, double l){
        if(this.gerente.validarAcesso(pwd)){
            this.limite = l;
        }
    }
    
    void alterarLimite(){
        String pwd = s.next();
        Double l = s.nextDouble();
        
        if(this.gerente.validarAcesso(pwd)){
            this.limite = l;
        }
    }
    
    double disponivel(){
        return this.saldo + this.limite;
    }
    
    void extrato(){
        System.out.println("*** EXTRATO DA CONTA-CORRENTE ***");
        super.extrato();
    }
        
}
