package jp.qilab.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration
// @ComponentScan
// @EnableAutoConfiguration
// 下の一つのアノテーションで、上の三つのアノテーションを含む
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
