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

public class Pessoa {
    String nome, cpf;
    char sexo;
    Data dtNasc;
    Scanner s = new Scanner(System.in);
    Pessoa(){
        System.out.println("Digite aqui o seu nome:");
        this.nome = s.nextLine();
        this.dtNasc = new Data();
        System.out.println("Digite aqui o sexo:");
        this.sexo = s.next().charAt(0);
        System.out.println("Digite aqui o seu CPF:");
        this.cpf = s.next();
    }
    
    Pessoa(String n, Data dt, char s, String c){
        System.out.println("Nova pessoa criada no sistema");
        this.nome = n;
        this.dtNasc = dt;
        this.sexo = s;
        this.cpf = c;
    }
    
    int calcIdade(Data dtAtual){
        int numDias = dtAtual.ano * 365 + dtAtual.mes * 30 + dtAtual.dia;
        int numNasc = this.dtNasc.ano * 365 + this.dtNasc.mes * 30 + this.dtNasc.dia;
        return (numDias - numNasc) / 365;
    }
}
