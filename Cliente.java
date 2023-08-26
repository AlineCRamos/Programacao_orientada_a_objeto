/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1.casa;

/**
 *
 * @author aline
 */
public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    public Cliente(){
    }
    
    public Cliente ( int numeroConta, int numeroAgencia, String nome,
            float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void mostrarObjeto(){
         System.out.println( "Número da conta: " + this.numeroConta + "\nNúmero da agência:  " + this.numeroAgencia + "\nNome: " +
               this.nome + " \nSaldo da conta: " + this.saldo);
   }
    
    public void realizarDep(float x){
        this.saldo = this.saldo + x;
        System.out.println("Foi depositado o valor de: " + x);
    }
    
    public void realizarSaq(float x){
        if( this.saldo < x){
          System.out.println("\nERRO, o valor de " + x + " não pode ser sacado");
        }
        else{
          this.saldo = this.saldo - x;
        System.out.println("\nFoi sacado o valor de: " + x);  
        }
        
    }
    
    public void retorna(){
        System.out.println("\nO número da conta: " + this.numeroConta + "\nO nome da pessoa é: " + this.nome + "\nO saldo da conta é: " + this.saldo);
    }
    
   
  }
    
    
    

