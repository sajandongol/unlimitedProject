package com.task.task.Service.impl;

import com.task.task.Entity.Queries;
import com.task.task.Entity.User;
import com.task.task.Repository.QueryRepository;
import com.task.task.Repository.UserRepository;
import com.task.task.Service.ExpertUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ExpertUserService{

    private UserRepository userRepository;
    private QueryRepository queryRepository;

    public ServiceImpl(UserRepository userRepository, QueryRepository queryRepository) {
        this.userRepository = userRepository;
        this.queryRepository = queryRepository;
    }

    @Override
    public User insert(User user) {
    User user1 = userRepository.save(user);
    return user1;
    }

    @Override
    public List<User> getAllUser() {
        return  userRepository.findAll();
    }

    @Override
    public Queries addQuery(String queries, Long userId) {
        Queries queries1 = new Queries();
        queries1.setQueries(queries);
        queries1.setUserId(userId);
        queryRepository.save(queries1);
        return queries1;
    }

    @Override
    public User getById(Long id) {
            return null;
        }
    }



