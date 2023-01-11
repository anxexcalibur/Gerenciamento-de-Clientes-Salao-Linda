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
    //Temos que criar pelo menos um método abastrato
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
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
}
