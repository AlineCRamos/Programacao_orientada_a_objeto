/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2.exe0;

/**
 *
 * @author aline
 */
//CLICAR COM O BOTÃO DIREITO, INSERT CODE, GETTER AND SETER.
public class Cliente {
    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    //BOTÃO DIREITO INSERT CODE, CONSTRUCTOR, NÃO MARCA NENHUMA CAIXA
    public Cliente() {
    }
    
    ////BOTÃO DIREITO INSERT CODE, CONSTRUCTOR, MARCA TODAS AS CAIXAS
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta  (numeroConta);
        this.setNumeroAgencia (numeroAgencia);
        this.setNome (nome);
        this.setSaldo (saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    //, o número da conta deve obrigatoriamente ter 
    //tamanho 8, contando o traço do dígito verificador. 
    public final void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8 && numeroConta.charAt(6) == '-'){
        this.numeroConta = numeroConta;
        }
        else{
            this.numeroConta = "";
            System.out.println("Conta inválida, vai ficar vazia");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public final void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6 && numeroConta.charAt(4) == '-'){
        this.numeroAgencia = numeroAgencia;
        }
        else{
            this.numeroAgencia = "";
            System.out.println("Agência inválida, vai ficar vazia");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30){
        this.nome = nome;    
        }
        else{
            this.nome = "";
            System.out.println("Nome inválido, vai  ficar vazio");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        if (saldo >= 0){
        this.saldo = saldo;    
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void depositar (float x){
        this.setSaldo(this.saldo + x);
    }
    
    public void sacar (float x){
        this.setSaldo(this.saldo - x);
    }
    //BOTÃO DIREITO EM CIMA DO SALDO, INSERT CODE, toString()
    @Override
    public String toString() {
        return "Cliente{" + "numeroConta=" + numeroConta + ", numeroAgencia=" + numeroAgencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
}
