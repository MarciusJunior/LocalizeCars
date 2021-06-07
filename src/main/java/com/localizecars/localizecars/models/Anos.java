package com.localizecars.localizecars.models;

public class Anos {

    private static String nome;
    private String codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static void main(String[] args) {
        if (nome.substring(3) == "0") {
            String dia = "Segunda-Feira";
        } else if (nome.substring(3) == "1") {
            String dia = "Segunda-Feira";
        }
        if (nome.substring(3) == "2") {
            String dia = "Terça-Feira";
        } else if (nome.substring(3) == "3") {
            String dia = "Terça-Feira";
        }
        if (nome.substring(3) == "4") {
            String dia = "Quarta-Feira";
        } else if (nome.substring(3) == "5") {
            String dia = "Quarta-Feira";
        }
        if (nome.substring(3) == "6") {
            String dia = "Quinta-Feira";
        } else if (nome.substring(3) == "7") {
            String dia = "Quinta-Feira";
        }
        if (nome.substring(3) == "8") {
            String dia = "Sexta-Feira";
        } else if (nome.substring(3) == "9") {
            String dia = "Sexta-Feira";
        }
    }
}
