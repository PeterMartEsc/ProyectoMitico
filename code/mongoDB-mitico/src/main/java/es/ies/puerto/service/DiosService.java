package es.ies.puerto.service;

import es.ies.puerto.modelo.db.dao.DaoDios;
import es.ies.puerto.modelo.impl.Dios;
import es.ies.puerto.negocio.dto.DiosDTO;
import es.ies.puerto.negocio.mapper.struct.IDiosMapper;
import es.ies.puerto.service.interfaces.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Operaciones DAO-Service de la clase Dios
 */
@Service
public class DiosService implements IService<DiosDTO> {
    private final static Logger LOGGER = LoggerFactory.getLogger(DiosService.class);

    private DaoDios daoDios;

    @Autowired
    public void setDaoDios(DaoDios daoDios) {
        this.daoDios = daoDios;
    }

    @Override
    public List<DiosDTO> getAllFromCollection() {
        List<DiosDTO> equipmentDTOList = new ArrayList<>();
        for (Dios dios : daoDios.findAll()) {
            equipmentDTOList.add(IDiosMapper.INSTANCE.entityToDto(dios));
        }
        return equipmentDTOList;
    }

    @Override
    public DiosDTO getByIdFromCollection(int id) {
        Dios dios = daoDios.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        return IDiosMapper.INSTANCE.entityToDto(dios);
    }

    @Override
    public void addToCollection(DiosDTO diosDTO) {
        daoDios.insert(IDiosMapper.INSTANCE.dtoToEntity(diosDTO));
    }

    @Override
    public void deleteFromCollection(int id) {
        Dios equipment = daoDios.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        daoDios.delete(equipment);
    }

    @Override
    public void updateCollection(DiosDTO diosDTO) {
        Dios dios = daoDios.findById(diosDTO.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find " + diosDTO.getNombre() + " entity"));

        dios = IDiosMapper.INSTANCE.dtoToEntity(diosDTO);

        daoDios.save(dios);
    }
}
