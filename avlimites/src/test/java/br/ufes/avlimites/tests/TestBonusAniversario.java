package br.ufes.avlimites.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.ufes.avlimites.models.BonusAniversario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import br.ufes.avlimites.interfaces.IBonus;
import br.ufes.avlimites.models.Cliente;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 55289
 */
class TestBonusAniversario {

    public TestBonusAniversario() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    //teste para o metodo verificaBonus
    @ParameterizedTest
    @MethodSource("clienteProviderFalse")
    void CT01(Cliente cliente) {
        IBonus exemplo = new BonusAniversario();
        assertEquals(false, exemplo.verificaBonus(cliente));
    }

    //gera os valores para o teste, cujos valores são os limites superiores e inferiores
    private static Stream clienteProviderFalse() {
        String data1 = "1958-04-09";
        String data2 = "1936-11-09";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date1 = LocalDate.parse(data1, formatter);
        LocalDate date2 = LocalDate.parse(data2, formatter);

        Cliente c1 = new Cliente(date1, "", "22233304767");
        Cliente c2 = new Cliente(date2, "", "22233304767");

        return Stream.of(
                Arguments.of(c1),
                Arguments.of(c2)
        );
    }

    //teste para o metodo verificaBonus
    @ParameterizedTest
    @MethodSource("clienteProviderTrue")
    void CT02(Cliente cliente) {
        IBonus exemplo = new BonusAniversario();
        assertEquals(true, exemplo.verificaBonus(cliente));
    }

    //gera os valores para o teste verdadeiro
    private static Stream clienteProviderTrue() {

        String data1 = "1972-05-09";
        String data2 = "1988-10-09";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date1 = LocalDate.parse(data1, formatter);
        LocalDate date2 = LocalDate.parse(data2, formatter);

        Cliente c1 = new Cliente(date1, "", "22233304767");
        Cliente c2 = new Cliente(date2, "", "22233304767");

        return Stream.of(
                Arguments.of(c1),
                Arguments.of(c2)
        );
    }

    @Test
    void CT03() {

        String data1 = "1988-10-09";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(data1, formatter);

        IllegalArgumentException assertThrows;
        assertThrows = assertThrows(IllegalArgumentException.class, () -> {
            new Cliente(date1, "", "123");
        });
    }
    
}
