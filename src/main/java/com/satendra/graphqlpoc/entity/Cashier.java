package com.satendra.graphqlpoc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Cashier {

    @Id
    @Column(name = "cashier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cashierName;

    private String cashierGrade;

    @OneToMany(mappedBy = "cashier", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

}
