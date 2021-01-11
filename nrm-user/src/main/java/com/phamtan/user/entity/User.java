package com.phamtan.user.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class User {
    private String id;
    private String username;
    private String password;
    private Date dob;
    private String fullName;
    private String tempPassword;
    private boolean isLocked;
    private String email;

}
