/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeavaliativa1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1639299
 */
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static final ArrayList<Box> box = new ArrayList<Box>();
    public static final ArrayList<OrdemServico> ordemServico = new ArrayList<OrdemServico>();
    
    public static void Main(String[] args) {
        
        while(true) {
            System.out.println(
            "Opções:"
            + "\n1- Cadastrar ordem de serviço"
            + "\n2- Associar um mecânico a um box"
            + "\n3- Atribuir ordem de serviço a um box"
            + "\n4- Exibir todas as ordens atribuídas a um box específico"
            + "\n5- Informar a quantidade total de ordens finalizados por cada box"
            + "\n6- Buscar ordens por status"
            + "\n7- Exibir detalhes de uma ordem específica"
            + "\n8- Sair");
        
            switch(sc.nextInt()) {
                case 1:
                    cadastrarOrdemServico();
                    break;
                case 2:
                    atribuirMecanicoBox();
                    break;
                case 3:
                    AtribuirOrdemBox();
                    break;
                case 4:
                    exibirOrdensBox();
                    break;
                case 5:
                    quantidadeTotalOrdensFinalizadas();
                    break;
                case 6:
                    buscarOrdensStatus();
                    break;
                case 7:
                    exibirDetalhesOrdem();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }
    }
    
    public static void cadastrarOrdemServico() {
        System.out.println("\nCadastro da Ordem de Serviço");
        System.out.println("Código: ");
        int codigo = sc.nextInt();
        System.out.println("Nome do cliente: ");
        String nomeCliente = sc.next();
        System.out.println("Modelo do veículo: ");
        String modeloVeiculo = sc.next();
        System.out.println("Placa do veículo: ");
        String placaVeiculo = sc.next();
        System.out.println("Status: ");
        String status = sc.next();
        System.out.println("Valor estimado: ");
        double valorEstimado = sc.nextDouble();
        
        OrdemServico ordemservico = new OrdemServico(codigo, nomeCliente, placaVeiculo, status, valorEstimado, status);
        
        System.out.println("Cadastrado com sucesso!");
    }
    
    public static void atribuirMecanicoBox() {
        
    }

    public static void AtribuirOrdemBox() {
    
    }

    public static void exibirOrdensBox() {}

    public static void quantidadeTotalOrdensFinalizadas() {}

    public static void buscarOrdensStatus() {
        System.out.println("Digite o status desejado: ");
        String status = sc.next();
        
        
    }

    public static void exibirDetalhesOrdem() {}         
}
