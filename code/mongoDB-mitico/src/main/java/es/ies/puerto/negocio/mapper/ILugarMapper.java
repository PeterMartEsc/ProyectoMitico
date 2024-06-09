package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Lugar;
import es.ies.puerto.negocio.dto.LugarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ILugarMapper {

    ILugarMapper INSTANCE = Mappers.getMapper(ILugarMapper.class);

    Lugar dtoToEntity (LugarDTO lugarDTO);
    LugarDTO entityToDto (Lugar lugar);
}
