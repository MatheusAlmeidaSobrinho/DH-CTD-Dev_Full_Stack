package com.example.CTDCommerceProf.repository;

import com.example.CTDCommerceProf.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Integer> {
    //Hibernate
    List<ProductEntity> findByCategoryName(String name);

    //HQL
    @Query("FROM ProductEntity p WHERE p.category.name = :name")
    List<ProductEntity> getByNameCategory(String name);

    //SQL Native
    @Query(value = "SELECT * FROM Products p JOIN Categories c ON p.category_id = c.id " +
            "WHERE c.name = :name", nativeQuery = true)
    List<ProductEntity> getByNameCategorySQL(String name);
}
