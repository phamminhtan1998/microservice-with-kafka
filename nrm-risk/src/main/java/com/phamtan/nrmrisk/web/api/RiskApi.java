package com.phamtan.nrmrisk.web.api;

import com.phamtan.nrmrisk.entity.Transaction;
import com.phamtan.nrmrisk.service.CheckRiskService;
import com.phamtan.nrmrisk.service.TransactionService;
import com.phamtan.nrmrisk.web.api.dto.CheckRiskDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskApi {

    private CheckRiskService checkRiskService;
    private TransactionService transactionService ;

    public RiskApi(CheckRiskService checkRiskService, TransactionService transactionService) {
        this.checkRiskService = checkRiskService;
        this.transactionService = transactionService;
    }

    @PostMapping("/")
    public String checkRisk(@RequestBody Transaction transaction){
        transactionService.save(transaction);
        checkRiskService.check(transaction.getIdSender(),transaction.getMethod(),transaction.getTransactionDate());
        return "";
    }
}
