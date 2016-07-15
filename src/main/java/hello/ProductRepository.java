package hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Walla on 15/07/2016.
 */
public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findByName(String name);
}
