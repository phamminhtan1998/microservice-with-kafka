package com.phamtan.nrmrisk.repo;

import com.phamtan.nrmrisk.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,String> {
}
