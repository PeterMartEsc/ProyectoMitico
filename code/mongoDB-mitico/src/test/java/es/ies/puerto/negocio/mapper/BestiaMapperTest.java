package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Bestia;
import es.ies.puerto.negocio.dto.BestiaDTO;
import es.ies.puerto.negocio.mapper.struct.IBestiaMapper;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestiaMapperTest extends Utilities {

    Bestia bestia;

    BestiaDTO bestiaDTO;


    @BeforeEach
    public void beforeEach(){
        bestia = new Bestia();
        bestiaDTO = new BestiaDTO();
    }

    @Test
    public void mapperStructOkTest(){
        bestia = new Bestia(id);
        bestiaDTO = new BestiaDTO(id);

        Assertions.assertEquals(bestia, IBestiaMapper.INSTANCE.dtoToEntity(bestiaDTO));
        Assertions.assertEquals(bestiaDTO, IBestiaMapper.INSTANCE.entityToDto(bestia));
    }
}
