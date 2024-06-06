package es.ies.puerto.modelo.impl;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestiaTest extends Utilities {
    Bestia bestia;

    @BeforeEach
    public void beforeEach(){
        bestia = new Bestia();
    }

    @Test
    public void constructorNotNullTest(){
        Assertions.assertNotNull(bestia);

        Bestia bestiaId = new Bestia(id);
        Assertions.assertNotNull(bestiaId);

        Bestia bestiaFull = new Bestia(id, nombre, cualidad);
        Assertions.assertNotNull(bestiaFull);
    }

    @Test
    public void getSetOkTest(){
        bestia.setId(id);
        bestia.setNombre(nombre);
        bestia.setCualidad(cualidad);

        Assertions.assertEquals(id, bestia.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, bestia.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(cualidad, bestia.getCualidad(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){
        Bestia bestia1 = new Bestia(id);
        Bestia bestia2 = new Bestia(id);
        Bestia diosDiff = new Bestia(2);
        String bestiaString = "bestiaString";

        Assertions.assertEquals(bestia1.hashCode(), bestia2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(bestia1, bestia2, MESSAGE_ERROR);
        Assertions.assertNotEquals(bestia1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(bestia1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(bestia1, bestiaString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){
        bestia = new Bestia(id, nombre, cualidad);

        Assertions.assertTrue(bestia.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(bestia.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(bestia.toString().contains(cualidad), MESSAGE_ERROR);
    }
}
