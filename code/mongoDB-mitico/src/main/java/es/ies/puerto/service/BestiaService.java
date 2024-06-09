package es.ies.puerto.service;

import es.ies.puerto.modelo.db.dao.DaoBestia;
import es.ies.puerto.modelo.impl.Bestia;
import es.ies.puerto.negocio.dto.BestiaDTO;
import es.ies.puerto.negocio.mapper.IBestiaMapper;
import es.ies.puerto.service.interfaces.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BestiaService implements IService<BestiaDTO> {
    private final static Logger LOGGER = LoggerFactory.getLogger(BestiaService.class);

    private DaoBestia daoBestia;

    @Autowired
    public void setDaoBestiaDao(DaoBestia daoBestia) {
        this.daoBestia = daoBestia;
    }

    @Override
    public List<BestiaDTO> getAllFromCollection() {
        List<BestiaDTO> equipmentDTOList = new ArrayList<>();
        for (Bestia bestia : daoBestia.findAll()) {
            equipmentDTOList.add(IBestiaMapper.INSTANCE.entityToDto(bestia));
        }
        return equipmentDTOList;
    }

    @Override
    public BestiaDTO getByIdFromCollection(int id) {
        Bestia bestia = daoBestia.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        return IBestiaMapper.INSTANCE.entityToDto(bestia);
    }

    @Override
    public void addToCollection(BestiaDTO bestiaDTO) {
        daoBestia.insert(IBestiaMapper.INSTANCE.dtoToEntity(bestiaDTO));
    }

    @Override
    public void deleteFromCollection(int id) {
        Bestia equipment = daoBestia.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        daoBestia.delete(equipment);
    }

    @Override
    public void updateCollection(BestiaDTO bestiaDTO) {
        Bestia bestia = daoBestia.findById(bestiaDTO.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find " + bestiaDTO.getNombre() + " entity"));

        bestia = IBestiaMapper.INSTANCE.dtoToEntity(bestiaDTO);

        daoBestia.save(bestia);
    }
}
