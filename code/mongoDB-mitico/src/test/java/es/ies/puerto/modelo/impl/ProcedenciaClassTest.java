package es.ies.puerto.modelo.impl;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcedenciaClassTest extends Utilities {

    Procedencia procedencia;

    @BeforeEach
    public void beforeEach(){
        procedencia = new Procedencia();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(procedencia);

        Procedencia procedenciaId = new Procedencia(id);
        Assertions.assertNotNull(procedenciaId);

        Procedencia procedenciaFull = new Procedencia(id, nombre, anios);
        Assertions.assertNotNull(procedenciaFull);
    }

    @Test
    public void getSetOkTest(){

        procedencia.setId(id);
        procedencia.setNombre(nombre);
        procedencia.setAnios(anios);

        Assertions.assertEquals(id, procedencia.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, procedencia.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(anios, procedencia.getAnios(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        Procedencia procedencia1 = new Procedencia(id);
        Procedencia procedencia2 = new Procedencia(id);
        Procedencia procedenciaDiff = new Procedencia(2);
        String procedenciaString = "procedenciaString";

        Assertions.assertEquals(procedencia1.hashCode(), procedencia2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(procedencia1, procedencia2, MESSAGE_ERROR);
        Assertions.assertNotEquals(procedencia1, procedenciaDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(procedencia1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(procedencia1, procedenciaString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        procedencia = new Procedencia(id, nombre, anios);

        Assertions.assertTrue(procedencia.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(procedencia.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(procedencia.toString().contains(anios), MESSAGE_ERROR);
    }
}
