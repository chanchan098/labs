package com.example.elasticsearch.repository;


import com.example.elasticsearch.bean.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Pratik Das
 *
 */
@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findByName(String name);

    List<Product> findByNameContaining(String name);

    List<Product> findByManufacturerAndCategory(String manufacturer,String category);
}
