package com.example.UTI.model;

public class Medico {
    private int crm;
    private String nome;
    private String area;

    public Medico() {
    }

    public Medico(int crm, String nome, String area) {
        this.crm = crm;
        this.nome = nome;
        this.area = area;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
}