package es.ies.puerto.rest;

import es.ies.puerto.negocio.dto.ProcedenciaDTO;
import es.ies.puerto.rest.interfaces.IRest;
import es.ies.puerto.service.ProcedenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Operaciones DAO REST de la clase Procedimiento
 */
@RestController
@RequestMapping("/procedencia")
public class ProcedenciaRest implements IRest <ProcedenciaDTO> {
    ProcedenciaService procedenciaService;

    public ProcedenciaRest() {
    }

    public ProcedenciaRest (ProcedenciaService procedenciaService) {
        this.procedenciaService = procedenciaService;
    }
    @Autowired
    public void setProcedenciaService(ProcedenciaService procedenciaService) {
        this.procedenciaService = procedenciaService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody ProcedenciaDTO procedenciaDTO) {
        procedenciaService.addToCollection(procedenciaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody ProcedenciaDTO procedenciaDTO) {
        procedenciaService.updateCollection(procedenciaDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<ProcedenciaDTO>> getAll() {
        return ResponseEntity.ok(procedenciaService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ProcedenciaDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(procedenciaService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        procedenciaService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
