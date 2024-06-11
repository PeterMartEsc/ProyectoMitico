package es.ies.puerto.rest;

import es.ies.puerto.negocio.dto.BestiaDTO;
import es.ies.puerto.rest.interfaces.IRest;
import es.ies.puerto.service.BestiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Operaciones DAO REST de la clase Bestia
 */
@RestController
@RequestMapping("/bestia")
public class BestiaRest implements IRest <BestiaDTO> {
    private BestiaService bestiaService;

    public BestiaRest() {
    }

    public BestiaRest (BestiaService bestiaService) {
        this.bestiaService = bestiaService;
    }
    @Autowired
    public void setBestiaService(BestiaService bestiaService) {
        this.bestiaService = bestiaService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody BestiaDTO bestiaDTO) {
        bestiaService.addToCollection(bestiaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody BestiaDTO bestiaDTO) {
        bestiaService.updateCollection(bestiaDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<BestiaDTO>> getAll() {
        return ResponseEntity.ok(bestiaService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BestiaDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(bestiaService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        bestiaService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
