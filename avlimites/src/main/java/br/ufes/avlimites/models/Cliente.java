/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.avlimites.models;

import java.time.LocalDate;
import br.ufes.avlimites.interfaces.IBonus;

/**
 *
 * @author 55289
 */
public class Cliente {

    private LocalDate dataAniversario;
    private IBonus bonus;
    private String nome;
    private String cpf;

    public Cliente(LocalDate dataAniversario, String nome, String cpf) {
        this.dataAniversario = dataAniversario;
        this.bonus = new BonusAniversario();
        this.nome = nome;
        if (cpf.length() != 11) {
            throw new IllegalArgumentException();
        }
        this.cpf = cpf;

    }

    public String sorteioAniversario() {
        bonus = new BonusAniversario();
        if (bonus.verificaBonus(this)) {
            return "Está participando do sorteio!";

        } else {
            return "Não está participando do sorteio!";
        }
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public IBonus getBonus() {
        return bonus;
    }

    public void setBonus(IBonus bonus) {
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\n CPF: " + getCpf()
                + "\n Data Aniversário: " + getDataAniversario().toString();
    }

}
