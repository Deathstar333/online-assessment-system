package com.wipro.onlineassessmentsystem.service;

import com.wipro.onlineassessmentsystem.model.TestResult;
import com.wipro.onlineassessmentsystem.model.User;
import com.wipro.onlineassessmentsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        Collections.sort(users, new userComp());
        return users;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        Optional<User> user = userRepository.findById(email);
        if(user.isPresent()) return user.get();
        return null;
    }

    private class userComp implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

}
