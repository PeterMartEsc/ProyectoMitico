package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Suceso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DaoSuceso extends MongoRepository<Suceso, Integer> {

}
