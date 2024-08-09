package gr.carcompany.reposotories;

import java.util.List;
import java.util.Optional;

public interface Repository<T, K> {
    Optional<T> findById(K k);
    List<T> findAll();
    Optional<T> save(T t);
    boolean deleteById(K k);
}
