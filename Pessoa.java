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
    protected String nome, cpf;
    protected char sexo;
    protected Data dtNasc;

    public Pessoa(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite aqui o seu nome:");
        this.nome = s.nextLine();
        this.dtNasc = new Data();
        System.out.println("Digite aqui o sexo:");
        this.sexo = s.next().charAt(0);
        System.out.println("Digite aqui o seu CPF:");
        this.cpf = s.next();
    }
    
    public Pessoa(String n, Data dt, char s, String c){
        System.out.println("Nova pessoa criada no sistema");
        this.nome = n;
        this.dtNasc = dt;
        this.sexo = s;
        this.cpf = c;
    }
    
    public int calcIdade(Data dtAtual){
        int numDias = dtAtual.getAno() * 365 + dtAtual.getMes() * 30 + dtAtual.getDia();
        int numNasc = this.dtNasc.getAno() * 365 + this.dtNasc.getMes() * 30 + this.dtNasc.getDia();
        return (numDias - numNasc) / 365;
    }
}
