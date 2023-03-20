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
    private double limite;

    
    public ContaCorrente(String num, Pessoa tit, Gerente g, Data d){
        super(num, tit, g, d);
        this.limite = 200;
    }
    
    public ContaCorrente(Gerente g){
        super(g);
    }

    public void chequeEspecial(double juro){
        if (saldo < 0){
            this.saldo *= (1+juro/100);
        }
    }
    
    public void alterarLimite(String pwd, double l){
        if(this.gerente.validarAcesso(pwd)){
            this.limite = l;
        }
    }
    
    public void alterarLimite(){
        Scanner s = new Scanner(System.in);
        String pwd = s.next();
        Double l = s.nextDouble();
        
        if(this.gerente.validarAcesso(pwd)){
            this.limite = l;
        }
    }
    
    protected double disponivel(){

        return this.saldo + this.limite;
    }
    
    public void extrato(){
        System.out.println("*** EXTRATO DA CONTA-CORRENTE ***");
        super.extrato();
    }
        
}
