package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Suceso;
import es.ies.puerto.negocio.dto.SucesoDTO;
import org.mapstruct.factory.Mappers;

public interface ISucesoMapper {

    ISucesoMapper INSTANCE = Mappers.getMapper(ISucesoMapper.class);

    Suceso dtoToEntity (SucesoDTO sucesoDTO);
    SucesoDTO entityToDto (Suceso suceso);
}
