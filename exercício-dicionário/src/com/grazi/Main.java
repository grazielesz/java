package com.sosnoski;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        try {
            dicionario.ler();
        } catch (IOException e) {
            //Primeiro acesso
        }
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String palavra, traducao, exemplo;

        do {
            options();
            opcao = Integer.parseInt(scanner.nextLine());

            switch(opcao){
                case 0:
                    System.out.println("Tchau");
                    break;
                case 1:
                    System.out.println("Digite a palavra em inglês:");
                    palavra = scanner.nextLine();
                    System.out.println("Digite a palavra em português:");
                    traducao = scanner.nextLine();
                    System.out.println("Digite o exemplo/definição:");
                    exemplo = scanner.nextLine();
                    dicionario.adicionaPalavra(palavra, traducao, exemplo);
                    try {
                        dicionario.salvar();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Digite a palavra em inglês para remover:");
                    palavra = scanner.nextLine();
                    dicionario.removePalavra(palavra);
                    try{
                        dicionario.salvar();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Digite a palavra em inglês que deseja alterar:");
                    palavra = scanner.nextLine();
                    System.out.println("Digite a nova traducao (ou enter para pular):");
                    traducao = scanner.nextLine();
                    System.out.println("Digite o novo exemplo/definicao (ou enter para pular):");
                    exemplo = scanner.nextLine();
                    try {
                        dicionario.alteraPalavra(palavra, traducao, exemplo);
                        dicionario.salvar();
                    }catch(NullPointerException | IOException e) {
                        System.out.println("Essa palavra não estava cadastrada...");
                    }
                    break;
                case 4:
                    System.out.println("Digite a palavra em inglês que deeseja visualizar/traduzir:");
                    palavra = scanner.nextLine();
                    try {
                        dicionario.traduz(palavra);
                    }catch(NullPointerException e) {
                        System.out.println("Essa palavra não está cadastrada");
                    }
                    break;
                case 5:
                    dicionario.lista();
                    break;
                default:
                    System.out.println("Essa opção não tem funcionalidade cadastrada...");
            }
        }while (opcao != 0);
    }

    private static void options(){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Remover");
        System.out.println("3 - Atualizar");
        System.out.println("4 - Visualizar");
        System.out.println("5 - Listar");
    }
}
