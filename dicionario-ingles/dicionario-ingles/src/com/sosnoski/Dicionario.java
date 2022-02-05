package com.sosnoski;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Dicionario {
    private TreeMap<String, Traducao> dicionario;

    public Dicionario(){
        dicionario = new TreeMap<String, Traducao>();
    }

    public TreeMap<String, Traducao> getDicionario() {
        return dicionario;
    }

    public void setDicionario(TreeMap<String, Traducao> dicionario) {
        this.dicionario = dicionario;
    }


    public void adicionaPalavra(String palavra, String traducao, String exemplo){
        dicionario.put(palavra, new Traducao(traducao, exemplo));
    }

    public void removePalavra(String palavra){
        dicionario.remove(palavra);
    }

    public void alteraPalavra(String palavra, String traducao, String exemplo) {
        Traducao novaTraducao = dicionario.get(palavra);
        if(!traducao.isEmpty())
            novaTraducao.setTraducao(traducao);
        if(!exemplo.isEmpty())
            novaTraducao.setExemplo(exemplo);
        dicionario.replace(palavra, novaTraducao);
    }

    public void traduz(String palavra){
        System.out.println("Palavra: " + palavra);
        System.out.println("Tradução: " + dicionario.get(palavra).getTraducao());
        System.out.println("Exemplo: " + dicionario.get(palavra).getExemplo() + "\n\n");
    }

    public void lista(){
        System.out.println("Dicionário:\n\n");
        for(Map.Entry<String, Traducao> traducao : dicionario.entrySet()){
            this.traduz(traducao.getKey());
        }
    }

    public void salvar() throws IOException {
        String arquivo = "dicionario.txt";
        FileWriter fstream = new FileWriter(arquivo);
        BufferedWriter out = new BufferedWriter(fstream);
        for (Map.Entry<String, Traducao> entry : dicionario.entrySet()) {
            out.write(entry.getKey() + "," + entry.getValue().getTraducao() + "," + entry.getValue().getExemplo() +"\n");
            out.flush();
        }
        out.close();
    }

    public void ler() throws IOException {
        String arquivo = "dicionario.txt";
        FileReader fstream = new FileReader(arquivo);
        BufferedReader in = new BufferedReader(fstream);
        String linha;

        while((linha = in.readLine()) != null){
            String[] partes = linha.split(",");
            adicionaPalavra(partes[0], partes[1], partes[2]);
        }
    }
}
