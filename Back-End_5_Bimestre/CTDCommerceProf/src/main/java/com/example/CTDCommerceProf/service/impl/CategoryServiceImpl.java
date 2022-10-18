package com.example.CTDCommerceProf.service.impl;

import com.example.CTDCommerceProf.entity.CategoryEntity;
import com.example.CTDCommerceProf.entity.ProductEntity;
import com.example.CTDCommerceProf.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf.entity.dto.ProductDTO;
import com.example.CTDCommerceProf.repository.ICategoryRepository;
import com.example.CTDCommerceProf.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICommerceService<CategoryDTO> {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        categoryEntity = categoryRepository.save(categoryEntity);
        categoryDTO = new CategoryDTO(categoryEntity);
        return categoryDTO;
    }

    @Override
    public CategoryDTO getById(int id) {
        CategoryEntity category = categoryRepository.findById(id).get();
        return new CategoryDTO(category);
    }

    public List<ProductDTO> getProductsByCat(int id) {
        CategoryEntity category = categoryRepository.findById(id).get();
        List<ProductEntity> productEntities = category.getProductEntities();

        return null;
    }

    @Override
    public List<CategoryDTO> getAll() {
        return null;
    }

    @Override
    public String delete(int id) {
        categoryRepository.deleteById(id);
        return "Deletado com sucesso";
    }

    @Override
    public CategoryDTO update(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        categoryRepository.saveAndFlush(categoryEntity);
        return categoryDTO;
    }

    public boolean ifCategoryExists(int id) {
        return categoryRepository.existsById(id);
    }

    public CategoryDTO getByName(String name) {
        CategoryEntity category = categoryRepository.getByNameSQL(name);
        CategoryDTO categoryDTO = new CategoryDTO(category);
        return categoryDTO;
    }
}
