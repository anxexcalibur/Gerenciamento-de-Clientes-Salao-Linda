/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public abstract class Pessoa {
    private String nome, endereco, telefone;
    private int id;
    private Cliente cliente;
    //Temos que criar pelo menos um método abastrato
    public void setNome(String nome)
    {
        this.nome = (nome != null) ? nome : "";
    }
    public void setTelefone(String telefone)
    {
        this.telefone = (telefone != null) ? telefone : "";
    }
    public void setEndereco(String endereco)
    {
        this.endereco = (endereco != null) ? endereco : "";
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId(int id)
    {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("Cliente - Nome: ").append(nome);
        sb.append("; Endereço: ").append(endereco);
        sb.append("; Telefone: ").append(telefone);
        sb.append("; ID: ").append(id);
        //sb.append("; Pontos de fidelidade: ").append(String.valueOf(cliente.getPontos()));
        sb.append(".");
        return sb.toString();
    }
}
