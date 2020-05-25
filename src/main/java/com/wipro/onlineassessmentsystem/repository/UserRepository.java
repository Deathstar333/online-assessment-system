package com.wipro.onlineassessmentsystem.repository;

import com.wipro.onlineassessmentsystem.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
