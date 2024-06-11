package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Suceso;
import es.ies.puerto.negocio.dto.SucesoDTO;
import es.ies.puerto.negocio.mapper.struct.ISucesoMapper;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SucesoMapperTest extends Utilities {

    Suceso suceso;

    SucesoDTO sucesoDTO;


    @BeforeEach
    public void beforeEach(){
        suceso = new Suceso();
        sucesoDTO = new SucesoDTO();
    }

    @Test
    public void mapperStructOkTest(){
        suceso = new Suceso(id);
        sucesoDTO = new SucesoDTO(id);

        Assertions.assertEquals(suceso, ISucesoMapper.INSTANCE.dtoToEntity(sucesoDTO));
        Assertions.assertEquals(sucesoDTO, ISucesoMapper.INSTANCE.entityToDto(suceso));
    }
}
