package com.phamtan.user.repo;

import com.phamtan.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    User findByEmail(String email);
    User findByEmailAndTempPassword(String email,String tempPassword);
}
