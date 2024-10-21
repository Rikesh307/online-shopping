package com.riyaindustries.shopping.online_shopping.repository;

//import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.riyaindustries.shopping.online_shopping.model.Product; // Ensure this import is correct
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Add custom query methods if needed
    List<Product> findByNameContainingIgnoreCase(String name);
}
