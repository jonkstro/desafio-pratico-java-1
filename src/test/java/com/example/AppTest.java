package com.example;

import org.junit.jupiter.api.Test;

import com.example.models.Disciplina;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testMediaNotasDisciplina() {
        final double nota1 = 7.5;
        final double nota2 = 7.5;
        final double nota3 = 7.5;
        final double nota4 = 7.5;
        final String nome = "Português";

        Disciplina d = new Disciplina(nome, nota1, nota2, nota3, nota4);

        final double actual = d.getMediaNotas();
        final double expected = 7.5;

        assertEquals(expected, actual);
    }
}
