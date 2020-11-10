/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.avlimites.models;

import br.ufes.avlimites.interfaces.Bonus;
import java.time.LocalDate;

/**
 *
 * @author 55289
 */
public class BonusAniversario implements Bonus{

    @Override
    public boolean verificaBonus(LocalDate data) {
        if (data.getMonth().getValue() > 4 && data.getMonth().getValue() < 11) {
            return true;
        }
        return false;
    }
    
}
