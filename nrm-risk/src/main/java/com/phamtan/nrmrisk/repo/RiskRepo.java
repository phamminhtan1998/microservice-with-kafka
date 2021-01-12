package com.phamtan.nrmrisk.repo;

import com.phamtan.nrmrisk.entity.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RiskRepo extends JpaRepository<Risk,String> {
    List<Risk> findAllByIdSenderAndTransactionDateGreaterThanAndMethod(String idSender, Date date,String method );
}
