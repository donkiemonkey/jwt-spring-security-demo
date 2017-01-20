package org.zerhusen.security.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zerhusen.model.security.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
