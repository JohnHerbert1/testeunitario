package testeunitario.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ExemploServiceTest {
    @Test
    void testeSomarValorVerificarSeIgualENaoIgual(){

        ExemploService exemploService = new ExemploService();
        int resultado = 6;

        int resultadoReal = exemploService.somaValores(2, 4);

        Assertions.assertEquals(resultado,resultadoReal, "2 + 4 deve ser 6");

    }

}
