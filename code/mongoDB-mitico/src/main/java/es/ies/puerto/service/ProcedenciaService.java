package es.ies.puerto.service;

import es.ies.puerto.modelo.db.dao.DaoProcedencia;
import es.ies.puerto.modelo.impl.Procedencia;
import es.ies.puerto.negocio.dto.ProcedenciaDTO;
import es.ies.puerto.negocio.mapper.struct.IProcedenciaMapper;
import es.ies.puerto.service.interfaces.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Operaciones DAO-Service de la clase Procedencia
 */
@Service
public class ProcedenciaService implements IService<ProcedenciaDTO> {
    private final static Logger LOGGER = LoggerFactory.getLogger(ProcedenciaService.class);

    private DaoProcedencia daoProcedencia;

    @Autowired
    public void setDaoProcedenciaDao(DaoProcedencia daoProcedencia) {
        this.daoProcedencia = daoProcedencia;
    }

    @Override
    public List<ProcedenciaDTO> getAllFromCollection() {
        List<ProcedenciaDTO> equipmentDTOList = new ArrayList<>();
        for (Procedencia procedencia : daoProcedencia.findAll()) {
            equipmentDTOList.add(IProcedenciaMapper.INSTANCE.entityToDto(procedencia));
        }
        return equipmentDTOList;
    }

    @Override
    public ProcedenciaDTO getByIdFromCollection(int id) {
        Procedencia procedencia = daoProcedencia.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        return IProcedenciaMapper.INSTANCE.entityToDto(procedencia);
    }

    @Override
    public void addToCollection(ProcedenciaDTO procedenciaDTO) {
        daoProcedencia.insert(IProcedenciaMapper.INSTANCE.dtoToEntity(procedenciaDTO));
    }

    @Override
    public void deleteFromCollection(int id) {
        Procedencia equipment = daoProcedencia.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        daoProcedencia.delete(equipment);
    }

    @Override
    public void updateCollection(ProcedenciaDTO procedenciaDTO) {
        Procedencia procedencia = daoProcedencia.findById(procedenciaDTO.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find " + procedenciaDTO.getNombre() + " entity"));

        procedencia = IProcedenciaMapper.INSTANCE.dtoToEntity(procedenciaDTO);

        daoProcedencia.save(procedencia);
    }
}
