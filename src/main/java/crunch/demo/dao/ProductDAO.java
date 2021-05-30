package crunch.demo.dao;


import crunch.demo.entity.ProductEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class ProductDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void createProduct(ProductEntity product) {
        entityManager.persist(product);
    }
}
