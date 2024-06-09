package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.impl.Procedencia;
import es.ies.puerto.negocio.dto.ProcedenciaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IProcedenciaMapper {

    IProcedenciaMapper INSTANCE = Mappers.getMapper(IProcedenciaMapper.class);

    Procedencia dtoToEntity (ProcedenciaDTO procedenciaDTO);
    ProcedenciaDTO entityToDto (Procedencia procedencia);
}
