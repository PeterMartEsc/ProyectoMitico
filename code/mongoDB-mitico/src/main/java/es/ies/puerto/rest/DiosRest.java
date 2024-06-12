package es.ies.puerto.rest;

import es.ies.puerto.negocio.dto.DiosDTO;
import es.ies.puerto.rest.interfaces.IRest;
import es.ies.puerto.service.DiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Operaciones DAO REST de la clase Dios
 */
@RestController
@RequestMapping("/dios")
public class DiosRest implements IRest <DiosDTO> {
    DiosService diosService;

    public DiosRest() {
    }

    public DiosRest (DiosService diosService) {
        this.diosService = diosService;
    }
    @Autowired
    public void setDiosService(DiosService diosService) {
        this.diosService = diosService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody DiosDTO diosDTO) {
        diosService.addOrUpdateCollection(diosDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody DiosDTO diosDTO) {
        diosService.addOrUpdateCollection(diosDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<DiosDTO>> getAll() {
        return ResponseEntity.ok(diosService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<DiosDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(diosService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        diosService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
