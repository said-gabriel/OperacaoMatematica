/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.avlimites.tests;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import br.ufes.avlimites.models.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


/**
 *
 * @author biel-
 */
class TestCliente {
    
    public TestCliente() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    void CT04(){
        
        String expected = "Está participando do sorteio!";
        Cliente c1 = new Cliente(LocalDate.parse("1978-05-12"), "Kevin Garnet", "11125836912");
        
        String expected2 = "Não está participando do sorteio!";
        Cliente c2 =  new Cliente(LocalDate.parse("1936-11-09"), "LeBron James", "85436979411");
        
        assertEquals(expected,c1.sorteioAniversario());
        assertEquals(expected2,c2.sorteioAniversario());
    }
    @Test 
    void CT06(){
        
        LocalDate dataEsperada = LocalDate.parse("1978-05-12");
        String nomeEsperado = "Kevin Garnet";
        String cpfEsperado = "11125836912";
        
        Cliente c1 = new Cliente(LocalDate.parse("1978-05-12"), "Kevin Garnet", "11125836912");
        
        assertEquals(dataEsperada,c1.getDataAniversario());
        assertEquals(nomeEsperado,c1.getNome());
        assertEquals(cpfEsperado, c1.getCpf());
        
        
    }
    
}
