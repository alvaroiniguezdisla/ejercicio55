package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Test_ej55 {

    //creame varios tests del metodo de taylor para los casos extremos
    @Test
    public void test_taylor() {
        assertEquals(1, ejercicio_55.taylor(0));
        assertEquals(2, ejercicio_55.taylor(1));
        assertEquals(3, ejercicio_55.taylor(2));
        assertEquals(4, ejercicio_55.taylor(3));

    }



}
