package pl.edu.vistula.task2.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.vistula.task2.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}