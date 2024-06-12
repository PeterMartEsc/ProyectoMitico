package es.ies.puerto.service;

import es.ies.puerto.modelo.db.dao.DaoLugar;
import es.ies.puerto.modelo.impl.Lugar;
import es.ies.puerto.negocio.dto.BestiaDTO;
import es.ies.puerto.negocio.dto.LugarDTO;
import es.ies.puerto.negocio.mapper.struct.IBestiaMapper;
import es.ies.puerto.negocio.mapper.struct.ILugarMapper;
import es.ies.puerto.service.interfaces.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Operaciones DAO-Service de la clase Lugar
 */
@Service
public class LugarService implements IService<LugarDTO> {
    private final static Logger LOGGER = LoggerFactory.getLogger(LugarService.class);

    private DaoLugar daoLugar;

    @Autowired
    public void setDaoLugar(DaoLugar daoLugar) {
        this.daoLugar = daoLugar;
    }

    @Override
    public List<LugarDTO> getAllFromCollection() {
        List<LugarDTO> equipmentDTOList = new ArrayList<>();
        for (Lugar lugar : daoLugar.findAll()) {
            equipmentDTOList.add(ILugarMapper.INSTANCE.entityToDto(lugar));
        }
        return equipmentDTOList;
    }

    @Override
    public LugarDTO getByIdFromCollection(int id) {
        Lugar lugar = daoLugar.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        return ILugarMapper.INSTANCE.entityToDto(lugar);
    }

    @Override
    public void addOrUpdateCollection(LugarDTO lugarDTO) {
        if (!daoLugar.existsById(lugarDTO.getId())) {
            daoLugar.insert(ILugarMapper.INSTANCE.dtoToEntity(lugarDTO));
        } else {
            daoLugar.save(ILugarMapper.INSTANCE.dtoToEntity(lugarDTO));
        }
    }
    @Override
    public void deleteFromCollection(int id) {
        Lugar equipment = daoLugar.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        daoLugar.delete(equipment);
    }
}
