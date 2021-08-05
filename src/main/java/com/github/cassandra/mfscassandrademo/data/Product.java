package com.github.cassandra.mfscassandrademo.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Getter
@Setter
public class Product {
    @PrimaryKey
    String productid;
    String productname;
    String title;
    String brand;
    String publisher;
    int length;
    int height;
    int breadth;
}
