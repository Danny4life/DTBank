package com.osiki.demobankapp.service;

import com.osiki.demobankapp.dto.TransactionDto;
import com.osiki.demobankapp.entity.Transaction;

public interface TransactionService {

    void saveTransaction(TransactionDto transactionDto);
}
