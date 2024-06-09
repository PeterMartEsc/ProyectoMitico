package es.ies.puerto.negocio.dto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiosDtoTest extends Utilities {

    DiosDTO diosDTO;

    @BeforeEach
    public void beforeEach(){
        diosDTO = new DiosDTO();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(diosDTO);

        DiosDTO diosId = new DiosDTO(id);
        Assertions.assertNotNull(diosId);

        DiosDTO diosFull = new DiosDTO(id, nombre, concepto);
        Assertions.assertNotNull(diosFull);
    }

    @Test
    public void getSetOkTest(){

        diosDTO.setId(id);
        diosDTO.setNombre(nombre);
        diosDTO.setConcepto(concepto);

        Assertions.assertEquals(id, diosDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, diosDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(concepto, diosDTO.getConcepto(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        DiosDTO dios1 = new DiosDTO(id);
        DiosDTO dios2 = new DiosDTO(id);
        DiosDTO diosDiff = new DiosDTO(2);
        String diosString = "diosString";

        Assertions.assertEquals(dios1.hashCode(), dios2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dios1, dios2, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        diosDTO = new DiosDTO(id, nombre, concepto);

        Assertions.assertTrue(diosDTO.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(diosDTO.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(diosDTO.toString().contains(concepto), MESSAGE_ERROR);
    }
}
