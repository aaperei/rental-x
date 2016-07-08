package com.rentalx.account.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/customer")
public class CustomerController {

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public void testController() {
		System.out.println("Controller funfou");
	}

}
