package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Suceso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoSuceso extends MongoRepository<Suceso, Integer> {

}
