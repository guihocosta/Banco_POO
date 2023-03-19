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
    String numero;
    Pessoa titular;
    Data criacao;
    double saldo;
    Gerente gerente;
    Scanner s = new Scanner(System.in);
    
    Conta(Gerente g){
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
    
    void depositar(double valor){
        this.saldo = valor;
    }
    
    double disponivel(){
        return this.saldo;
    }
    
    void extrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Saldo disponivel: " + this.disponivel());
                                
    }
    boolean sacar(double valor){
        if(this.disponivel() >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean transferir(double v, Conta dest){
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

    
