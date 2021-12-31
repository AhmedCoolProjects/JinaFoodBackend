package me.ahmedbargady.jinafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JinafoodbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JinafoodbackendApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(CustomerRepository customerRepository) {
	// return args -> {
	// Customer customer = new Customer("Ahmed", "Bargady",
	// "ahmed.bargady@esi.ac.ma", "0672628744", Gender.Male);
	// customerRepository.insert(customer);
	// };
	// }

}
