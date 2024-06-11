package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Lugar;
import es.ies.puerto.negocio.dto.LugarDTO;
import es.ies.puerto.negocio.mapper.struct.ILugarMapper;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LugarMapperTest extends Utilities {

    Lugar lugar;

    LugarDTO lugarDTO;


    @BeforeEach
    public void beforeEach(){
        lugar = new Lugar();
        lugarDTO = new LugarDTO();
    }

    @Test
    public void mapperStructOkTest(){
        lugar = new Lugar(id);
        lugarDTO = new LugarDTO(id);

        Assertions.assertEquals(lugar, ILugarMapper.INSTANCE.dtoToEntity(lugarDTO));
        Assertions.assertEquals(lugarDTO, ILugarMapper.INSTANCE.entityToDto(lugar));
    }
}
