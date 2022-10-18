package com.example.CTDCommerceProf.validacoes;

import com.example.CTDCommerceProf.entity.dto.ProductDTO;

public class ValidationProduct {

    public String validationProductVariables(ProductDTO productDTO) {
        if (productDTO.getTitle() == null) {
            return "Title não preenchido";
        } else if (productDTO.getPrice() <= 0) {
            return "Preço com erro ou não preenchido";
        }

        return null;
    }
}
