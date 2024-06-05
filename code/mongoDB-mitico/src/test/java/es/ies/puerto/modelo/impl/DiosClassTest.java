package es.ies.puerto.modelo.impl;

import es.ies.puerto.utilities.UtilitiesVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiosClassTest implements UtilitiesVariables {

    Dios dios;

    @BeforeEach
    public void beforeEach(){
        dios = new Dios();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(dios);

        Dios diosId = new Dios(id);
        Assertions.assertNotNull(diosId);

        Dios diosFull = new Dios(id, nombre, concepto);
        Assertions.assertNotNull(diosFull);
    }

    @Test
    public void getSetOkTest(){

        dios.setId(id);
        dios.setNombre(nombre);
        dios.setConcepto(concepto);

        Assertions.assertEquals(id, dios.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, dios.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(concepto, dios.getConcepto(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        Dios dios1 = new Dios(id);
        Dios dios2 = new Dios(id);
        Dios diosDiff = new Dios(2);
        String diosString = "diosString";

        Assertions.assertEquals(dios1.hashCode(), dios2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dios1, dios2, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        dios = new Dios(id, nombre, concepto);

        Assertions.assertTrue(dios.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(dios.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(dios.toString().contains(concepto), MESSAGE_ERROR);
    }
}