/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.avlimites.models;

import br.ufes.avlimites.interfaces.IBonus;

/**
 *
 * @author 55289
 */
public class BonusAniversario implements IBonus {

    @Override
    public boolean verificaBonus(Cliente cliente) {
        if (cliente.getDataAniversario().getMonth().getValue() > 4 && cliente.getDataAniversario().getMonth().getValue() < 11) {
            return true;
        } else {
            return false;
        }
    }

}
