package es.ies.puerto.negocio.dto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SucesoDtoTest extends Utilities {

    SucesoDTO sucesoDTO;

    @BeforeEach
    public void beforeEach(){
        sucesoDTO = new SucesoDTO();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(sucesoDTO);

        SucesoDTO diosId = new SucesoDTO(id);
        Assertions.assertNotNull(diosId);

        SucesoDTO diosFull = new SucesoDTO(id, nombre, concepto);
        Assertions.assertNotNull(diosFull);
    }

    @Test
    public void getSetOkTest(){

        sucesoDTO.setId(id);
        sucesoDTO.setNombre(nombre);
        sucesoDTO.setDescripcion(concepto);

        Assertions.assertEquals(id, sucesoDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, sucesoDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(concepto, sucesoDTO.getDescripcion(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        SucesoDTO dios1 = new SucesoDTO(id);
        SucesoDTO dios2 = new SucesoDTO(id);
        SucesoDTO diosDiff = new SucesoDTO(2);
        String diosString = "diosString";

        Assertions.assertEquals(dios1.hashCode(), dios2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dios1, dios2, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        sucesoDTO = new SucesoDTO(id, nombre, concepto);

        Assertions.assertTrue(sucesoDTO.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(sucesoDTO.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(sucesoDTO.toString().contains(concepto), MESSAGE_ERROR);
    }
}
