package com.satendra.graphqlpoc;

import com.satendra.graphqlpoc.dao.CashierRepository;
import com.satendra.graphqlpoc.dao.OrderRepository;
import com.satendra.graphqlpoc.entity.Cashier;
import com.satendra.graphqlpoc.entity.OrderItem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GraphqlPocApplication {


	public static void main(String[] args) {
		SpringApplication.run(GraphqlPocApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(CashierRepository cashierRepository) {

		return args -> {


			Cashier c = new Cashier();
			c.setCashierName("satendra");
			c.setCashierGrade("A");

			OrderItem orderItem0 = new OrderItem();
			orderItem0.setOrderAmount(500);
			orderItem0.setOderDate(LocalDate.now());
			orderItem0.setCashier(c);

			List<OrderItem> orderItems = new ArrayList<>();
			orderItems.add(orderItem0);

			c.setOrderItems(orderItems);

			cashierRepository.save(c);
		};


	}
}
