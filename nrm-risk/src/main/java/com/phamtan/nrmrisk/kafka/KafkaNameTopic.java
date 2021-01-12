package com.phamtan.nrmrisk.kafka;

public enum KafkaNameTopic {
    CREATE_USER_TOPIC("create-user-topic"),
    TRANSACTION_TOPIC("transaction-topic"),
    FORGET_PASSWORD_USER_TOPIC("forget-password-topic"),
    ;
    private final String name ;

    KafkaNameTopic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
