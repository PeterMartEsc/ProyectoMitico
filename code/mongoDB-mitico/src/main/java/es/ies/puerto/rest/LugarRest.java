package es.ies.puerto.rest;

import es.ies.puerto.negocio.dto.LugarDTO;
import es.ies.puerto.rest.interfaces.IRest;
import es.ies.puerto.service.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Operaciones DAO REST de la clase Lugar
 */
@RestController
@RequestMapping("/lugar")
public class LugarRest implements IRest <LugarDTO> {
    LugarService lugarService;

    public LugarRest() {
    }

    public LugarRest (LugarService lugarService) {
        this.lugarService = lugarService;
    }
    @Autowired
    public void setLugarService(LugarService lugarService) {
        this.lugarService = lugarService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody LugarDTO lugarDTO) {
        lugarService.addToCollection(lugarDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody LugarDTO lugarDTO) {
        lugarService.updateCollection(lugarDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<LugarDTO>> getAll() {
        return ResponseEntity.ok(lugarService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<LugarDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(lugarService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        lugarService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
