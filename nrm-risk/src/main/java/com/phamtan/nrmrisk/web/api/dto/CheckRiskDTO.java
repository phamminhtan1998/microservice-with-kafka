package com.phamtan.nrmrisk.web.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckRiskDTO {
    private String username;
    private int amount ;
    private Date transactionDate ;
    private String method;
    private String senderName;
    private String recvName;
    private String idSender;
    private String idRecv ;
}
