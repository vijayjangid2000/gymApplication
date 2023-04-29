package com.vijay.gymapplication.Controller;

import com.vijay.gymapplication.Entity.User;
import com.vijay.gymapplication.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getCustomers")
    public ResponseEntity<String> getCustomers() {

        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(1L);
        List<User> list = userService.searchById(arrayList);

        return new ResponseEntity<>(list.toString(), HttpStatus.ACCEPTED);

    }

}