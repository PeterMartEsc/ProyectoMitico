package es.ies.puerto.rest;

import es.ies.puerto.negocio.dto.SucesoDTO;
import es.ies.puerto.rest.interfaces.IRest;
import es.ies.puerto.service.SucesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suceso")
public class SucesoRest implements IRest <SucesoDTO> {
    SucesoService sucesoService;

    public SucesoRest() {
    }

    public SucesoRest (SucesoService sucesoService) {
        this.sucesoService = sucesoService;
    }
    @Autowired
    public void setSucesoService(SucesoService sucesoService) {
        this.sucesoService = sucesoService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody SucesoDTO sucesoDTO) {
        sucesoService.addToCollection(sucesoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody SucesoDTO sucesoDTO) {
        sucesoService.updateCollection(sucesoDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<SucesoDTO>> getAll() {
        return ResponseEntity.ok(sucesoService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<SucesoDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(sucesoService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        sucesoService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
