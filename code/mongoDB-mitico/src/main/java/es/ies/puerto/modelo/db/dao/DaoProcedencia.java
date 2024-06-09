package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Procedencia;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DaoProcedencia extends MongoRepository<Procedencia, Integer> {

}
