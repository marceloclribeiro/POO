/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supertrunfo;

/**
 *
 * @author Marcelinho, Rochinha, Leticia
 */
public class Carta{

    String nome;
    String tipo;
    int decomposicao;
    boolean reciclavel;
    int ataque;
    
    Carta(String n,String t, int d, boolean r, int a){
        nome = n;
        tipo=t;
        decomposicao = d;
        reciclavel = r;
        ataque = a;
    }
    
    String getNome(){
        return nome;
    }
    
    int getDecomposicao(){
        return decomposicao;
    }
    
    int getAtaque(){
        return ataque;
    }
    
    boolean getReciclavel(){
        return reciclavel;
    }
    
    void compararDecomposicao(Carta c){
        System.out.println("Atributo escolhido: Decomposição!");
        if(decomposicao > c.getDecomposicao()){
            System.out.println
            ("Sua carta:"+nome +"\nDecomposição: " + decomposicao + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getDecomposicao()+
            "\nVocê venceu seu corno!\n");
            
        }else if (decomposicao == c.getDecomposicao()){
            System.out.println
            ("Sua carta:"+nome +"\nDecomposição: " + decomposicao + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getDecomposicao()+
            "\nVocês empataram seus cornos!\n");
            
        }else{
            System.out.println
            ("Sua carta:"+nome +"\nDecomposição: " + decomposicao + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getDecomposicao()+
            "\nVocê perdeu seu corno!\n");
        }
    }
    
    void compararAtaque(Carta c){
        System.out.println("Atributo escolhido: Ataque!");
        if(ataque > c.getAtaque()){
            System.out.println
            ("Sua carta:"+nome +"\nAtaque: " + ataque + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getAtaque()+
            "\nVocê venceu seu corno!\n");
        }else if (ataque == c.getAtaque()){
            System.out.println
            ("Sua carta:"+nome +"\nAtaque: " + ataque + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getAtaque()+
            "\nVocês empataram seus cornos!\n");
        }else{
            System.out.println
            ("Sua carta:"+nome +"\nAtaque: " + ataque + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getAtaque()+
            "\nVocê perdeu seu corno!\n");
        }
    }
    
    void compararReciclavel(Carta c){
        System.out.println("Atributo escolhido: Reciclavel!");
        if(reciclavel == c.getReciclavel()){
            System.out.println
            ("Sua carta:"+nome+"\nAtaque: " + reciclavel + 
            "\n\nAdversário:" + c.getNome() +"\nReciclavel?: " + c.getReciclavel()+
            "\nVocês empataram seus corno!\n");
            
            //System.out.println("Empatou! :)\n"+
            //"sua: " + reciclavel + "\n" +
            //"adversário: " + c.getReciclavel());
        }else if (reciclavel){
            System.out.println
            ("Sua carta:"+nome +"\nAtaque: " + reciclavel + 
            "\n\nAdversário:" + c.getNome() +"\nReciclavel?: " + c.getReciclavel()+
            "\nVocê venceu seu corno!\n");
            
            //System.out.println("Você venceu! :/ \n"+
            //"sua: " + reciclavel + "\n" +
            //"adversário: " + c.getReciclavel());
        }else{
            System.out.println
            ("Sua carta:" + nome +"\nAtaque: " + reciclavel + 
            "\n\nAdversário:" + c.getNome() +"\nDecomposição: " + c.getReciclavel()+
            "\nVocê perdeu seu corno!\n");
            
            //System.out.println("Você perdeu! :( \n"+
            //"sua: " + reciclavel + "\n" +
            //"adversário: " + c.getReciclavel());
        }
    }
    
    void exibir(String p){
        System.out.println("Carta do(a)"+p+":\n"+ nome +
        "\nTipo: " + tipo +
        "\nDecomposicão: " + decomposicao  +
        "\nAtaque: " + ataque  + 
        "\nReciclavel: " + reciclavel);
    }
    
}