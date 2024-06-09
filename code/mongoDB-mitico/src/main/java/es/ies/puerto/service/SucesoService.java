package es.ies.puerto.service;

import es.ies.puerto.modelo.db.dao.DaoSuceso;
import es.ies.puerto.modelo.impl.Suceso;
import es.ies.puerto.negocio.dto.SucesoDTO;
import es.ies.puerto.negocio.mapper.ISucesoMapper;
import es.ies.puerto.service.interfaces.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SucesoService implements IService<SucesoDTO> {
    private final static Logger LOGGER = LoggerFactory.getLogger(SucesoService.class);

    private DaoSuceso daoSuceso;

    @Autowired
    public void setDaoSuceso(DaoSuceso daoSuceso) {
        this.daoSuceso = daoSuceso;
    }

    @Override
    public List<SucesoDTO> getAllFromCollection() {
        List<SucesoDTO> equipmentDTOList = new ArrayList<>();
        for (Suceso suceso : daoSuceso.findAll()) {
            equipmentDTOList.add(ISucesoMapper.INSTANCE.entityToDto(suceso));
        }
        return equipmentDTOList;
    }

    @Override
    public SucesoDTO getByIdFromCollection(int id) {
        Suceso suceso = daoSuceso.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        return ISucesoMapper.INSTANCE.entityToDto(suceso);
    }

    @Override
    public void addToCollection(SucesoDTO sucesoDTO) {
        daoSuceso.insert(ISucesoMapper.INSTANCE.dtoToEntity(sucesoDTO));
    }

    @Override
    public void deleteFromCollection(int id) {
        Suceso equipment = daoSuceso.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find '" + id + "' entity"));
        daoSuceso.delete(equipment);
    }

    @Override
    public void updateCollection(SucesoDTO sucesoDTO) {
        Suceso suceso = daoSuceso.findById(sucesoDTO.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find " + sucesoDTO.getNombre() + " entity"));

        suceso = ISucesoMapper.INSTANCE.dtoToEntity(sucesoDTO);

        daoSuceso.save(suceso);
    }
}
