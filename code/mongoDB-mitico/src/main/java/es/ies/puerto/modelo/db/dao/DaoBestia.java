package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.impl.Bestia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoBestia extends MongoRepository<Bestia, Integer> {

}
