package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Dios;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoDios extends MongoRepository<Dios, Integer> {

}
