/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public class Cliente {
    //classe criada para metodos e atributos que serao usados pelos objetos na(a) tela(s)
    // Atributos da classe Cliente
    private String nome;
    private String endereco;
    private String telefone; 
    private int pontosFidelidade;
    public static int totalDeClientesFidelizados = 0;
    
    
    public Cliente(String nome, String endereco,String telefone)
    {
        //construtor
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        // Inicialmente, o cliente começa com zero pontos de fidelidade
        this.pontosFidelidade = 0;
    }
    // Métodos de acesso ("getters") para os atributos da classe Cliente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }
    // Método para adicionar pontos de fidelidade ao cliente
    public void adicionarPontosFidelidade(int pontos){
        this.pontosFidelidade += pontos;
    }
      // Variável estática para armazenar o total de clientes fidelizados
    public static void IncrementarTotalDeClientesFidelizados(){
        totalDeClientesFidelizados++;
    }
}
