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
public class Data {
    private int dia, mes, ano;
    Scanner s = new Scanner(System.in);
    
    public Data() {
        System.out.println("Digite o dia: ");
        this.dia = s.nextInt();
        System.out.println("Digite o mês: ");
        this.mes = s.nextInt();
        System.out.println("Digite o ano: ");
        this.ano = s.nextInt();
    }
    
    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;          
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void imprimeData(){
        System.out.println(this.dia + "/" + this.mes + "/" +
                this.ano);
    }
    
    public boolean maior(Data d2){
        if(d2.ano * 365 + d2.mes * 30 + d2.dia > this.ano * 365 + this.mes * 30 + this.dia) {
            return true;
        }
        return false;
    }
}
