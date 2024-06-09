package es.ies.puerto.rest.interfaces;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IRest <T> {
    public ResponseEntity<List<T>> getAll();
    public ResponseEntity<T> getById(int id);
    public ResponseEntity add(T t);
    public ResponseEntity delete(int id);
    public ResponseEntity update(T t);
}
