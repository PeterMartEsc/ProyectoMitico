package es.ies.puerto.negocio.dto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LugarDtoTest extends Utilities {

    LugarDTO lugarDTO;

    @BeforeEach
    public void beforeEach(){
        lugarDTO = new LugarDTO();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(lugarDTO);

        LugarDTO diosId = new LugarDTO(id);
        Assertions.assertNotNull(diosId);

        LugarDTO diosFull = new LugarDTO(id, nombre, concepto);
        Assertions.assertNotNull(diosFull);
    }

    @Test
    public void getSetOkTest(){

        lugarDTO.setId(id);
        lugarDTO.setNombre(nombre);
        lugarDTO.setLocalizacion(concepto);

        Assertions.assertEquals(id, lugarDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, lugarDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(concepto, lugarDTO.getLocalizacion(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        LugarDTO dios1 = new LugarDTO(id);
        LugarDTO dios2 = new LugarDTO(id);
        LugarDTO diosDiff = new LugarDTO(2);
        String diosString = "diosString";

        Assertions.assertEquals(dios1.hashCode(), dios2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dios1, dios2, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        lugarDTO = new LugarDTO(id, nombre, concepto);

        Assertions.assertTrue(lugarDTO.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(lugarDTO.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(lugarDTO.toString().contains(concepto), MESSAGE_ERROR);
    }
}
