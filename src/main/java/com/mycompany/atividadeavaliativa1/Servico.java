/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeavaliativa1;

/**
 *
 * @author 1639299
 */
public class Servico {
    private String nome;
    private float tempoEst;
    private double valor;
    private String categoria;

    public String getNome() {
        return nome;
    }

    public float getTempoEst() {
        return tempoEst;
    }

    public double getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempoEst(float tempoEst) {
        this.tempoEst = tempoEst;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
