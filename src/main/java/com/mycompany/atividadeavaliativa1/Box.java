/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeavaliativa1;

import java.util.ArrayList;

/**
 *
 * @author 1639299
 */
public class Box {
    private int numero;
    private ArrayList<String> tipoServico;
    private int capacidadeMax;
    private String localizacao;
    private Mecanico mecanicoResponsavel;
    private ArrayList<OrdemServico> ordemServico;

    public Box(int numero, ArrayList<String> tipoServico, int capacidadeMax, String localizacao, Mecanico mecanicoResponsavel, ArrayList<OrdemServico> ordemServico) {
        this.numero = numero;
        this.tipoServico = tipoServico;
        this.capacidadeMax = capacidadeMax;
        this.localizacao = localizacao;
        this.mecanicoResponsavel = mecanicoResponsavel;
        this.ordemServico = ordemServico;
    }
    
    public int getNumero() {
        return numero;
    }

    public ArrayList<String> getTipoServico() {
        return tipoServico;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Mecanico getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }

    public ArrayList<OrdemServico> getOrdemServico() {
        return ordemServico;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipoServico(ArrayList<String> tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setMecanicoResponsavel(Mecanico mecanicoResponsavel) {
        this.mecanicoResponsavel = mecanicoResponsavel;
    }

    public void setOrdemServico(ArrayList<OrdemServico> ordemServico) {
        this.ordemServico = ordemServico;
    }
    
    public void associarMecanico(Mecanico mec) {
        setMecanicoResponsavel(mec);
    }
    
    public void atriuirOrdemBox(OrdemServico ordem) {
        ordemServico.add(ordem);
    }
    
    public String ordensBox() {
        String retorno = "";
        for(int i=0;i<ordemServico.size();i++) {
            retorno += "\n" +ordemServico.get(i).toString();
        }
        
        return retorno;
    }
    
    public ArrayList<OrdemServico> ordensBoxPorStatus(String status) {
        ArrayList<OrdemServico> ordens = new ArrayList();
        for(int i=0;i<ordemServico.size();i++) {
            if(ordemServico.get(i).getStatus().equals(status)) {
                ordens.add(ordemServico.get(i));
            }
        }
        
        return ordens;
    }

    @Override
    public String toString() {
        return "Número: " + getNumero() + "\nTipo de serviço: " + tipoServico.toString() + "\nCapacidade máxima: " + getCapacidadeMax() + "\nLocalização: " + getLocalizacao() + "\nMecânico responsável: " + getMecanicoResponsavel().toString() + "\nOrdens de serviço: " + getOrdemServico().toString();
    }
}
