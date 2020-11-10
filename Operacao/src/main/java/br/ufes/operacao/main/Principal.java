/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.operacao.main;

import br.ufes.operacao.models.Operacao;

/**
 *
 * @author 55289
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacao operacao = new Operacao("Soma", "SM");
        System.out.printf("Nome da operação: " + operacao.getNome()
                + "\nCódigo: " + operacao.getCodigo());
    }

}
