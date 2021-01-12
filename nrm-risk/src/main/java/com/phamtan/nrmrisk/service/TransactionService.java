package com.phamtan.nrmrisk.service;

import com.phamtan.nrmrisk.entity.Transaction;
import com.phamtan.nrmrisk.repo.TransactionRepo;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private TransactionRepo transactionRepo;

    public TransactionService(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }
    public Transaction save(Transaction transaction){
        return transactionRepo.save(transaction);

    }
}
