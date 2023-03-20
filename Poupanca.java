/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco2023;

/**
 *
 * @author 20221TIIMI0050
 */
public class Poupanca extends Conta{
    
    public Poupanca(String num, Pessoa tit, Gerente g, Data d){
        super(num, tit, g, d);
    }
    
    public Poupanca(Gerente g){
        super(g);
    }

    public void extrato(){
        System.out.println("*** EXTRATO DA CONTA-POUPANCA ***");
        super.extrato();
    }
    
    public void rendimentos(double juros){
        this.saldo *= (1+juros);
    }
    
}
