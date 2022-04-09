package com.example.miniavito.ws;


import com.example.miniavito.bean.User;
import com.example.miniavito.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserRest {
    @GetMapping("/login/{login}")
    public User findByLogin(@PathVariable String login) {
        return userService.findByLogin(login);
    }
    @GetMapping("/ref/{ref}")
    public User findByRef(@PathVariable String ref) {
        return userService.findByRef(ref);
    }
    @GetMapping("/prof/{prof}")
    public List<User> findByProf(@PathVariable boolean prof) {
        return userService.findByProf(prof);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }
    @PostMapping("/save")
    public int save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/count")
    public long count() {
        return userService.count();
    }
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return userService.deleteByRef(ref);
    }
     @PostMapping("/login")
    public int seConnecter(@RequestBody User user) {
        return userService.seConnecter( user);
    }
     @PutMapping("/bloquer/login/{login}")
    public int bloquer(@PathVariable String login) {
        return userService.bloquer(login);
    }
    @PutMapping("/debloquer/login/{login}")
    public int debloquer(@PathVariable String login) {
        return userService.debloquer(login);
    }

    @Autowired
    private UserServiceImpl userService;

}
