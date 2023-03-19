/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco2023;

/**
 *
 * @author 20221TIIMI0050
 */
public class Banco2023 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente();
        
        ContaCorrente cc1 = new ContaCorrente(g1);
        ContaCorrente cc2 = new ContaCorrente(g1);
       
        Poupanca cp1 = new Poupanca(g2);
        Poupanca cp2 = new Poupanca(g2);
       
            
        /* 
        for (int i = 1; i <= 120; i++) {
           cc1.chequeEspecial(0.5);
           
           if(i%30 == 0) {
               System.out.println("Saldo apos " + i + " dia: " + c1.saldo);
           }
        }
        System.out.println(p1.nome + " tem " + p1.calcIdade(new Data(02,03,2023)) + " anos de idade.");
        */
    }
}
