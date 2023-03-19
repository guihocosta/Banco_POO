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
public class Gerente extends Pessoa{
    String matricula, senha;
    Scanner s = new Scanner(System.in);
    
    Gerente(){
        super();
        System.out.println("Digite aqui a matrícula");
        this.matricula = s.next();
        this.senha = "12345";
        
    }
    
    Gerente(String n, Data dt, char s, String c, String m, String sen){
        super(n,dt,s,c);
        this.matricula = m;
        this.senha = sen;
    }
    
    boolean validarAcesso(String sen){
        return sen.equals(this.senha);
    }
    
    boolean validarAcesso(){
        System.out.println("Digite aqui a senha");
        String sen = s.next();
        return sen.equals(this.senha);
    }
    
}