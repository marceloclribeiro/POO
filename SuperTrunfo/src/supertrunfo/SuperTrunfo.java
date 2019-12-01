/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supertrunfo;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Marcelinho, Rochinha, Leticia
 */
public class SuperTrunfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Baralho bar = new Baralho();
        Scanner scanner = new Scanner(System.in);
        int i=0,sc,comp=0,acu=0;
        int player1=0,player2=0;
        String p1,p2;
        System.out.println("Bem vindo ao jogo SuperTrunfo!\n");
        System.out.println("Insira o nome do Jogador 1:");
        p1= scanner.next();
        System.out.println("Insira o nome do Jogador 2:");
        p2= scanner.next();
        bar.exibir(i,p1,p2);
        for(;;){
            
            System.out.println("Opções de comparação:\n1.Decomposição\n"
                    + "2.Reciclavel?\n3.Ataque\n");
            
            sc = scanner.nextInt();
        
            
            switch(sc){
                case 1:
                    //bar.decomposicao(i);
                    
                    comp = bar.decomposicao2(bar.getCarta(i), bar.getCarta(i+1), p1, p2);
                    i++;
                    break;
                case 2:
                    //bar.reciclavel(i);
                    
                    comp = bar.reciclavel2(bar.getCarta(i), bar.getCarta(i+1), p1, p2);
                    i++;
                    break;
                case 3:
                    //bar.ataque(i);
                    
                    comp = bar.ataque2(bar.getCarta(i), bar.getCarta(i+1),p1,p2);
                    i++;
                    break;
                default:
                    System.out.println("Opção Invalida\n");
                    i--;
                    break;
                    
            }
            if(comp==1){
                player1=player1 + 2 + acu;
                acu=0;
            }
            if(comp==-1){
                player2= player2 + 2 + acu;
                acu=0;
            }
            if(comp==0)
                acu=acu+2;
            if(i<10){
            i++;
            bar.exibir(i,p1,p2);
            }
            else{
                System.out.println("Fim das cartas!\n");
                System.out.println(p1+":"+player1 + "\n"+p2+":"+player2+"\n");
                if(player1>player2)
                    System.out.println(p1+" ganhou!\n");
                if(player1<player2)
                    System.out.println(p2+" ganhou!\n");
                if(player1==player2)
                    System.out.println("Empate!\n");
                System.exit(0);
            }
    }
    
}
}
