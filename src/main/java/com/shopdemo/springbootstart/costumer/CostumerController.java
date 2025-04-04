package com.shopdemo.springbootstart.costumer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CostumerController {

	@GetMapping("/customers")
	public List<Costumer> getAllCostumers() {
		return null;
	}
}
