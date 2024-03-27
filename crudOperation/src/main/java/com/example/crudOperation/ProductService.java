package com.example.crudOperation;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList = new ArrayList<>();
    private long idCounter = 1;

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(Long id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; // Or throw an exception
    }

    public Product saveOrUpdateProduct(Product product) {
        if (product.getId() == null) {
            product.setId(idCounter++);
            productList.add(product);
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId().equals(product.getId())) {
                    productList.set(i, product);
                    break;
                }
            }
        }
        return product;
    }

    public void deleteProduct(Long id) {
        productList.removeIf(product -> product.getId().equals(id));
    }
}