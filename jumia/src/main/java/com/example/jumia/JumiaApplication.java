package com.example.jumia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.jumia.entities.Customer;
import com.example.jumia.service.CustomerService;

@SpringBootApplication
public class JumiaApplication implements CommandLineRunner{

	@Autowired
	private CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(JumiaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Teste");
		/*
		try {
			home();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		*/
	}
	/*
	private void home() {
		for(Customer customer: customerService.findAll()) {
			System.out.println("id: " + customer.getId());
			System.out.println("Name: " + customer.getName());
			System.out.println("Phone: " + customer.getPhone());
			System.out.println("===============");
		}
	}
	*/

}
