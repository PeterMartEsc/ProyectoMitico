package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Procedencia;
import es.ies.puerto.negocio.dto.ProcedenciaDTO;
import es.ies.puerto.negocio.mapper.struct.IProcedenciaMapper;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcedenciaMapperTest extends Utilities {

    Procedencia procedencia;

    ProcedenciaDTO procedenciaDTO;


    @BeforeEach
    public void beforeEach(){
        procedencia = new Procedencia();
        procedenciaDTO = new ProcedenciaDTO();
    }

    @Test
    public void mapperStructOkTest(){
        procedencia = new Procedencia(id);
        procedenciaDTO = new ProcedenciaDTO(id);

        Assertions.assertEquals(procedencia, IProcedenciaMapper.INSTANCE.dtoToEntity(procedenciaDTO));
        Assertions.assertEquals(procedenciaDTO, IProcedenciaMapper.INSTANCE.entityToDto(procedencia));
    }
}
