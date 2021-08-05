package com.github.cassandra.mfscassandrademo.repository;

import com.github.cassandra.mfscassandrademo.data.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product,String> {
}
