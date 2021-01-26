package com.progastination.entity;

import com.progastination.dto.ProducerDto;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

// todo add unit
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Table(name = "products")
@Data
@Entity
@EqualsAndHashCode
@ToString
public class Product {
    @Id
    private String ean;
    private String categoryId;
    private String image;
    private String title;
    private String webUrl;
    private Integer weight;
    private String unit;
    private String shop;
    @ManyToOne
    private Category category; // parentCategoryId

    private Double price;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private ProducerDto producer;
}