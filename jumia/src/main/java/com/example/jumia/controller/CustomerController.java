package com.example.jumia.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jumia.entities.Customer;
import com.example.jumia.entities.NewCustomer;
import com.example.jumia.service.CustomerService;


@Controller
public class CustomerController {
	
	List<NewCustomer> list = new ArrayList<NewCustomer>();
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("index")
	public Iterable<Customer> home() {
	
		/*
			for(Customer customer: customerService.findAll()) {
				
				System.out.println(verify(customer));
				list.add(verify(customer));

			}
			*/
			return customerService.findAll();
		
	}

	
	private NewCustomer verify(Customer customer){
		
		
		String phone = customer.getPhone();
		
		String[] aux = phone.split(" ", 2); 
		aux[0] = aux[0].replace("(", "").replace(")","");
		String country = "";
		String regex = "";
		Boolean valid = true;
		switch (aux[0]) {
		case "237":
			regex = "^\\(237\\)\\ ?[2368]\\d{7,8}$";
			valid = verifyPhone(regex, phone);
			country ="Cameroon";
			break;
		case "251":
			regex = "\\(251\\)\\ ?[1-59]\\d{8}$";
			valid = verifyPhone(regex, phone);
			country ="Ethiopia";
			break;
		case "212":
			regex = "^\\(212\\)\\ ?[5-9]\\d{8}$";
			valid = verifyPhone(regex, phone);
			country ="Morocco";
			break;
		case "258":
			regex = "^\\(258\\)\\ ?[28]\\d{7,8}$";
			valid = verifyPhone(regex, phone);
			 country ="Mozambique";
			 break;
		case "256":
			regex = "^\\(256\\)\\ ?\\d{9}$";
			valid = verifyPhone(regex, phone);
			 country = "Uganda";
			break;
		default:
			country = " ";
			valid = false;
			break;
		}
		
		NewCustomer newCustomer = new NewCustomer(customer.getName(), customer.getPhone(), country, valid);
		
		//System.out.println("Customer "+ newCustomer);
		
		return newCustomer;
		
	}
	
	private Boolean verifyPhone(String regex, String phone) {

		if(Pattern.compile(regex).matcher(phone).matches()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
