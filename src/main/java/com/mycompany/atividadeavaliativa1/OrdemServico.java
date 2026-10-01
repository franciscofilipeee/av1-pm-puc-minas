/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeavaliativa1;

import java.time.LocalDate;

/**
 *
 * @author 1639299
 */
public class OrdemServico {
    private int codigo;
    private String nomeCliente;
    private String placaVeiculo;
    private LocalDate data;
    private String status;
    private double valorEst;
    private Box box;

    public OrdemServico(int codigo, String nomeCliente, String placaVeiculo, String status, double valorEst, String box) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.placaVeiculo = placaVeiculo;
        this.data = LocalDate.now();
        this.status = status;
        this.valorEst = valorEst;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public double getValorEst() {
        return valorEst;
    }

    public Box getBox() {
        return box;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValorEst(double valorEst) {
        this.valorEst = valorEst;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo() + "\nNome do Cliente: " + getNomeCliente() + "\nPlaca do veículo: " + getPlacaVeiculo() + "\nData: " + getData().toString() + "\nStatus: " + getStatus() + "\nValor Estimado: " + getValorEst() + "\nBox: " + getBox().toString();
    }
}
