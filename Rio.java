/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1.casa;

/**
 *
 * @author aline
 */
public class Rio {

    String nome;
    float nível;
    Boolean poluído;

    public Rio() {

    }

    public Rio(String nome, float nível, Boolean poluído) {
        this.nome = nome;
        this.nível = nível;
        this.poluído = poluído;
    }
    public void poluir(){
        this.poluído = true;
    }
    public void limpar(){
        this.poluído = false;
    }

    public void chover(float x) {
        this.nível = nível + x;
    }

    public void ensolarar(float y) {
        if (y <= this.nível){
            this.nível = nível - y;
        }
        else{
            this.nível = 0;
        }   
    }

    public String mostra(){
        return "Nome: " + this.nome + "\nNível: " + this.nível +
                ((this.poluído) ? "\nSim" : "\nNão");
    }

}