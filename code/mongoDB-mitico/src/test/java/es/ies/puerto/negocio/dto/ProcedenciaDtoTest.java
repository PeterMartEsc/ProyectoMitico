package es.ies.puerto.negocio.dto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcedenciaDtoTest extends Utilities {

    ProcedenciaDTO procedenciaDTO;

    @BeforeEach
    public void beforeEach(){
        procedenciaDTO = new ProcedenciaDTO();
    }

    @Test
    public void constructorNotNullTest(){

        Assertions.assertNotNull(procedenciaDTO);

        ProcedenciaDTO diosId = new ProcedenciaDTO(id);
        Assertions.assertNotNull(diosId);

        ProcedenciaDTO diosFull = new ProcedenciaDTO(id, nombre, concepto);
        Assertions.assertNotNull(diosFull);
    }

    @Test
    public void getSetOkTest(){

        procedenciaDTO.setId(id);
        procedenciaDTO.setNombre(nombre);
        procedenciaDTO.setAnios(concepto);

        Assertions.assertEquals(id, procedenciaDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombre, procedenciaDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(concepto, procedenciaDTO.getAnios(), MESSAGE_ERROR);
    }

    @Test
    public void equalsOkTest(){

        ProcedenciaDTO dios1 = new ProcedenciaDTO(id);
        ProcedenciaDTO dios2 = new ProcedenciaDTO(id);
        ProcedenciaDTO diosDiff = new ProcedenciaDTO(2);
        String diosString = "diosString";

        Assertions.assertEquals(dios1.hashCode(), dios2.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dios1, dios2, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosDiff, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, null, MESSAGE_ERROR);
        Assertions.assertNotEquals(dios1, diosString, MESSAGE_ERROR);
    }

    @Test
    public void toStringOkTest(){

        procedenciaDTO = new ProcedenciaDTO(id, nombre, concepto);

        Assertions.assertTrue(procedenciaDTO.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
        Assertions.assertTrue(procedenciaDTO.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(procedenciaDTO.toString().contains(concepto), MESSAGE_ERROR);
    }
}
