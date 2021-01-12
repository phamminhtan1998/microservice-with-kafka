package com.phamtan.nrmrisk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "transaction")
@Table()
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int amount ;
    private Date transactionDate ;
    private String method;
    private String senderName;
    private String recvName;
    private String idSender;
    private String idRecv ;
}
