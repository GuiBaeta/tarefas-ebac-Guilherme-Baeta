package br.com.gbaeta.vendas.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@RefreshScope
@EnableMongoRepositories(basePackages = "br.com.gbaeta.vendas.online.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProdutoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}

}
