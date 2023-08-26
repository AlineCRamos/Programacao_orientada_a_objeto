/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista1.casa;

/**
 *
 * @author aline
 */
public class TestRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Rio obj1 = new Rio();
     obj1.nome = "Paraná";
     obj1.chover(2);
     obj1.poluir();
     System.out.println(obj1.mostra());
     
     Rio obj2 = new Rio("Tietê", 10, true);
     obj2.ensolarar(3);
     obj2.limpar();
     obj2.limpar();
     System.out.println(obj2.mostra());
    
    }
}