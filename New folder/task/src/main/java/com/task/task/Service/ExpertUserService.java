package com.task.task.Service;

import com.task.task.Entity.Queries;
import com.task.task.Entity.User;

import java.util.List;

public interface ExpertUserService {
    public User insert(User user);
    public List<User> getAllUser();
    public Queries addQuery(String queries, Long userId);

    public User getById(Long id);

}
