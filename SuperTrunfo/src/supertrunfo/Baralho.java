/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supertrunfo;

/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
*/
import java.util.*;
import java.nio.file.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Baralho{
    Carta[] vetor=new Carta[12];
        
            int a=0;
        public Baralho() throws Exception{
        FileReader arquivo= new FileReader("Cartas.txt");
        BufferedReader LerArquivo= new BufferedReader(arquivo);
        int i=0;
        
        while(LerArquivo.ready())
        {
          String texto=LerArquivo.readLine();
          String textoSplit []=texto.split(";");
          
            vetor[i]= new Carta(textoSplit[0],textoSplit[1],Integer.parseInt(textoSplit[2]),Boolean.parseBoolean(textoSplit[3
                    ]),Integer.parseInt(textoSplit[4]));
            //JOptionPane.showMessageDialog(null,texto);
            i++;
            
        }
        LerArquivo.close();
        embaralhar(vetor);
        
    }
        public Carta getCarta(int i){
            return vetor[i];
        }
        public void ataque(int i){
            vetor[i].compararAtaque(vetor[i+1]);
        }
        public int ataque2(Carta a, Carta b,String p1, String p2){
            System.out.println("Atributo escolhido: Ataque!");
            if(a.getAtaque() > b.getAtaque()){
                System.out.println
                ("Carta do "+p1+":\n"+a.getNome() +"\nAtaque: " + a.getAtaque() + 
                "\n\nCarta do "+p2+":\n" + b.getNome() +"\nAtaque: " + b.getAtaque()+
                "\n"+p1+" venceu!!\n");
                return 1;
        }else if (a.getAtaque() == b.getAtaque()){
            System.out.println
            ("Carta do "+p1+":\n"+a.getNome() +"\nAtaque: " + a.getAtaque() + 
            "\n\nCarta do "+p2+":\n" + b.getNome() +"\nAtaque: " + b.getAtaque()+
            "\n"+p1+" e "+p2+" empataram!!\n");
            return 0;
        }else{
            System.out.println
            ("Carta do "+p1+":\n"+a.getNome() +"\nAtaque: " + a.getAtaque() + 
            "\n\nCarta do "+p2+":\n" + b.getNome() +"\nAtaque: " + b.getAtaque()+
            "\n"+p2+" venceu!!\n");
            return -1;
        }
        }
        public void decomposicao(int i){
            vetor[i].compararDecomposicao(vetor[i+1]);
        }
        public int decomposicao2(Carta a, Carta b,String p1, String p2){
            System.out.println("Atributo escolhido: Decomposição!");
            if(a.getDecomposicao() > b.getDecomposicao()){
                System.out.println
                ("Carta do "+p1+":\n"+a.getNome() +"\nDecomposicao: " + a.getDecomposicao() + 
                "\n\nCarta do "+p2+":\n" + b.getNome() +"\nDecomposição: " + b.getDecomposicao()+
                "\n"+p1+" venceu!!\n");
                return 1;
        }else if (a.getDecomposicao() == b.getDecomposicao()){
            System.out.println
            ("Carta do "+p1+":\n"+a.getNome() +"\nDecomposicao: " + a.getDecomposicao() + 
            "\n\nCarta do "+p2+":\n" + b.getNome() +"\nDecomposição: " + b.getDecomposicao()+
            "\n"+p1+" e "+p2+" empataram!!\n");
            return 0;
        }else{
            System.out.println
            ("Carta do "+p1+":\n"+a.getNome() +"\nDecomposicao: " + a.getDecomposicao() + 
            "\n\nCarta do "+p2+":\n" + b.getNome() +"\nDecomposição: " + b.getDecomposicao()+
            "\n"+p2+" venceu!!\n");
            return -1;
        }
        }
        public void reciclavel(int i){
            vetor[i].compararReciclavel(vetor[i+1]);
        }
        public int reciclavel2(Carta a, Carta b,String p1, String p2){
            System.out.println("Atributo escolhido: Reciclavel!");
            if(a.getReciclavel() == b.getReciclavel()){
                System.out.println
                ("Carta do "+p1+":\n"+a.getNome() +"\nReciclavel: " + a.getReciclavel() + 
                "\n\nCarta do "+p2+":\n" + b.getNome() +"\nReciclavel: " + b.getReciclavel()+
                "\n"+p1+" e "+p2+" empataram!!\n");
                return 0;
        }else if (a.getReciclavel()){
            System.out.println
            ("Carta do "+p1+":\n"+a.getNome() +"\nReciclavel: " + a.getReciclavel() + 
            "\n\nCarta do "+p2+":\n" + b.getNome() +"\nReciclavel: " + b.getReciclavel()+
            "\n"+p1+" venceu!!\n");
            return 1;
        }else{
            System.out.println
            ("Carta do "+p1+":\n"+a.getNome() +"\nReciclavel: " + a.getReciclavel() + 
            "\n\nCarta do "+p2+":\n" + b.getNome() +"\nReciclavel: " + b.getReciclavel()+
            "\n"+p2+" venceu!!\n");
            return -1;
        }
        }
        public void exibir(int i,String p1, String p2){
            if(a==0){
                vetor[i].exibir(p1);
            a=1;
            }else{
                vetor[i+1].exibir(p2);
                a=0;
            }
        }
        public void embaralhar(Carta [] v){
            Random random = new Random();
            
            for(int i=0; i<(v.length-1);i++){
                int j = random.nextInt(v.length);
                
                Carta temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                
        }
        }
    
}
      

  