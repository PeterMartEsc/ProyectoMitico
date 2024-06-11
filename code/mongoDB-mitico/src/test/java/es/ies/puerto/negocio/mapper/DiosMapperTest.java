package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Dios;
import es.ies.puerto.negocio.dto.DiosDTO;
import es.ies.puerto.negocio.mapper.struct.IDiosMapper;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiosMapperTest extends Utilities {

    Dios dios;

    DiosDTO diosDTO;


    @BeforeEach
    public void beforeEach(){
        dios = new Dios();
        diosDTO = new DiosDTO();
    }

    @Test
    public void mapperStructOkTest(){
        dios = new Dios(id);
        diosDTO = new DiosDTO(id);

        Assertions.assertEquals(dios, IDiosMapper.INSTANCE.dtoToEntity(diosDTO));
        Assertions.assertEquals(diosDTO, IDiosMapper.INSTANCE.entityToDto(dios));
    }
}
