package es.ies.puerto.modelo.impl;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LugarTest extends Utilities {
    Lugar lugar;

    @BeforeEach
    public void beforeEach(){
        lugar = new Lugar();
    }

    @Test
    public void constructorNotNullTest(){
        Assertions.assertNotNull(lugar);

        Lugar lugarId = new Lugar(id);
        Assertions.assertNotNull(lugarId);

        Lugar lugarFull = new Lugar(id, nombre, cualidad);
        Assertions.assertNotNull(lugarFull);
    }

    @Test
    public void getSetOkTest(){
        lugar.setId(id);
        lugar.setNombre(nombre);
        lugar.setLocalizacion(localizacion);

        Assertions.assertEquals(id, lugar.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, lugar.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(localizacion, lugar.getLocalizacion(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){
        Lugar lugar1 = new Lugar(id);
        Lugar lugar2 = new Lugar(id);
        Lugar diosDiff = new Lugar(2);
        String lugarString = "lugarString";

        Assertions.assertEquals(lugar1.hashCode(), lugar2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(lugar1, lugar2, MESSAGE_ERROR);
        Assertions.assertNotEquals(lugar1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(lugar1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(lugar1, lugarString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){
        lugar = new Lugar(id, nombre, localizacion);

        Assertions.assertTrue(lugar.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(lugar.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(lugar.toString().contains(localizacion), MESSAGE_ERROR);
    }
}
