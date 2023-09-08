package com.osiki.demobankapp.service.impl;

import com.osiki.demobankapp.dto.TransactionDto;
import com.osiki.demobankapp.entity.Transaction;
import com.osiki.demobankapp.repository.TransactionRepository;
import com.osiki.demobankapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {

        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transaction);


        System.out.println("Transaction save successfully");

    }
}
