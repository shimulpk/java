
package pos.service;

import java.util.List;


public interface DaoService<E> {
    void save(E e);
    List<E> findAll();
    void update(E e);
    E findByID(int id);
    void delete(int id);
    
}
