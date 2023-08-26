/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista1.casa;

/**
 *
 * @author aline
 */
public class TestAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno(10, "joão", 21, 0.5f, 6.0f);
       
       //mostra dados do objeto
       System.out.println(aluno1.dadosAluno()); // usar o System sempre no testa
       System.out.println(aluno1.passou());
       aluno1.notaFinal();
       aluno1.dadosAluno();
 
       
    }
    
  
    
}
