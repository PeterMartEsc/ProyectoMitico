package es.ies.puerto.modelo.impl;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SucesoTest extends Utilities {
    Suceso suceso;

    @BeforeEach
    public void beforeEach(){
        suceso = new Suceso();
    }

    @Test
    public void constructorNotNullTest(){
        Assertions.assertNotNull(suceso);

        Suceso lugarId = new Suceso(id);
        Assertions.assertNotNull(lugarId);

        Suceso lugarFull = new Suceso(id, nombre, cualidad);
        Assertions.assertNotNull(lugarFull);
    }

    @Test
    public void getSetOkTest(){
        suceso.setId(id);
        suceso.setNombre(nombre);
        suceso.setDescripcion(descripcion);

        Assertions.assertEquals(id, suceso.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, suceso.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(descripcion, suceso.getDescripcion(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){
        Suceso suceso1 = new Suceso(id);
        Suceso suceso2 = new Suceso(id);
        Suceso lugarDiff = new Suceso(2);
        String sucesoString = "sucesoString";

        Assertions.assertEquals(suceso1.hashCode(), suceso2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(suceso1, suceso2, MESSAGE_ERROR);
        Assertions.assertNotEquals(suceso1, lugarDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(suceso1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(suceso1, sucesoString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){
        suceso = new Suceso(id, nombre, descripcion);

        Assertions.assertTrue(suceso.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(suceso.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(suceso.toString().contains(descripcion), MESSAGE_ERROR);
    }
}
