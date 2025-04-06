package com.shopdemo.springbootstart.transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	public List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<>();
		transactionRepository.findAll().forEach(transactions::add);
		return transactions;
	}

	public Optional<Transaction> getTransactionById(String transactionId) {
		return transactionRepository.findById(transactionId);
	}

	public void addTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}

}
