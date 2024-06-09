package es.ies.puerto.modelo.db.interfaces;

import es.ies.puerto.modelo.impl.Dios;

import java.util.List;

public interface IDao <T> {
    /*
    public List<T> getAll();
     */
    public T getById(int id);
    public boolean addElement(T t);
    public void deleteElement(int id);
    public boolean updateElement(T t);
}
