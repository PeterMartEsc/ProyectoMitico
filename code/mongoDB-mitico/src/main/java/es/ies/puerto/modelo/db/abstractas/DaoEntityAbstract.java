package es.ies.puerto.modelo.db.abstractas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class DaoEntityAbstract {

    EntityManager em;

    EntityManagerFactory emf;

    public DaoEntityAbstract(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
