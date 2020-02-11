package com.satendra.graphqlpoc;

import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPocApplication.class, args);
	}

}
