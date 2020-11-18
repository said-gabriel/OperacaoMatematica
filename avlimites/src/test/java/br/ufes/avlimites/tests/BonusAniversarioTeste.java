package br.ufes.avlimites.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.ufes.avlimites.interfaces.Bonus;
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

/**
 *
 * @author 55289
 */
public class BonusAniversarioTeste {

    public BonusAniversarioTeste() {
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
    @MethodSource("dataProvider")
    void CT01(LocalDate data) {
        Bonus exemplo = new BonusAniversario();
        assertEquals(exemplo.verificaBonus(data), true);
    }

    //gera os valores para o teste
    private static Stream dataProvider() {
        String data1 = "1958-4-09";
        String data2 = "1972-5-09";
        String data3 = "1988-10-09";
        String data4 = "1936-11-09";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(data1, formatter);
        LocalDate date2 = LocalDate.parse(data2, formatter);
        LocalDate date3 = LocalDate.parse(data3, formatter);
        LocalDate date4 = LocalDate.parse(data4, formatter);
        
        return Stream.of(
                Arguments.of(date1),//false - limite inferior
                Arguments.of(date2),//true
                Arguments.of(date3),//true
                Arguments.of(date4)//false - limite superior
        );
    }
}
