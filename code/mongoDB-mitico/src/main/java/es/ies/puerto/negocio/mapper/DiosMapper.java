package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Dios;
import es.ies.puerto.negocio.dto.DiosDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiosMapper {
    DiosMapper INSTANCE = Mappers.getMapper(DiosMapper.class);

    Dios dtoToEntity (DiosDTO diosDTO);
    DiosDTO entityToDto (Dios dios);
}
