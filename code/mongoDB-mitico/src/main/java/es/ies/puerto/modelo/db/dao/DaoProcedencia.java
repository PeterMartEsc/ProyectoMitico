package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.abstractas.DaoEntityAbstract;
import es.ies.puerto.modelo.db.interfaces.IDao;
import es.ies.puerto.modelo.impl.Procedencia;

import javax.persistence.EntityManagerFactory;

public class DaoProcedencia extends DaoEntityAbstract implements IDao {
    public DaoProcedencia(EntityManagerFactory emf) {
        super(emf);
    }

    /*
    @Override
    public List getAll() {
    }
     */

    @Override
    public Object getById(int id) {
        Procedencia procedencia = new Procedencia(id);
        return getEm().find(Procedencia.class,procedencia.getId());
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
        Procedencia procedencia = new Procedencia(id);
        try {
            getEm().getTransaction().begin();
            getEm().remove(procedencia);
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
