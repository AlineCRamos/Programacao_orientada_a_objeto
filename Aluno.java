/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1.casa;

/**
 *
 * @author aline
 */

//Crie uma classe em Java chamada Aluno contendo as variáveis de instância numeroAluno (int),
//nome (String), idade (int), p1 (float) e p2 (float), 


public class Aluno {
    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    
    //construtores
    public Aluno(){
    }

    public Aluno ( int numeroAluno, String nome, int idade,
        float p1, float p2){
    this.numeroAluno = numeroAluno;
    this.nome = nome;
    this.idade = idade;
    this.p1 = p1;
    this.p2 = p2; 
    }

    public void mostraObjeto(){
    System.out.println( " numero do aluno: " + this.numeroAluno + "\n Nome " +this.nome + "\n idade: " +
               this.idade + " \nprova 1 " + this.p1 + "\nprova 2 " + this.p2);
    
                 
    }
    //calcula e retorna a média final do aluno
    public void notaFinal(){
       float nf = (this.p1 + this.p2) / 2;
       System.out.println("\nA media final foi: " + nf);
    }
    //retorna os valores de numeroAluno, nome e idade. 
    public String dadosAluno(){
       return "O número: " + this.numeroAluno + 
               "\nO nome: " + this.nome +
               "\nA idade: " + this.idade;
    }
   
    //Adicionar o método passou() à classe Aluno a fim de verificar se o aluno passou.
    public String passou (){
        float x = (this.p1 + this.p2) / 2; 
        if (x >= 6){
           return "\nAluno aprovado";
        }
        else{
           return "\nAluno reprovado";
        }
    }
    
}
