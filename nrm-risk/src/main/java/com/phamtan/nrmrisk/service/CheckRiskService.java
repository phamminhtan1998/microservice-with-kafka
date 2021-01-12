package com.phamtan.nrmrisk.service;

import com.phamtan.nrmrisk.entity.Risk;
import com.phamtan.nrmrisk.repo.RiskRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class CheckRiskService {
    private RiskRepo riskRepo ;

    public CheckRiskService(RiskRepo riskRepo) {
        this.riskRepo = riskRepo;
    }
    public void check(String idSender, String method, Date date){
        int totalAmount = 0;
        try {
            List<Risk> res = riskRepo.findAllByIdSenderAndTransactionDateGreaterThanAndMethod(idSender, date, method);
            for(Risk risk : res){
                totalAmount+=risk.getAmount();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
