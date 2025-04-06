package com.shopdemo.springbootstart.transactions;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/transactions")
	public List<Transaction> getAllTransactions(){
		return transactionService.getAllTransactions();
	}
	
	@GetMapping("/transaction/{transactionId}")
	public Optional<Transaction> getTransactionById(@PathVariable String transactionId) {
		return transactionService.getTransactionById(transactionId);
	}
	
	@PostMapping("/transaction")
	public void addTransaction(Transaction transaction) {
		transactionService.addTransaction(transaction);
	}

}
