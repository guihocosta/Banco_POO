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
public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected Data criacao;
    protected double saldo;
    protected Gerente gerente;
    
    public Conta(Gerente g){
        Scanner s = new Scanner(System.in);
        this.gerente = g;
        System.out.print("Escreva o numero da conta: ");
        this.numero = s.next();
        this.criacao = new Data();
        this.saldo = 0;
        this.titular = new Pessoa();
             
    }
    
    public Conta(String num, Pessoa tit, Gerente g, Data d) {
        this.numero = num;
        this.titular = tit;
        this.gerente = g;
        this.criacao = d;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema.");
    }
    
    public void depositar(double valor){
        this.saldo = valor;
    }
    
    protected double disponivel(){
        return this.saldo;
    }
    
    public void extrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Saldo disponivel: " + this.disponivel());
                                
    }
    public boolean sacar(double valor){
        if(this.disponivel() >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean transferir(double v, Conta dest){
        if(this.disponivel() > v){
            this.sacar(v);
            dest.depositar(v);
            return true;
        }
        else{
            return false;
        }
    }  
}

    
