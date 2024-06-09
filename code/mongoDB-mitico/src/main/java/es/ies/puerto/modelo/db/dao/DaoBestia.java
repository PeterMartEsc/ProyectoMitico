package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.abstractas.DaoEntityAbstract;
import es.ies.puerto.modelo.db.interfaces.IDao;
import es.ies.puerto.modelo.impl.Bestia;

import javax.persistence.EntityManagerFactory;

public class DaoBestia extends DaoEntityAbstract implements IDao {
    public DaoBestia(EntityManagerFactory emf) {
        super(emf);
    }

    /*
    @Override
    public List getAll() {
    }
     */

    @Override
    public Object getById(int id) {
        Bestia bestia = new Bestia(id);
        return getEm().find(Bestia.class,bestia.getId());
    }

    @Override
    public boolean addElement(Object o) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(o);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public void deleteElement(int id) {
        Bestia bestia = new Bestia(id);
        try {
            getEm().getTransaction().begin();
            getEm().remove(bestia);
            getEm().getTransaction().commit();
        }catch (Exception exception){
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public boolean updateElement(Object o) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(o);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }
}