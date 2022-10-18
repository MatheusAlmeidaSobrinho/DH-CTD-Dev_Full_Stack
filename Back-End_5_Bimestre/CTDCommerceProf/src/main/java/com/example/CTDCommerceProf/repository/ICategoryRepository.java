package com.example.CTDCommerceProf.repository;

import com.example.CTDCommerceProf.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    //Hibernate
    CategoryEntity findByName(String name);

    //HQL
    @Query("FROM CategoryEntity c where c.name = :name")
    CategoryEntity getByName(String name);

    //SQL Native
    @Query(value = "SELECT * FROM Categories c WHERE c.name = :name", nativeQuery = true)
    CategoryEntity getByNameSQL(String name);
}
