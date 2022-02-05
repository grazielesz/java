package com.sosnoski;

public class Traducao {
    private String traducao, exemplo;

    public Traducao(String traducao, String exemplo){
        this.traducao = traducao;
        this.exemplo = exemplo;


    }

    public String getTraducao() {
        return traducao;
    }

    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }

    public String getExemplo() {
        return exemplo;
    }

    public void setExemplo(String exemplo) {
        this.exemplo = exemplo;
    }
}
