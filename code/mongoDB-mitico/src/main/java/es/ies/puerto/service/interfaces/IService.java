package es.ies.puerto.service.interfaces;

import java.util.List;

/**
 * Interfaz con todos los metodos utilizados por las clases Service
 * @param <T> es la clase Template que expresa cualquiere tipo de clase
 */
public interface IService <T> {

    public List<T> getAllFromCollection();

    public T getByIdFromCollection(int id);

    public void addOrUpdateCollection(T t);

    public void deleteFromCollection(int id);

}
