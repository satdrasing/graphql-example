package com.satendra.graphqlpoc.dao;

import com.satendra.graphqlpoc.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderItem, Integer> {
}
