package com.springBootTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnit {

    @Test
    public void testUnit() {
        TestController test = new TestController();
        String result = test.msg("TESTE FINALIZADO COM SUCESSO!!!");
        assertEquals("Bem vindo ao teste, TESTE FINALIZADO COM SUCESSO!!!", result);
    }
}
