/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public class Cliente extends Pessoa {
    //classe criada para metodos e atributos que serao usados pelos objetos na(a) tela(s)
    // Atributos da classe Cliente
    /*private String nome;
    private String endereco;
    private String telefone; 
    Retirei esses atributos pois eles devem ficar em pessoa e serem herdados de lá, somente restando 
    os atributos pontosFidelidade e totalDeClientesFidelizados que é um atributo específico à cliente*/
    private int pontosFidelidade;
    /*public Alterei por questão de encapsulamento mesmo*/private static int totalDeClientesFidelizados = 0;
    public Cliente(String nome, String endereco,String telefone,int id)
    {
        //construtor
        // this.nome = nome; ------> redundância|
        // this.endereco = endereco; redundância|> Os sets já fazem esse trabalho para nós
        // this.telefone = telefone; redundância|
        setNome(nome);
        setTelefone(telefone);
        setEndereco(endereco);
        setId(id);
        this.pontosFidelidade = 0; //Se toda cliente começa com 0 e existe adicionarPontosFidelidade
        //Por que temos o setPontosFidelidade entâo?
        toString();
        // Inicialmente, a cliente começa com zero pontos de fidelidade
        incrementarTotalDeClientesFidelizados(); //Fiz uma pergunta sobre o último método no fim da classe, confira!
    }
    // Métodos de acesso e manipulação ("getters" e "setters") para os atributos da classe Cliente
    public int getPontos() {
        return pontosFidelidade;
    }
    // Método para adicionar pontos de fidelidade ao cliente
    public void adicionarPontosFidelidade(){
        pontosFidelidade++;
    }
    // Atributo estático para armazenar o total de clientes fidelizados
    public static void incrementarTotalDeClientesFidelizados(){
        totalDeClientesFidelizados++;
    }//Tem certeza que precisamos desse método? Podemos colocar incremento
    //no construtor
    public int getTotal()
    {
        return totalDeClientesFidelizados;
    }
    
}
