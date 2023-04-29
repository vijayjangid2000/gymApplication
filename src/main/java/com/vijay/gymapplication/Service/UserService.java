package com.vijay.gymapplication.Service;

import com.vijay.gymapplication.Entity.User;
import com.vijay.gymapplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    // this is interface so no initialize
    UserRepository userRepository;


    public UserService(UserRepository customersRepository) {
        this.userRepository = customersRepository;
    }

    public List<User> searchById(ArrayList<Long> list) {
        return userRepository.getUser(list);
    }


}
