/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.avlimites.main;

import br.ufes.avlimites.models.Cliente;
import java.time.LocalDate;

/**
 *
 * @author 55289
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente(LocalDate.parse("1972-05-09"), "Kevin Durant", "25748657789");
        System.out.printf(c1.sorteioAniversario());
    }

}
