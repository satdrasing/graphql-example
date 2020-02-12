package com.satendra.graphqlpoc.dao;

import com.satendra.graphqlpoc.entity.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashierRepository extends JpaRepository<Cashier, Integer> {
}
