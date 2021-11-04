import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {

    Figura circulo;
    Figura quadrado;

    @BeforeEach
    void doBefore(){
        circulo = new Circulo(5);
        quadrado = new Quadrado(2);
    }
    @Test
    void perimetroCirculo(){
        assertEquals(31.41592653589793,circulo.calcularPerimetro());
    }
    @Test
    void perimetroQuadrado(){
        assertEquals(8,quadrado.calcularPerimetro());
    }
}
