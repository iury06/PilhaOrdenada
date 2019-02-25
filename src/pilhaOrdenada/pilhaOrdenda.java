/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaOrdenada;

import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author iurya
 */
/**push() – Insere um elemento na pilha
    pop() – Remove um elemento da pilha
    empty() – Verifica se a pilha está vazia
    peek() - qual o objeto que está no topo da pilha?
    * */
public class pilhaOrdenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack  pilhaPrincipal = new Stack(); // cria a pilha 
         Stack <Integer> pilhaAuxiliar = new Stack <Integer>();
   
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite quantos números você deseja empilhar: ");
        String num = "";
    int tamanhoPilha = 0;
    num = JOptionPane.showInputDialog("\"Digite quantos números você deseja empilhar: \"\n"); // tamanho pilhaP
    try{
    tamanhoPilha = Integer.parseInt(num);
    } catch(NumberFormatException e){
   System.out.println("Entrada Invalida...");
    }
        //int tamanhoPilha = sc.nextInt();
   
        for(int i = 0; i < tamanhoPilha; i++){ 
            System.out.println("digite o numero: "); 
            
            String num1 = "";
    int number = 0;
    num1 = JOptionPane.showInputDialog("\"Digite o numero: \"\n"); //numeros a empilhar
    try{
    number = Integer.parseInt(num1);
    } catch(NumberFormatException e){
   System.out.println("Entrada Invalida...");
    }
            
            //int number = sc.nextInt(); 
            pilhaPrincipal.push(number);
       
            while(!pilhaPrincipal.isEmpty()) {
            int tmp = (int) pilhaPrincipal.pop();
            System.out.println("Elemento retirado: "+tmp);
            
            while(!pilhaAuxiliar.isEmpty() && pilhaAuxiliar.peek() > tmp) {
                pilhaPrincipal.push(pilhaAuxiliar.pop());
            }
            pilhaAuxiliar.push(tmp);
            System.out.println("entrada: "+pilhaPrincipal);
            System.out.println("pilha auxiliar: "+pilhaAuxiliar);
        }
        
        }
         System.out.println("Pilha Ordenada:"); 
        while (!pilhaAuxiliar.isEmpty()) { 
           System.out.println(pilhaAuxiliar.pop()); 
        
      }
    }
    
}
