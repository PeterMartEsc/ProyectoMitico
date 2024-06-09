package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Procedencia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoProcedencia extends MongoRepository<Procedencia, Integer> {

}
