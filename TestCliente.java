/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista1.casa;

/**
 *
 * @author aline
 */
public class TestCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente cliente1 = new Cliente (11, 2495, "Fulano", 1359.00f );
       cliente1.mostrarObjeto();
       cliente1.realizarDep(15.75f);
       cliente1.realizarSaq(5000.00f);
       cliente1.retorna();
       
       Cliente cliente2 = new Cliente (13, 1495, "Bell", 4516.00f);
       cliente2.mostrarObjeto();
       cliente2.realizarDep(55.00f);
       cliente2.realizarSaq(100.00f);
       cliente2.retorna();
      
       
       
    }
    
    
}
