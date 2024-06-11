package es.ies.puerto.negocio.mapper.struct;

import es.ies.puerto.modelo.impl.Bestia;
import es.ies.puerto.negocio.dto.BestiaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper de Bestia a BestiaDto
 */
@Mapper
public interface IBestiaMapper {
    IBestiaMapper INSTANCE = Mappers.getMapper(IBestiaMapper.class);

    Bestia dtoToEntity (BestiaDTO bestiaDTO);
    BestiaDTO entityToDto (Bestia bestia);
}
