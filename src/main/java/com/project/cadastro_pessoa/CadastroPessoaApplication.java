package com.project.cadastro_pessoa;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.openmbean.OpenMBeanAttributeInfo;

@SpringBootApplication
public class CadastroPessoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroPessoaApplication.class, args);
	}

	/**
	 * A partir da configuração abaixo será possível trabalhar com swagger e realizar os testes pelo navegador
	 * https:// .../cadastro_pessoa/swagger-ui.html
	 * **/

	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI().info(new Info()
				.title("")
				.version("1.0")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://sprindoc.org")));
	}

}
