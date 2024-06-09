package es.ies.puerto.negocio.dto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestiaDtoTest extends Utilities {

    BestiaDTO bestiaDTO;

    @BeforeEach
    public void beforeEach(){
        bestiaDTO = new BestiaDTO();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(bestiaDTO);

        BestiaDTO diosId = new BestiaDTO(id);
        Assertions.assertNotNull(diosId);

        BestiaDTO diosFull = new BestiaDTO(id, nombre, concepto);
        Assertions.assertNotNull(diosFull);
    }

    @Test
    public void getSetOkTest(){

        bestiaDTO.setId(id);
        bestiaDTO.setNombre(nombre);
        bestiaDTO.setConcepto(concepto);

        Assertions.assertEquals(id, bestiaDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, bestiaDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(concepto, bestiaDTO.getConcepto(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        BestiaDTO dios1 = new BestiaDTO(id);
        BestiaDTO dios2 = new BestiaDTO(id);
        BestiaDTO diosDiff = new BestiaDTO(2);
        String diosString = "diosString";

        Assertions.assertEquals(dios1.hashCode(), dios2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dios1, dios2, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        bestiaDTO = new BestiaDTO(id, nombre, concepto);

        Assertions.assertTrue(bestiaDTO.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(bestiaDTO.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(bestiaDTO.toString().contains(concepto), MESSAGE_ERROR);
    }
}
